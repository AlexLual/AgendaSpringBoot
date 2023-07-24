package postwork1.Bedu.serviceImp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import postwork1.Bedu.models.Usuario;
import postwork1.Bedu.repository.UsuariosRepository;
import postwork1.Bedu.service.UsuariosService;

import java.util.List;
import java.util.Optional;

@Service
public class UsuariosServiceImp implements UsuariosService {
    @Autowired
    private UsuariosRepository usuariosRepository;
    @Override
    public List<Usuario> ListarCandidate() {
        return usuariosRepository.findAll();
    }

    @Override
    public Usuario guardarCandidate(Usuario usuario) {
        return usuariosRepository.save(usuario);
    }

    @Override
    public Optional<Usuario> findById(Integer id) {
        return usuariosRepository.findById(id);
    }


    @Override
    public Usuario actualizaCandidate(Usuario usuario) {
        return usuariosRepository.save(usuario);
    }

    @Override
    public void eliminarCandidate(Integer id) {
usuariosRepository.deleteById(id);
    }
}
