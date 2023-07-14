
package com.credillants.credillants.ControllerWeb;
import com.credillants.credillants.Entity.ProductosEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import com.credillants.credillants.Service.ProductoService;

@Controller
public class ProductoControllerWeb {

    @Autowired
    private ProductoService servicio;


@GetMapping("/catalogo")
public String mostrarCatalogo(Model modelo) {
    modelo.addAttribute("productos", servicio.getProductosAll());
    return "catalogo";
}
    
    @ModelAttribute("producto")
    public ProductosEntity RegistroProductos() {
        return new ProductosEntity();
    }
  
}
