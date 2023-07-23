package postwork1.Bedu.serviceImp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import postwork1.Bedu.models.InterviewType;

import postwork1.Bedu.repository.InterviewTypeRepository;
import postwork1.Bedu.service.InterviewTypeService;


import java.util.List;
@Service
public class InterviewTypeServiceImp implements InterviewTypeService {
    @Autowired
    private InterviewTypeRepository interviewTypeRepository;
    @Override
    public List<InterviewType> ListarInterviewType() {
        return interviewTypeRepository.findAll();
    }

    @Override
    public InterviewType guardarInterviewType(InterviewType interviewType) {
        return interviewTypeRepository.save(interviewType);
    }

    @Override
    public InterviewType obtenerInterviewTypePorId(Integer id) {
        return interviewTypeRepository.findById(id).get();
    }

    @Override
    public InterviewType actualizaInterviewType(InterviewType interviewType) {
        return interviewTypeRepository.save(interviewType);
    }


    @Override
    public void eliminarInterviewType(Integer id) {
interviewTypeRepository.deleteById(id);
    }
}
