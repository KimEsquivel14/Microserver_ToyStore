/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package pe.cibertec.ecommerce.ToyStore.ApiPay.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.cibertec.ecommerce.ToyStore.ApiPay.entity.Pay;

/**
 *
 * @author ClaudioG
 */
public interface PayRepository extends JpaRepository<Pay, Long>{
    Pay findByMoneySK(String moneySK);
}
