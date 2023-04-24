package com.App.inventario.Controller;

import com.App.inventario.Model.Productos;
import com.App.inventario.Model.Rol;
import com.App.inventario.Service.ProductService;
import com.App.inventario.Service.RolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

public class RolController {
    @Autowired
    RolService rolService;

    //METODO GUARDAR
    @PostMapping()
    public Rol Guardar_rol (@RequestBody Rol rol){
        return  this.rolService.Guardar_rol(rol);
    }

    //METODO ELIMINAR
    @DeleteMapping("/delete_rol/{id}")
    public void Eliminar_rol(@PathVariable("id") Long id){
        rolService.Eliminar_rol(id);

    }
    //METODO LISTAR
    @GetMapping()
    public ArrayList<Rol> Obtener_rol(){
        return this.rolService.Obtener_rol();
    }

    //METODO ACTUALIZAR
    @PutMapping(value = "/{id}/update_rol")
    public Rol editar_rol(@RequestBody Rol rol) {
        return this.rolService.Guardar_rol(rol);
    }

}


