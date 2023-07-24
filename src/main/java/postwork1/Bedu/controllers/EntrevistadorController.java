package postwork1.Bedu.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import postwork1.Bedu.models.Technology;
import postwork1.Bedu.service.TechnologyService;

import java.util.List;

@Controller
@RequestMapping("/entrevistador")
public class EntrevistadorController {
    @Autowired
    TechnologyService technologyService;


@GetMapping("")
    public String home(Model model){
    List<Technology> technologies=technologyService.ListarTechnology();
    model.addAttribute("vacantes", technologies);


        return "entrevistador/home";
    }



}
