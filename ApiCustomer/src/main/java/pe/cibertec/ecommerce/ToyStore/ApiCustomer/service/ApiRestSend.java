/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package pe.cibertec.ecommerce.ToyStore.ApiCustomer.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import pe.cibertec.ecommerce.ToyStore.ApiCustomer.entity.Send;

/**
 *
 * @author ClaudioG
 */
@FeignClient(value = "send-service", url = "http://localhost:8097/")
public interface ApiRestSend {
    @GetMapping("api/v1/send/findBySendSK/{sendSK}")
    Send findBySendSK(@PathVariable String sendSK);
    
}
