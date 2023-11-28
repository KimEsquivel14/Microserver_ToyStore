/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package pe.cibertec.ecommerce.ToyStore.ApiSend.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.cibertec.ecommerce.ToyStore.ApiSend.entity.Send;

/**
 *
 * @author ClaudioG
 */
public interface SendRepository extends JpaRepository<Send, Long>{
        Send findByDistrito(String distrito);
    Send findBySendSK(String sendSK);
}
