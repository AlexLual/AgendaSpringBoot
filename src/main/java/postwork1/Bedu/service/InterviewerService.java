package postwork1.Bedu.service;


import postwork1.Bedu.models.Interviewer;

import java.util.List;

public interface InterviewerService {
    public List<Interviewer> ListarInterviewer();

    public Interviewer guardarInterviewer(Interviewer interviewer);

    public Interviewer obtenerInterviewerPorId(Integer id);
    public Interviewer actualizaInterviewer(Interviewer interviewer);
    public void eliminarInterviewer(Integer id);
}
