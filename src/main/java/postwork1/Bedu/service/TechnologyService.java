package postwork1.Bedu.service;

import postwork1.Bedu.models.Technology;

import java.util.List;

public interface TechnologyService {
    public List<Technology> ListarTechnology();

    public Technology guardarTechnology (Technology technology);

    public Technology obtenerTechnologyPorId(Integer id);
    public Technology actualizaTechnology(Technology technology);
    public void eliminarTechnology(Integer id);
}
