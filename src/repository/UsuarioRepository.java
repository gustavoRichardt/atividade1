package repository;

import entity.Usuario;
import java.util.HashMap;

public class UsuarioRepository {

    private HashMap<Integer, Usuario> usuarios = new HashMap<>();

    public void salvar(Usuario usuario) {
        usuarios.put(usuario.getId(), usuario);
    }

    public Usuario buscarPorId(int id) {
        return usuarios.get(id);
    }

    public HashMap<Integer, Usuario> listar() {
        return usuarios;
    }
}