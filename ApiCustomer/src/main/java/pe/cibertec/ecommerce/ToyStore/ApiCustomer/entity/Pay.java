package pe.cibertec.ecommerce.ToyStore.ApiCustomer.entity;

import lombok.Data;

/**
 *
 * @author ClaudioG
 */
@Data
public class Pay { 
        private Long payid;
        private String paymethod;
        private String deliverytype;
        private String subtotal;
        private String moneySK;
        private String sendSK;
}
