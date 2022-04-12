package application.controllers;

import org.sprinframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import application.repositories.LivroRepository;
import org.springframework.ui.Model;

@Controller
@RequestMapping("/livro")
public class LivroController {
@Autowired
private LivroRespository livrosRepo;
    @RequestMapping("/list")
    public String list(Model model){
        model.addAttribute("livros", livrosRepo.findAll());
        return "list.jsp";
    }

public String listar(){
    return "livro/list.jsp";
}

}