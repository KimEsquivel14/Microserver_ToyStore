package pe.cibertec.ecommerce.ToyStore.ApiBrand.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.cibertec.ecommerce.ToyStore.ApiBrand.entity.Brand;
import pe.cibertec.ecommerce.ToyStore.ApiBrand.service.BrandService;

/**
 *
 * @author ClaudioG
 */
@RestController
@RequestMapping("api/v1/brand")
public class BrandController {
        
    @Autowired
    private BrandService brandService;
    
    @PostMapping("add")
    public ResponseEntity<Brand> add(@RequestBody Brand brand){
        return new ResponseEntity<>(brandService.add(brand), HttpStatus.CREATED);
    }
    
    @GetMapping("findAll")
    public ResponseEntity<List<Brand>> findAll(){
        return new ResponseEntity<>(brandService.findAll(),HttpStatus.OK);
    }
    
    @GetMapping("findByBrandSK/{brandSK}")
    public ResponseEntity<Brand> findByBrandSK(@PathVariable String brandSK){
        return new ResponseEntity<>(brandService.findByBrandSK(brandSK), HttpStatus.OK);
    }
}
