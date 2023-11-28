package pe.cibertec.ecommerce.ToyStore.ApiProduct.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import pe.cibertec.ecommerce.ToyStore.ApiProduct.entity.Category;

/**
 *
 * @author ClaudioG
 */
@FeignClient(value = "category-service", url = "http://localhost:8093/")
public interface ApiRestClient {
    @GetMapping("api/v1/category/findByCategorySK/{categorySK}")
    Category findByCategorySK(@PathVariable String categorySK);
    
}
