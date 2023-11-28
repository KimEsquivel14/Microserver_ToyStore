package pe.cibertec.ecommerce.ToyStore.ApiProduct.service;

import pe.cibertec.ecommerce.ToyStore.ApiProduct.dto.ProductDto;
import pe.cibertec.ecommerce.ToyStore.ApiProduct.entity.Product;

/**
 *
 * @author ClaudioG
 */
public interface ProductService {
    Product add(Product product);
    ProductDto findById(Long id);
}
