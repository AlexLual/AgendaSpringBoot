package postwork1.Bedu.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Objects;

@Entity
@Table(name ="Interview")
@Getter
@Setter
public class Interview {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    private Usuario usuario;

    @OneToOne
    private InterviewType interviewType;
    @OneToOne
    private Technology technology;
    @OneToOne
    private Discipline discipline;

   //GetterAndSetter



    //Constructor


    public Interview() {
    }

    public Interview(Integer id, Usuario usuario, InterviewType interviewType, Technology technology, Discipline discipline) {
        this.id = id;
        this.usuario = usuario;
        this.interviewType = interviewType;
        this.technology = technology;
        this.discipline = discipline;
    }

    //ToString


    @Override
    public String toString() {
        return "Interview{" +
                "id=" + id +
                ", candidate=" + usuario +
                ", interviewType=" + interviewType +
                ", technology=" + technology +
                ", discipline=" + discipline +
                '}';
    }
    //Equal


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Interview interview = (Interview) o;
        return Objects.equals(id, interview.id) && Objects.equals(usuario, interview.usuario) && Objects.equals(interviewType, interview.interviewType) && Objects.equals(technology, interview.technology) && Objects.equals(discipline, interview.discipline);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, usuario,  interviewType, technology, discipline);
    }
}
