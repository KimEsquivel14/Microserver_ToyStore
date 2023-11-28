/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package pe.cibertec.ecommerce.ToyStore.ApiCustomer.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import pe.cibertec.ecommerce.ToyStore.ApiCustomer.entity.Pay;

/**
 *
 * @author ClaudioG
 */
@FeignClient(value = "pay-service", url = "http://localhost:8092/")
public interface ApiRestPay {
    @GetMapping("api/v1/pay/findByMoneySK/{moneySK}")
    Pay findByMoneySK(@PathVariable String moneySK);
}
