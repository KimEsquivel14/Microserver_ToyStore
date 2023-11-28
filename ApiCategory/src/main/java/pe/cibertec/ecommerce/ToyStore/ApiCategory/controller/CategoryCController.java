package pe.cibertec.ecommerce.ToyStore.ApiCategory.controller;

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
import pe.cibertec.ecommerce.ToyStore.ApiCategory.entity.CategoryC;
import pe.cibertec.ecommerce.ToyStore.ApiCategory.service.CategoryCService;

/**
 *
 * @author ClaudioG
 */
@RestController
@RequestMapping("api/v1/category")
public class CategoryCController {
    
    @Autowired
    private CategoryCService categorycService;
    
    @GetMapping("findAll")
    public ResponseEntity<List<CategoryC>> findAll(){
        return new ResponseEntity<>(categorycService.findAll(), HttpStatus.OK);
    }
    
    @GetMapping("findByCategorySK/{categorySK}")
    public ResponseEntity<CategoryC> findByCategorySK(@PathVariable String categorySK){
        return new ResponseEntity<>(categorycService.findByCategorySK(categorySK),HttpStatus.OK);
    }
    
    @PostMapping("add")
    public ResponseEntity<CategoryC> add(@RequestBody CategoryC category){
        return new ResponseEntity<>(categorycService.add(category), HttpStatus.CREATED);
    }
    
}
