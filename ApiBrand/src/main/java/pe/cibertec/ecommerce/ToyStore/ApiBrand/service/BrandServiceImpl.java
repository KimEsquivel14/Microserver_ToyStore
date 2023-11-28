package pe.cibertec.ecommerce.ToyStore.ApiBrand.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.cibertec.ecommerce.ToyStore.ApiBrand.dao.BrandRepository;
import pe.cibertec.ecommerce.ToyStore.ApiBrand.entity.Brand;

/**
 *
 * @author ClaudioG
 */
@Service
public class BrandServiceImpl implements BrandService{
    
    @Autowired
    private BrandRepository brandRepository;

    @Override
    public List<Brand> findAll() {
        return brandRepository.findAll();
    }

    @Override
    public Brand add(Brand brand) {
        return brandRepository.save(brand);
    }

    @Override
    public Brand findByBrandSK(String brandSK) {
        return brandRepository.findByBrandSK(brandSK);
    }
    
}
