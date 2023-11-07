package com.usuario.v1.ServiceImplements;

import com.usuario.v1.Entities.TipoU;
import com.usuario.v1.Repositories.ITipoURepositori;
import com.usuario.v1.ServiceInterfaces.ITipoUInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TipoUImplement implements ITipoUInterface {

    @Autowired
    private ITipoURepositori tR;

    @Override
    public void insert(TipoU tipou) {
        tR.save(tipou);
    }

    @Override
    public List<TipoU> list() {
        return tR.findAll();
    }

    @Override
    public void delete(int idTipoU) {
        tR.deleteById(idTipoU);
    }

    @Override
    public TipoU listId(int TipoU) {
        return tR.findById(TipoU).orElse(new TipoU());
    }
}
