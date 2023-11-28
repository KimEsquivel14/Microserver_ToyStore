
package pe.cibertec.ecommerce.ToyStore.ApiPay.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.cibertec.ecommerce.ToyStore.ApiPay.dao.PayRepository;
import pe.cibertec.ecommerce.ToyStore.ApiPay.entity.Pay;

/**
 *
 * @author ClaudioG
 */
@Service
public class PayServiceImpl implements PayService{
    
    @Autowired
    private PayRepository payRepository;

    @Override
    public List<Pay> findAll() {
        return payRepository.findAll();
    }

    @Override
    public Pay findByMoneySK(String moneySK) {
        return payRepository.findByMoneySK(moneySK);
    }

    @Override
    public Pay add(Pay pay) {
        return payRepository.save(pay);
    }
   
}
