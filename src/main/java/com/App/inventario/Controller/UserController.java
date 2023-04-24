package com.App.inventario.Controller;

import com.App.inventario.Model.User;
import com.App.inventario.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

    //Metodo guardar
    @PostMapping()
    public User GuardarUser (@RequestBody User user){
        return this.userService.GuardarUser(user);
    }

    //Metodo eliminar
    @DeleteMapping ("/delete/{id}")
    public void EliminarUser(@PathVariable ("id") Long id){
        userService.EliminarUser(id);
    }

    @GetMapping()
    public ArrayList <User> ObtenerUsuarios(){
        return this.userService.ObtenerUsuarios();
    }

    @PutMapping(value = "/{id}/update")
    public User editarUser(@RequestBody User user) {
        return this.userService.GuardarUser(user);
    }

    @GetMapping("/{id}")
    public User finById(@PathVariable("id") Long id){
        return userService.finById(id);
    }

}