package pl.patryk.apka.entity;

import org.springframework.data.annotation.CreatedDate;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Objects;

@Entity
@Table(name = "NOTE")
public class Noteentity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;

    @Column(name = "IMPORTANCE")
    @Enumerated(value = EnumType.ORDINAL)
    private  Importance importance;

    @Column(name = "note")
    private String note;

    @Column(name = "CREATED_AT")
    private LocalDateTime createdAt;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Importance getImportance() {
        return importance;
    }

    public void setImportance(Importance importance) {
        this.importance = importance;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }


    public Noteentity(Importance importance, String note, LocalDateTime createdAt) {
        this.importance = importance;
        this.note = note;
        this.createdAt = createdAt;
    }

    public Noteentity() {

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Noteentity that = (Noteentity) o;
        return Objects.equals(id, that.id) &&
                importance == that.importance &&
                Objects.equals(note, that.note) &&
                Objects.equals(createdAt, that.createdAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, importance, note, createdAt);
    }

    @Override
    public String toString() {
        return "Noteentity{" +
                "id=" + id +
                ", importance=" + importance +
                ", note='" + note + '\'' +
                ", createdAt=" + createdAt +
                '}';
    }
}
