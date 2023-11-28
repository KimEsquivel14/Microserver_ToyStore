package pe.cibertec.ecommerce.ToyStore.ApiCustomer.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.cibertec.ecommerce.ToyStore.ApiCustomer.dto.CustomerDto;
import pe.cibertec.ecommerce.ToyStore.ApiCustomer.entity.Customer;
import pe.cibertec.ecommerce.ToyStore.ApiCustomer.service.CustomerService;

/**
 *
 * @author ClaudioG
 */
@RestController
@RequestMapping("api/v1/customer")
public class CustomerController {
            
      @Autowired
      private CustomerService customerService;
        
      @GetMapping("findAll")
      public ResponseEntity<List<Customer>> findAll(){
      return new ResponseEntity<>(customerService.findAll(), HttpStatus.OK);              
        }
      
      @GetMapping("findById/{id}")
      public ResponseEntity<CustomerDto> findById(@PathVariable Long id){
          return new ResponseEntity<>(customerService.findById(id), HttpStatus.OK);
      }
      
      @GetMapping("findByCustomerUS/{customerUS}")
      public ResponseEntity<Customer> findByCustomerUS(@PathVariable String customerUS){
          return new ResponseEntity<>(customerService.findByCustomerUS(customerUS), HttpStatus.OK);
      }
      
      @PostMapping("add")
      public ResponseEntity<Customer> add(@RequestBody Customer customer){
          return new ResponseEntity<>(customerService.add(customer), HttpStatus.CREATED);
      }
     /* UPDATE
      @PutMapping("update")
      public ResponseEntity<Customer> update(@RequestBody Customer customer){
          return new ResponseEntity<>(customerService.update(customer), HttpStatus.OK);
      }
      */
      @DeleteMapping("delete/{id}")
      public void delete(@PathVariable Long id){
          customerService.delete(id);
      }
}
