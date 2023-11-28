package pe.cibertec.ecommerce.ToyStore.ApiProduct.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import pe.cibertec.ecommerce.ToyStore.ApiProduct.entity.Brand;

/**
 *
 * @author ClaudioG
 */
@FeignClient(value = "brand-service", url = "http://localhost:8099/")
public interface ApiRestBrand {
    @GetMapping("api/v1/brand/findByBrandSK/{brandSK}")
    Brand findByBrandSK(@PathVariable String brandSK);
}
