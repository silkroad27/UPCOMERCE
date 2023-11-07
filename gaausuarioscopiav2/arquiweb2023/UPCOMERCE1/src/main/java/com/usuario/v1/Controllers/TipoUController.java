package com.usuario.v1.Controllers;

import com.usuario.v1.DTOS.TipoUDTO;
import com.usuario.v1.Entities.TipoU;
import com.usuario.v1.ServiceInterfaces.ITipoUInterface;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/typeuser")
public class TipoUController {

    @Autowired
    private ITipoUInterface iT;

    @PostMapping //registrar
    public void registrar(@RequestBody TipoUDTO dto){
        ModelMapper m=new ModelMapper();
        TipoU t=m.map(dto, TipoU.class);
        iT.insert(t);
    }
    @GetMapping
    public List<TipoUDTO> listar(){
        return iT.list().stream().map(x->{
            ModelMapper m=new ModelMapper();
            return m.map(x,TipoUDTO.class);
        }).collect(Collectors.toList());
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id){
        iT.delete(id);
    }

    @PutMapping //actualizar
    public void update(@RequestBody TipoUDTO dto){
        ModelMapper m=new ModelMapper();
        TipoU t=m.map(dto,TipoU.class);
        iT.insert(t);
    }


}
