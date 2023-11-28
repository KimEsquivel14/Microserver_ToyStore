package pe.cibertec.ecommerce.ToyStore.ApiBrand.service;

import java.util.List;
import pe.cibertec.ecommerce.ToyStore.ApiBrand.entity.Brand;

/**
 *
 * @author ClaudioG
 */

public interface BrandService {
    List<Brand> findAll();
    Brand add(Brand brand); 
    Brand findByBrandSK(String brandSK);
    
}
