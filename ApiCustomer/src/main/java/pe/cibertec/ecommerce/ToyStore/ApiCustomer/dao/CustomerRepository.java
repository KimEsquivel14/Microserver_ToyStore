package pe.cibertec.ecommerce.ToyStore.ApiCustomer.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.cibertec.ecommerce.ToyStore.ApiCustomer.entity.Customer;

/**
 *
 * @author ClaudioG
 */
public interface CustomerRepository extends JpaRepository<Customer, Long>{
    Customer findByCustomerUS(String customerUS);
}
