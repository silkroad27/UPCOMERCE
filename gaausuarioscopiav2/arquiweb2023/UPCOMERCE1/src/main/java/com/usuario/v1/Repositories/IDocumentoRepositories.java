package com.usuario.v1.Repositories;

import com.usuario.v1.Entities.Documento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface IDocumentoRepositories extends JpaRepository<Documento,Integer> {
    List<Documento> findByfechaDocumento(LocalDate creationfechaDocumento);

}
