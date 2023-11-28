package pe.cibertec.ecommerce.ToyStore.ApiCustomer.service;

import java.util.List;
import pe.cibertec.ecommerce.ToyStore.ApiCustomer.dto.CustomerDto;
import pe.cibertec.ecommerce.ToyStore.ApiCustomer.entity.Customer;

/**
 *
 * @author ClaudioG
 */
public interface CustomerService {
    List<Customer> findAll();
    CustomerDto findById(Long id); 
    Customer findByCustomerUS(String customerUS);
    Customer add(Customer customer);
    public void delete(Long id);
  /*Customer update(Customer customer);*/
    
    
    
}
