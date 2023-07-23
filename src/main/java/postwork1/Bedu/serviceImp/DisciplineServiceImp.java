package postwork1.Bedu.serviceImp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import postwork1.Bedu.models.Discipline;
import postwork1.Bedu.repository.DisciplineRepository;
import postwork1.Bedu.service.DisciplineService;

import java.util.List;
@Service

public class DisciplineServiceImp implements DisciplineService {
    @Autowired
    private DisciplineRepository disciplineRepository;


    @Override
    public List<Discipline> ListarDiscipline() {
        return disciplineRepository.findAll();
    }

    @Override
    public Discipline guardarDiscipline(Discipline discipline) {
        return disciplineRepository.save(discipline);
    }

    @Override
    public Discipline obtenerDisciplinePorId(Integer id) {
        return disciplineRepository.findById(id).get();
    }

    @Override
    public Discipline actualizaDiscipline(Discipline discipline) {
        return disciplineRepository.save(discipline);

    }

    @Override
    public void eliminarDiscipline(Integer id) {
disciplineRepository.deleteById(id);
    }
}
