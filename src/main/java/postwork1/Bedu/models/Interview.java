package postwork1.Bedu.models;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name ="Interview")
public class Interview {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    private Candidate candidate;
    @OneToOne
    private Interviewer interviewer;
    @OneToOne
    private InterviewType interviewType;
    @OneToOne
    private Technology technology;
    @OneToOne
    private Discipline discipline;

   //GetterAndSetter


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Candidate getCandidate() {
        return candidate;
    }

    public void setCandidate(Candidate candidate) {
        this.candidate = candidate;
    }

    public Interviewer getInterviewer() {
        return interviewer;
    }

    public void setInterviewer(Interviewer interviewer) {
        this.interviewer = interviewer;
    }

    public InterviewType getInterviewType() {
        return interviewType;
    }

    public void setInterviewType(InterviewType interviewType) {
        this.interviewType = interviewType;
    }

    public Technology getTechnology() {
        return technology;
    }

    public void setTechnology(Technology technology) {
        this.technology = technology;
    }

    public Discipline getDiscipline() {
        return discipline;
    }

    public void setDiscipline(Discipline discipline)
    {
        this.discipline = discipline;
    }
    //Constructor


    public Interview(Integer id, Candidate candidate, Interviewer interviewer, InterviewType interviewType, Technology technology, Discipline discipline) {
        this.id = id;
        this.candidate = candidate;
        this.interviewer = interviewer;
        this.interviewType = interviewType;
        this.technology = technology;
        this.discipline = discipline;
    }

    //ToString


    @Override
    public String toString() {
        return "Interview{" +
                "id=" + id +
                ", candidate=" + candidate +
                ", interviewer=" + interviewer +
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
        return Objects.equals(id, interview.id) && Objects.equals(candidate, interview.candidate) && Objects.equals(interviewer, interview.interviewer) && Objects.equals(interviewType, interview.interviewType) && Objects.equals(technology, interview.technology) && Objects.equals(discipline, interview.discipline);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, candidate, interviewer, interviewType, technology, discipline);
    }
}
