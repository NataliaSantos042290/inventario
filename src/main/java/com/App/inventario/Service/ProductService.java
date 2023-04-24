package com.App.inventario.Service;
import com.App.inventario.Model.Productos;
import com.App.inventario.Repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
@Service
public class ProductService {
    @Autowired
    ProductRepository productRepository;

    public Productos Guardar_Prod(Productos productos){
        return this.productRepository.save(productos);
    }

    public ArrayList<Productos> Obtener_Product(){
        return  (ArrayList<Productos>) productRepository.findAll();
    }

    public void Eliminar_product(long cod_pro){productRepository.deleteById(cod_pro);
    }
}
