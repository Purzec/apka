package pl.patryk.apka.web;



import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;
import pl.patryk.apka.model.NoteModel;
import pl.patryk.apka.services.NoteEntityService;

@RestController
@RequestMapping(value = "/note")
public class NoteRestController {
    private static final Logger logger = LoggerFactory.getLogger(NoteRestController.class);


    private final NoteEntityService noteEntityService;


    public NoteRestController(NoteEntityService noteEntityService) {
        this.noteEntityService = noteEntityService;
    }



    @PostMapping(value = "", consumes = "application/json",produces = "application/json")
    public NoteModel createdNote(@RequestBody NoteModel noteModel){
        System.out.println("program tworzy");
        logger.info("Creating note model");
        return noteEntityService.create(noteModel);
    }



    @GetMapping(value = "/{id}",produces = "application/json")
    public NoteModel getNote(@PathVariable("id") Long id){
        System.out.println("program czyta");
        logger.info("Getiing note");
        return noteEntityService.get(id);

    }
}
