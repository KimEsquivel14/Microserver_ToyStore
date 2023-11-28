package pe.cibertec.ecommerce.ToyStore.ApiCustomer.entity;

import java.util.Date;
import lombok.Data;

/**
 *
 * @author ClaudioG
 */
@Data
public class Send {
        private Long id;
        private String direccion;
        private String ubigeo;
        private Date fechaenvio;
        private String distrito;
        private String sendSK;
}   
