package postwork1.Bedu.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import postwork1.Bedu.service.TechnologyService;

@Controller
@RequestMapping("/")
public class HomeController {
    @Autowired
    private TechnologyService technologyService;


@GetMapping("")
    public String home(Model model){
        model.addAttribute("vacantes",technologyService.ListarTechnology());

        return "usuario/home";

    }
@GetMapping("vacantehome/{id}")
    public String vacantehome(@PathVariable Integer id){

    return "usuario/vacantehome";

}
}
