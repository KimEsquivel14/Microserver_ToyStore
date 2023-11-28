package pe.cibertec.ecommerce.ToyStore.ApiCategory.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.cibertec.ecommerce.ToyStore.ApiCategory.entity.CategoryC;

/**
 *
 * @author ClaudioG
 */
public interface CategoryCRepository extends JpaRepository<CategoryC, Long>{
    CategoryC findByCategorySK(String categorySK);
}
