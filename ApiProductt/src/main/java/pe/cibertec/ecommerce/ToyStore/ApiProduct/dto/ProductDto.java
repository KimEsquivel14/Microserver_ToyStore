package pe.cibertec.ecommerce.ToyStore.ApiProduct.dto;

import lombok.Data;
import pe.cibertec.ecommerce.ToyStore.ApiProduct.entity.Brand;
import pe.cibertec.ecommerce.ToyStore.ApiProduct.entity.Category;

/**
 *
 * @author ClaudioG
 */
@Data
public class ProductDto {
    
        private Long id;
        private String productName;
        private Long unitPrice;
        private String description;
        private Category category;
        private Brand brand;
    
}
