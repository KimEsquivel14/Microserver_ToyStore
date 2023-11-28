package pe.cibertec.ecommerce.ToyStore.ApiCustomer.service;

import jakarta.persistence.EntityNotFoundException;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.cibertec.ecommerce.ToyStore.ApiCustomer.dao.CustomerRepository;
import pe.cibertec.ecommerce.ToyStore.ApiCustomer.dto.CustomerDto;
import pe.cibertec.ecommerce.ToyStore.ApiCustomer.entity.Customer;
import pe.cibertec.ecommerce.ToyStore.ApiCustomer.entity.Pay;
import pe.cibertec.ecommerce.ToyStore.ApiCustomer.entity.Send;

/**
 *
 * @author ClaudioG
 */
@Service
public class CustomerServiceImpl implements CustomerService{
    
    @Autowired
    private CustomerRepository customerRepository;
    
    @Autowired
    private ApiRestSend apirestSend;
    
    @Autowired
    private ApiRestPay apirestPay;

    @Override
    public List<Customer> findAll() {
        return customerRepository.findAll();
    }

    @Override
    public Customer findByCustomerUS(String customerUS) {
        return customerRepository.findByCustomerUS(customerUS);
    }

    @Override
    public Customer add(Customer customer) {
        return customerRepository.save(customer);
    }
/*UPDATE
    @Override
    public Customer update(Customer customer) {
        var customerUp = customerRepository.findById(customer.getId()).get();
        customerUp.setCustomerName(customer.getCustomerName());
        customerUp.setEmail(customer.getEmail());
        customerUp.setPhone(customer.getPhone());
        customerUp.setCustomerUS(customer.getCustomerUS());
        return customerRepository.save(customerUp);
    }
*/
    @Override
    public void delete(Long id) {
        var customerUp = customerRepository.findById(id).get();
        customerRepository.delete(customerUp);
    }

    @Override
    public CustomerDto findById(Long id) {
        Customer customer = customerRepository.findById(id).get();
        
        Send send = apirestSend.findBySendSK(customer.getSendSK());
        
        Pay pay = apirestPay.findByMoneySK(customer.getMoneySK());
        
        CustomerDto customerDto = new CustomerDto();
        customerDto.setId(customer.getId());
        customerDto.setCustomerName(customer.getCustomerName());
        customerDto.setEmail(customer.getEmail());
        customerDto.setPhone(customer.getPhone());
        customerDto.setCustomerUS(customer.getCustomerUS());
        customerDto.setSend(send);
        customerDto.setPay(pay);
        return customerDto;
    }

    
}
