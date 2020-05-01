package pl.patryk.apka.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import pl.patryk.apka.entity.Noteentity;
import pl.patryk.apka.infrastucture.EntityNotFoundException;
import pl.patryk.apka.model.NoteModel;
import pl.patryk.apka.repositories.NoteEntityRepository;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;


@Service
public class NoteEntityService {

    private static  final Logger logger = LoggerFactory.getLogger(NoteEntityService.class);

    private final NoteEntityRepository noteEntityRepository;

    public NoteEntityService(NoteEntityRepository noteEntityRepository){
        this.noteEntityRepository=noteEntityRepository;

    }


    public NoteModel create(NoteModel noteModel) {
        Noteentity noteentity = new Noteentity(
                noteModel.getImportance(),
                noteModel.getNote(),
                LocalDateTime.now()
        );

    noteentity = noteEntityRepository.save(noteentity);

   return fromEntity(noteentity);

    }




    public NoteModel get(Long id) {

       logger.info("Pobrano wartosci: ");
    return noteEntityRepository.findById(id)
            .map(this::fromEntity)
            .orElseThrow(() -> new EntityNotFoundException("nie znaleziono notatki o id:" +id));



    }
private  NoteModel fromEntity(Noteentity noteentity)
{
    return new NoteModel(
            noteentity.getId(),
            noteentity.getImportance(),
            noteentity.getNote(),
            noteentity.getCreatedAt()
    );
}


    public List<NoteModel> findAll() {
        return noteEntityRepository.findAll().stream()
                .map(this::fromEntity)
                .collect(Collectors.toList());

    }
}
