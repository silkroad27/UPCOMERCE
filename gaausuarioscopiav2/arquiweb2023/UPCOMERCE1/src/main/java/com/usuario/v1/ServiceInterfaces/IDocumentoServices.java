package com.usuario.v1.ServiceInterfaces;


import com.usuario.v1.Entities.Documento;
import java.time.LocalDate;
import java.util.List;

public interface IDocumentoServices{
    public void insert(Documento documento);
    public List<Documento> list();

  List<Documento> findByCreationfechaDocumento(LocalDate creationfechaDocumento);
}
