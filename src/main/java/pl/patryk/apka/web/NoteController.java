package pl.patryk.apka.web;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import pl.patryk.apka.entity.Importance;
import pl.patryk.apka.model.Greeting;
import pl.patryk.apka.model.NoteModel;
import pl.patryk.apka.services.NoteEntityService;

@Controller
@RequestMapping("/note")
public class NoteController {

    @Autowired
    private  NoteEntityService noteEntityService;

    public NoteController(NoteEntityService noteEntityService){
        this.noteEntityService= noteEntityService;
    }


    @GetMapping()
    public  String getNoteView(Model model)
    {

   model.addAttribute("notes",new NoteModel());

        System.out.println("pierwsze wejscie");

        return  "noteview";
    }

    @PostMapping(value = "notes")
    public  String setNoteView(@ModelAttribute NoteModel noteModel)
    {
        //model.addAttribute("obiekt", noteEntityService.toString());
        System.out.println("program wszedl tutaj");

        return  "formularz";
    }






}
