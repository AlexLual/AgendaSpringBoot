package postwork1.Bedu.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import postwork1.Bedu.models.InterviewType;

@Repository
public interface InterviewTypeRepository extends JpaRepository<InterviewType,Integer> {
}
