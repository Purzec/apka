package pl.patryk.apka.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.patryk.apka.entity.Noteentity;

//interfejs

@Repository
public interface NoteEntityRepository extends JpaRepository<Noteentity,Long> {



}
