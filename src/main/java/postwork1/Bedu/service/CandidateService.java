package postwork1.Bedu.service;

import postwork1.Bedu.models.Candidate;

import java.util.List;

public interface CandidateService {
    public List<Candidate> ListarCandidate();

    public Candidate guardarCandidate(Candidate candidate);

    public Candidate obtenerCandidatePorId(Integer id);
    public Candidate actualizaCandidate(Candidate candidate);
    public void eliminarCandidate(Integer id);
}
