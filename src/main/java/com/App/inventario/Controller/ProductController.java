package com.App.inventario.Controller;


import com.App.inventario.Model.Productos;
import com.App.inventario.Model.User;
import com.App.inventario.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    ProductService productService;

    //METODO GUARDAR
    @PostMapping()
    public Productos Guardar_Prod (@RequestBody Productos productos){
        return  this.productService.Guardar_Prod(productos);
    }

    //METODO ELIMINAR
    @DeleteMapping("/delete_prod/{codigo}")
    public void Eliminar_product(@PathVariable ("codigo") Long codigo){
        productService.Eliminar_product(codigo);

    }
    //METODO LISTAR
    @GetMapping()
    public ArrayList<Productos> Obtener_Product(){
        return this.productService.Obtener_Product();
    }
    //METODO ACTUALIZAR
    @PutMapping(value = "/{codigo}/update_prod")
    public Productos editar_Prod(@RequestBody Productos productos) {
        return this.productService.Guardar_Prod(productos);
}

}
