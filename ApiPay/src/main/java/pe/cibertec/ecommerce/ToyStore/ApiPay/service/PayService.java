/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package pe.cibertec.ecommerce.ToyStore.ApiPay.service;

import java.util.List;
import pe.cibertec.ecommerce.ToyStore.ApiPay.entity.Pay;

/**
 *
 * @author ClaudioG
 */
public interface PayService {
    List<Pay> findAll();
    Pay findByMoneySK(String moneySK);
    Pay add(Pay pay);
    
}
