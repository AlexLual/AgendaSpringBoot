package postwork1.Bedu.service;


import postwork1.Bedu.models.Interview;

import java.util.List;

public interface InterviewService {
    public List<Interview> ListarInterview();

    public Interview guardarInterview(Interview interview);

    public Interview obtenerInterviewPorId(Integer id);
    public Interview actualizaInterview(Interview interview);
    public void eliminarInterview(Integer id);
}
