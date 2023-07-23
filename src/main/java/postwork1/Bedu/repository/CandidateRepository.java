package postwork1.Bedu.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import postwork1.Bedu.models.Candidate;
@Repository
public interface CandidateRepository extends JpaRepository<Candidate, Integer> {
}
