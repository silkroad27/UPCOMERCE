package com.usuario.v1.ServiceImplements;

import com.usuario.v1.Entities.Usuario;
import com.usuario.v1.Repositories.IUsuarioRepository;
import com.usuario.v1.ServiceInterfaces.IUsuarioInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class    UsuarioImplement implements IUsuarioInterface {

    @Autowired
    private IUsuarioRepository uR;

    @Override
    public void insert(Usuario usuario) {
        uR.save(usuario);
    }

    @Override
    public List<Usuario> list() {
        return uR.findAll();
    }

    @Override
    public void delete(int idUsuario) {
        uR.deleteById(idUsuario);

    }

    @Override
    public Usuario listId(int idUsuario) {
        return uR.findById(idUsuario).orElse(new Usuario());
    }

    @Override
    public List<String[]> getCountUsuarioByDocumento() {
        return uR.UsuarioDocumento();
    }


}
