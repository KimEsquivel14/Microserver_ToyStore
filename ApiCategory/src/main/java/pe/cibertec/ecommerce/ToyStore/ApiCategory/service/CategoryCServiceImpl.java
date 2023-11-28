package pe.cibertec.ecommerce.ToyStore.ApiCategory.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.cibertec.ecommerce.ToyStore.ApiCategory.dao.CategoryCRepository;
import pe.cibertec.ecommerce.ToyStore.ApiCategory.entity.CategoryC;

/**
 *
 * @author ClaudioG
 */
 @Service
public class CategoryCServiceImpl implements CategoryCService {
    
    @Autowired
    private CategoryCRepository categorycRepository;

    @Override
    public List<CategoryC> findAll() {
        return categorycRepository.findAll();
    }

    @Override
    public CategoryC findByCategorySK(String categorySK) {
        return categorycRepository.findByCategorySK(categorySK);
    }

    @Override
    public CategoryC add(CategoryC category) {
        return categorycRepository.save(category);
    }  
}
