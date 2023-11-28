package pe.cibertec.ecommerce.ToyStore.ApiProduct.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.cibertec.ecommerce.ToyStore.ApiProduct.dto.ProductDto;
import pe.cibertec.ecommerce.ToyStore.ApiProduct.entity.Product;
import pe.cibertec.ecommerce.ToyStore.ApiProduct.exception.EntityNotFoundException;
import pe.cibertec.ecommerce.ToyStore.ApiProduct.service.ProductService;

/**
 *
 * @author ClaudioG
 */


@RestController
@RequestMapping("api/v1/product")
@Slf4j
public class ProductController {
    @Autowired
    private ProductService productService;
    
    @PostMapping("add")
    public ResponseEntity<Product> add(@RequestBody Product product){
        return new ResponseEntity<>(productService.add(product),HttpStatus.CREATED);
    }
    
    @GetMapping("findById/{id}")
    public ResponseEntity<ProductDto> findById(@PathVariable Long id){
       try {
            log.info("Endpoint: /api/v1/product/findById/{} - Buscando producto por Id: {}", id, id);
            ProductDto productdto = productService.findById(id);
           return new ResponseEntity<>(productService.findById(id),HttpStatus.OK);
        } catch (EntityNotFoundException e) {
            log.error("Error al buscar producto por Id: {}: {}", id, e.getMessage());
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
