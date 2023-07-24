package postwork1.Bedu.service;

import postwork1.Bedu.models.Usuario;

import java.util.List;
import java.util.Optional;

public interface UsuariosService {
    public List<Usuario> ListarCandidate();

    public Usuario guardarCandidate(Usuario usuario);

    Optional<Usuario> findById(Integer id);
    public Usuario actualizaCandidate(Usuario usuario);
    public void eliminarCandidate(Integer id);
}
