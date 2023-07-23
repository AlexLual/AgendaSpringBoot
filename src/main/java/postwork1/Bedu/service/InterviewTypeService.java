package postwork1.Bedu.service;

import postwork1.Bedu.models.InterviewType;
import postwork1.Bedu.models.Interviewer;

import java.util.List;

public interface InterviewTypeService {
    public List<InterviewType> ListarInterviewType();

    public InterviewType guardarInterviewType (InterviewType interviewType);

    public InterviewType obtenerInterviewTypePorId(Integer id);
    public InterviewType actualizaInterviewType(InterviewType interviewType);
    public void eliminarInterviewType(Integer id);
}
