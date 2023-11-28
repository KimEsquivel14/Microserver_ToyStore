package pe.cibertec.ecommerce.ToyStore.ApiSend.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.util.Date;
import lombok.Data;

/**
 *
 * @author ClaudioG
 */
@Data
@Entity
public class Send {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;
        private String direccion;
        private String ubigeo;
        private Date fechaenvio;
        private String distrito;
        private String sendSK;
}
