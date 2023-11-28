/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.cibertec.ecommerce.ToyStore.ApiCustomer.dto;

import lombok.Data;
import pe.cibertec.ecommerce.ToyStore.ApiCustomer.entity.Pay;
import pe.cibertec.ecommerce.ToyStore.ApiCustomer.entity.Send;

/**
 *
 * @author ClaudioG
 */
@Data
public class CustomerDto {
        private Long id;
        private String customerName;      
        private String email;
        private String phone;
        private String customerUS; 
        private Pay pay;
        private Send send;
}
