package pl.patryk.apka.web;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/main")
public class MainController {


    @RequestMapping(method = RequestMethod.GET)
    public String greet(){
        return "hello word";
    }
}
