package com.usuario.v1.ServiceImplements;

import com.usuario.v1.Entities.Documento;
import com.usuario.v1.Repositories.IDocumentoRepositories;
import com.usuario.v1.ServiceInterfaces.IDocumentoServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class DocumentoServiceImplements implements IDocumentoServices {
    @Autowired
    private IDocumentoRepositories cR;

    @Override
    public void insert(Documento documento){
        cR.save(documento);
    }

    @Override
    public List<Documento> list(){
    return cR.findAll();
    }

    @Override
    public List<Documento> findByCreationfechaDocumento(LocalDate creationfechaDocumento) {
        return cR.findByfechaDocumento(creationfechaDocumento);
    }




}
