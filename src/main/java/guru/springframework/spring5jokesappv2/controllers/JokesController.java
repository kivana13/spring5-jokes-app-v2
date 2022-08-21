package guru.springframework.spring5jokesappv2.controllers;

import guru.springframework.spring5jokesappv2.services.JokesServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokesController {

    private JokesServiceImpl jokesServiceImpl;

    public JokesController(JokesServiceImpl jokesServiceImpl) {
        this.jokesServiceImpl = jokesServiceImpl;
    }

    @RequestMapping({"/", ""})
    public String returnJoke(Model model) {

        String jokes = jokesServiceImpl.getJokesString();

        model.addAttribute("joke", jokes);

        return "jokes/index";
    }
}
