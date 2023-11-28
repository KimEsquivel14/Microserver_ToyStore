package pe.cibertec.ecommerce.ToyStore.ApiBrand.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.cibertec.ecommerce.ToyStore.ApiBrand.entity.Brand;

/**
 *
 * @author ClaudioG
 */
public interface BrandRepository extends JpaRepository<Brand, Long>{
        Brand findByBrandSK(String brandSK);
}
