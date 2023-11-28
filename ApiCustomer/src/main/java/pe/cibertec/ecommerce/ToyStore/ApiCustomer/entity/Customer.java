package pe.cibertec.ecommerce.ToyStore.ApiCustomer.entity;

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
public class Customer {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;
        private String customerName;      
        private String email;
        private String phone;
        private String customerUS;
        private String sendSK;
        private String moneySK;
}
