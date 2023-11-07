package com.usuario.v1.Repositories;

import com.usuario.v1.Entities.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IUsuarioRepository extends JpaRepository<Usuario, Integer> {

    //aquí se ponen los querys
    //List<Usuario> findByC

    @Query(value = "SELECT c.tipo_nombre, COUNT(p.iddocumento) " +
            "FROM Documento c inner join Usuario p " +
            "ON c.iddocumento = p.iddocumento " +
            "GROUP BY c.tipo_nombre " +
            "order BY COUNT(p.iddocumento) " +
            "DESC", nativeQuery = true)

    List<String[]> UsuarioDocumento();

}
