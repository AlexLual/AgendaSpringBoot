package postwork1.Bedu.serviceImp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import postwork1.Bedu.models.Technology;
import postwork1.Bedu.repository.TechnologyRepository;
import postwork1.Bedu.service.TechnologyService;

import java.util.List;
import java.util.Optional;

@Service
public class TechnologyServiceImpl implements TechnologyService {
    @Autowired
    private TechnologyRepository technologyRepository;
    @Override
    public List<Technology> ListarTechnology() {
        return technologyRepository.findAll();
    }

    @Override
    public Technology guardarTechnology(Technology technology) {
        return technologyRepository.save(technology);
    }

    @Override
    public Optional<Technology> get(Integer id) {
        return technologyRepository.findById(id);
    }


    @Override
    public Technology actualizaTechnology(Technology technology) {
        return technologyRepository.save(technology);
    }

    @Override
    public void eliminarTechnology(Integer id) {
technologyRepository.deleteById(id);
    }
}
