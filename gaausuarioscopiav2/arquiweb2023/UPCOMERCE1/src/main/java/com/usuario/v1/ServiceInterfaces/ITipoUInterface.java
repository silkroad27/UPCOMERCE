package com.usuario.v1.ServiceInterfaces;

import com.usuario.v1.Entities.TipoU;

import java.util.List;

public interface ITipoUInterface {

    public void insert(TipoU tipou);
    List<TipoU> list();
    public void delete(int idTipoU);
    public TipoU listId(int TipoU);

}
