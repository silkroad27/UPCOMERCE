package com.usuario.v1.Controllers;


import com.usuario.v1.DTOS.DocumentoDto;
import com.usuario.v1.DTOS.DocumentoUsuarioDto;
import com.usuario.v1.Entities.Documento;
import com.usuario.v1.ServiceInterfaces.IDocumentoServices;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/document")
public class DocumentoController {

    @Autowired
    private IDocumentoServices cS;

    @PostMapping
    public void registrar(@RequestBody DocumentoDto dto) {
        ModelMapper d = new ModelMapper();
        Documento c = d.map(dto, Documento.class);
        cS.insert(c);
    }

    @GetMapping
    public List<DocumentoDto> listar() {
        return cS.list().stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, DocumentoDto.class);
        }).collect(Collectors.toList());
    }

    public List<DocumentoDto> buscar(@RequestBody LocalDate tipo) {
        return cS.findByCreationfechaDocumento(tipo).stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, DocumentoDto.class);
        }).collect(Collectors.toList());
    }


}
