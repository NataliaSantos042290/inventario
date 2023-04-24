package com.App.inventario.Service;

import com.App.inventario.Model.User;
import com.App.inventario.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class UserService implements Serviceusers {

    //Anotacion que indica a Spring Boot la inyeccion de depencias
    @Autowired
    UserRepository userRepository;

    public User GuardarUser(User user) {
        return this.userRepository.save(user);
    }

    public ArrayList<User> ObtenerUsuarios() {
        return (ArrayList<User>) userRepository.findAll();
    }

    public void EliminarUser(long id) {
        userRepository.deleteById(id);
    }

    @Override
    public User finById(Long id) {
        Optional<User>userOptional=userRepository.finById(id);
        return  userOptional.orElse(null);
    }
}
