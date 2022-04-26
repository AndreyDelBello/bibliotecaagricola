package application.controllers;

import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;

@Controller
public class HomeController {
@RequestMapping(method = RequestMethod.GET)
public String index(){
    return "home/index.jsp";
}

}