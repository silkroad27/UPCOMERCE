package com.usuario.v1.Controllers;

import com.usuario.v1.DTOS.DocumentoDto;
import com.usuario.v1.DTOS.DocumentoUsuarioDto;
import com.usuario.v1.DTOS.UsuarioDTO;
import com.usuario.v1.Entities.Usuario;
import com.usuario.v1.ServiceInterfaces.IUsuarioInterface;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/users")
public class UsuarioController {

    @Autowired
    private IUsuarioInterface uS;

    @PostMapping //registrar
    public void registrar(@RequestBody UsuarioDTO dto){
        ModelMapper m=new ModelMapper();
        Usuario u=m.map(dto, Usuario.class);
        uS.insert(u);
    }
    @GetMapping
    public List<UsuarioDTO> listar(){
        return uS.list().stream().map(x->{
            ModelMapper m=new ModelMapper();
            return m.map(x,UsuarioDTO.class);
        }).collect(Collectors.toList());
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id){
        uS.delete(id);
    }

    @PutMapping //actualizar
    public void update(@RequestBody UsuarioDTO dto){
        ModelMapper m=new ModelMapper();
        Usuario u=m.map(dto,Usuario.class);
        uS.insert(u);
    }
    @GetMapping("/Documents")
    public List<DocumentoUsuarioDto> getUsuarioByDocumento() {
        List<String[]> countUsuarioByDocumento = uS.getCountUsuarioByDocumento();
        List<DocumentoUsuarioDto> DocumentoUsuarioDtoList = new ArrayList<>();

        for (String[] data : countUsuarioByDocumento) {
            if (data.length >= 2) {
                DocumentoUsuarioDto documentoUsuarioDto = new DocumentoUsuarioDto();
                documentoUsuarioDto.setNameUsuario(data[0]);
                documentoUsuarioDto.setQuantityDocuments(Integer.parseInt(data[1]));
                DocumentoUsuarioDtoList.add(documentoUsuarioDto);
            }
        }

        return DocumentoUsuarioDtoList;
    }

}
