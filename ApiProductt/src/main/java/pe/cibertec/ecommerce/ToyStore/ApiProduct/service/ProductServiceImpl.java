package pe.cibertec.ecommerce.ToyStore.ApiProduct.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.cibertec.ecommerce.ToyStore.ApiProduct.dao.ProductRepository;
import pe.cibertec.ecommerce.ToyStore.ApiProduct.dto.ProductDto;
import pe.cibertec.ecommerce.ToyStore.ApiProduct.entity.Brand;
import pe.cibertec.ecommerce.ToyStore.ApiProduct.entity.Category;
import pe.cibertec.ecommerce.ToyStore.ApiProduct.entity.Product;

/**
 *
 * @author ClaudioG
 */
@Service
public class ProductServiceImpl implements ProductService{
    
    @Autowired
    private ProductRepository productRepository;
    
    @Autowired
    private ApiRestClient apirestClient;
    
    @Autowired
    private ApiRestBrand apirestBrand;

    @Override
    public Product add(Product product) {
        return productRepository.save(product);
    }

    @Override
    public ProductDto findById(Long id) {
            Product product = productRepository.findById(id).get();
            
            Category category = apirestClient.findByCategorySK(product.getCategorySK());
            
            Brand brand = apirestBrand.findByBrandSK(product.getBrandSK());
            
            ProductDto productDto = new ProductDto();
            productDto.setId(product.getId());
            productDto.setProductName(product.getProductName());
            productDto.setUnitPrice(product.getUnitPrice());
            productDto.setDescription(product.getDescription());
            productDto.setCategory(category);
            productDto.setBrand(brand);
            return productDto;
    }
    
}
