package com.usuario.v1.Repositories;

import com.usuario.v1.Entities.TipoU;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ITipoURepositori extends JpaRepository<TipoU, Integer> {


}
