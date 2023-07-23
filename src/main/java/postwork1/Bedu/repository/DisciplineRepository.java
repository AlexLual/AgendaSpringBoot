package postwork1.Bedu.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import postwork1.Bedu.models.Discipline;

@Repository
public interface DisciplineRepository extends JpaRepository<Discipline, Integer> {
}
