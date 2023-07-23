package postwork1.Bedu.serviceImp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import postwork1.Bedu.models.Interviewer;
import postwork1.Bedu.repository.InterviewerRepository;
import postwork1.Bedu.service.InterviewerService;

import java.util.List;
@Service

public class InterviewerServiceImp implements InterviewerService {

    @Autowired
    private InterviewerRepository interviewerRepository;

    @Override
    public List<Interviewer> ListarInterviewer() {
        return interviewerRepository.findAll();
    }

    @Override
    public Interviewer guardarInterviewer(Interviewer interviewer) {
        return interviewerRepository.save(interviewer);
    }

    @Override
    public Interviewer obtenerInterviewerPorId(Integer id) {
        return interviewerRepository.findById(id).get();
    }

    @Override
    public Interviewer actualizaInterviewer(Interviewer interviewer) {
        return interviewerRepository.save(interviewer);
    }

    @Override
    public void eliminarInterviewer(Integer id) {
interviewerRepository.deleteById(id);
    }
}
