package pl.patryk.apka.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import pl.patryk.apka.entity.Importance;

import java.time.LocalDateTime;
import java.util.Objects;
@JsonIgnoreProperties(ignoreUnknown = true)
public class NoteModel {

    public Long id;
    public Importance importance;
    public String note;
    public LocalDateTime created_at;

    @JsonCreator
    public NoteModel(

            @JsonProperty("id") Long id,
            @JsonProperty("importance")  Importance importance,
            @JsonProperty("note") String note,
            @JsonProperty("created_at") LocalDateTime created_at) {
        this.id = id;
        this.importance = importance;
        this.note = note;
        this.created_at = created_at;
    }

    public Long getId() {
        return id;
    }

    public Importance getImportance() {
        return importance;
    }

    public String getNote() {
        return note;
    }

    public LocalDateTime getCreated_at() {
        return created_at;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NoteModel noteModel = (NoteModel) o;
        return Objects.equals(id, noteModel.id) &&
                importance == noteModel.importance &&
                Objects.equals(note, noteModel.note) &&
                Objects.equals(created_at, noteModel.created_at);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, importance, note, created_at);
    }

    @Override
    public String toString() {
        return "NoteModel{" +
                "id=" + id +
                ", importance=" + importance +
                ", note='" + note + '\'' +
                ", created_at=" + created_at +
                '}';
    }

    public NoteModel() {
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setImportance(Importance importance) {
        this.importance = importance;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public void setCreated_at(LocalDateTime created_at) {
        this.created_at = created_at;
    }


}
