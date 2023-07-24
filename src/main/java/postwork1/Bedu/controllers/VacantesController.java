package postwork1.Bedu.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import postwork1.Bedu.models.Technology;
import postwork1.Bedu.models.Usuario;
import postwork1.Bedu.service.TechnologyService;
import postwork1.Bedu.service.UploadFileService;

import java.io.IOException;
import java.util.Optional;


@Controller
@RequestMapping("/vacantes")
public class VacantesController {
    private static final Logger LOGGER = LoggerFactory.getLogger(VacantesController.class);
    @Autowired
    private TechnologyService technologyService;
    @Autowired
    UploadFileService upload;



    @GetMapping("")
    public  String show(Model model){
model.addAttribute("vacantes", technologyService.ListarTechnology());
    return "vacantes/show";
}
@GetMapping("/create")
    public String create(){
        return "vacantes/create";
}
@PostMapping("/save")
public String save(Technology technology,@RequestParam("img") MultipartFile file) throws IOException {
    LOGGER.info("Este es el objecto Technology{}", technology);
     Usuario u= new Usuario(1,"","","","");
      technology.setUsuario(u);
      //imagen
      if (technology.getId()==null){
          String nombreImagen= upload.saveImages(file);
          technology.setImagen(nombreImagen);

      }else {
      }


       technologyService.guardarTechnology(technology);
        return "redirect:/vacantes";
}

@GetMapping("/edit/{id}")
    public String edit(@PathVariable Integer id, Model model){
        Technology technology=new Technology();
        Optional<Technology> optionalTechnology=technologyService.get(id);
        technology=optionalTechnology.get();
        model.addAttribute("vacantes", technology);
return "vacantes/edit";
}
@PostMapping("/update")
    public String update(Technology technology,@RequestParam("img") MultipartFile file) throws IOException {
    Technology t =new Technology();
    t=technologyService.get(technology.getId()).get();

    if (file.isEmpty()){

        technology.setImagen(t.getImagen());
    }else {
        //Eliminar cuando no sea la imagen por defecto
        if (!t.getImagen().equals("default,jpg")){
            upload.deleteImages(t.getImagen());
        }
        String nombreImagen= upload.saveImages(file);
        technology.setImagen(nombreImagen);
    }
    technology.setUsuario(t.getUsuario());
        technologyService.actualizaTechnology(technology);
        return "redirect:/vacantes";
}
@GetMapping("/delete/{id}")
public String delete(@PathVariable Integer id){
        Technology t=new Technology();
        t=technologyService.get(id).get();
        //Eliminar cuando no sea la imagen por defecto
    if (!t.getImagen().equals("default,jpg")){
        upload.deleteImages(t.getImagen());

    }



        technologyService.eliminarTechnology(id);
        return "redirect:/vacantes";
}

}
