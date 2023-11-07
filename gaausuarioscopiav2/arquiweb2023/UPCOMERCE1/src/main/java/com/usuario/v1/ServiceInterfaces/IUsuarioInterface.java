package com.usuario.v1.ServiceInterfaces;

import com.usuario.v1.Entities.Usuario;

import java.util.List;

public interface IUsuarioInterface {
    public void insert(Usuario usuario);
    List<Usuario> list();
    public void delete(int idUsuario);
    public Usuario listId(int idUsuario);
     List<String[]> getCountUsuarioByDocumento();

}
