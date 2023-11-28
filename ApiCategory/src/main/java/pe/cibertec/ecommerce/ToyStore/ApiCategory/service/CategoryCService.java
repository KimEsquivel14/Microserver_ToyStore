package pe.cibertec.ecommerce.ToyStore.ApiCategory.service;

import java.util.List;
import pe.cibertec.ecommerce.ToyStore.ApiCategory.entity.CategoryC;

/**
 *
 * @author ClaudioG
 */
public interface CategoryCService {
    List<CategoryC> findAll();
    CategoryC findByCategorySK(String categorySK);
    CategoryC add(CategoryC category);
}
