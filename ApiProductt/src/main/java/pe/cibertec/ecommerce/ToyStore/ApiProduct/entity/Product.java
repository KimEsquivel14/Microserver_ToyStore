package pe.cibertec.ecommerce.ToyStore.ApiProduct.entity;

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
public class Product {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;
        private String productName;
        private Long unitPrice;
        private String description;
        private String categorySK;
        private String brandSK;
}
