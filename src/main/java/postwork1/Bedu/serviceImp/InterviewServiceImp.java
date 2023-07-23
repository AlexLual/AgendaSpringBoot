package postwork1.Bedu.serviceImp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import postwork1.Bedu.models.Interview;
import postwork1.Bedu.repository.InterviewRepository;
import postwork1.Bedu.service.InterviewService;

import java.util.List;
@Service
public class InterviewServiceImp implements InterviewService {
    @Autowired
    private InterviewRepository interviewRepository;

    @Override
    public List<Interview> ListarInterview() {
        return interviewRepository.findAll();
    }

    @Override
    public Interview guardarInterview(Interview interview) {
        return interviewRepository.save(interview);
    }

    @Override
    public Interview obtenerInterviewPorId(Integer id) {
        return interviewRepository.findById(id).get();
    }

    @Override
    public Interview actualizaInterview(Interview interview) {
        return interviewRepository.save(interview);
    }

    @Override
    public void eliminarInterview(Integer id) {
interviewRepository.deleteById(id);
    }
}
