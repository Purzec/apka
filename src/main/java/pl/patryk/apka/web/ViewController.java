package pl.patryk.apka.web;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.patryk.apka.model.Greeting;

@Controller
@RequestMapping(value = "/view")
public class ViewController {

    @GetMapping
    public String view(Model model) {
        model.addAttribute("greeting", new Greeting());
        return "formularz";
    }

    @PostMapping(value = "greeting")
    public String greetingSubmit(@ModelAttribute Greeting greeting)
    {
        return "formularz2";
    }




}
