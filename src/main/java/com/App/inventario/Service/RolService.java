package com.App.inventario.Service;
import com.App.inventario.Model.Rol;
import com.App.inventario.Repository.RolRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
@Service
public class RolService {
    @Autowired
    RolRepository rolRepository;

    public Rol Guardar_rol(Rol rol){
        return this.rolRepository.save(rol);
    }

    public ArrayList<Rol> Obtener_rol(){
        return  (ArrayList<Rol>) rolRepository.findAll();
    }

    public void Eliminar_rol(long id){rolRepository.deleteById(id);
    }
}
