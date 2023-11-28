package pe.cibertec.ecommerce.ToyStore.ApiSend.service;

import java.util.List;
import pe.cibertec.ecommerce.ToyStore.ApiSend.entity.Send;

/**
 *
 * @author ClaudioG
 */
public interface SendService {
    List<Send> findAll();
    Send findByDistrito(String distrito);
    Send findBySendSK(String sendSK);
    Send add(Send send);
    
}
