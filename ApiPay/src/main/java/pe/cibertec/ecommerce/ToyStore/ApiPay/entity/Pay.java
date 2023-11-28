package pe.cibertec.ecommerce.ToyStore.ApiPay.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

/**
 *
 * @author ClaudioG
 */
@Data
@Entity
public class Pay {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long payid;
        private String paymethod;
        private String deliverytype;
        private String subtotal;
        private String moneySK;
}
