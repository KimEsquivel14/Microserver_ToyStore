package pe.cibertec.ecommerce.ToyStore.ApiSend.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.cibertec.ecommerce.ToyStore.ApiSend.dao.SendRepository;
import pe.cibertec.ecommerce.ToyStore.ApiSend.entity.Send;

/**
 *
 * @author ClaudioG
 */
@Service
public class SendServiceImpl implements SendService{
    
    @Autowired
    private SendRepository sendRepository;

    @Override
    public List<Send> findAll() {
        return sendRepository.findAll();
    }

    @Override
    public Send findByDistrito(String distrito) {
        return sendRepository.findByDistrito(distrito);
    }

    @Override
    public Send findBySendSK(String sendSK) {
        return sendRepository.findBySendSK(sendSK);
    }

    @Override
    public Send add(Send send) {
        return sendRepository.save(send);
    }
    
}
