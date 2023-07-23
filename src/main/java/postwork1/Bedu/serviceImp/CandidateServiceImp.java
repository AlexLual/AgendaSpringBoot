package postwork1.Bedu.serviceImp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import postwork1.Bedu.models.Candidate;
import postwork1.Bedu.repository.CandidateRepository;
import postwork1.Bedu.service.CandidateService;

import java.util.List;
@Service
public class CandidateServiceImp  implements CandidateService {
    @Autowired
    private CandidateRepository candidateRepository;
    @Override
    public List<Candidate> ListarCandidate() {
        return candidateRepository.findAll();
    }

    @Override
    public Candidate guardarCandidate(Candidate candidate) {
        return candidateRepository.save(candidate);
    }

    @Override
    public Candidate obtenerCandidatePorId(Integer id) {
        return candidateRepository.findById(id).get();
    }

    @Override
    public Candidate actualizaCandidate(Candidate candidate) {
        return candidateRepository.save(candidate);
    }

    @Override
    public void eliminarCandidate(Integer id) {
candidateRepository.deleteById(id);
    }
}
