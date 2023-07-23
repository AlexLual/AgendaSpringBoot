package postwork1.Bedu.service;


import postwork1.Bedu.models.Discipline;

import java.util.List;

public interface DisciplineService {
    public List<Discipline> ListarDiscipline();

    public Discipline guardarDiscipline(Discipline discipline);

    public Discipline obtenerDisciplinePorId(Integer id);
    public Discipline actualizaDiscipline(Discipline discipline);
    public void eliminarDiscipline(Integer id);
}
