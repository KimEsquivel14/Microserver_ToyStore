/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.cibertec.ecommerce.ToyStore.ApiPay.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.cibertec.ecommerce.ToyStore.ApiPay.entity.Pay;
import pe.cibertec.ecommerce.ToyStore.ApiPay.service.PayService;

/**
 *
 * @author ClaudioG
 */
@RestController
@RequestMapping("api/v1/pay")
public class PayController {
    
    @Autowired
    private PayService payService;
    
    @GetMapping("findAll")
    public ResponseEntity<List<Pay>> findAll(){
        return new ResponseEntity<>(payService.findAll(), HttpStatus.OK);
    }
    
    @GetMapping("findByMoneySK/{moneySK}")
    public ResponseEntity<Pay> findByMoneySK(@PathVariable String moneySK){
        return new ResponseEntity<>(payService.findByMoneySK(moneySK), HttpStatus.OK);
    }
    
    @PostMapping("add")
    public ResponseEntity<Pay> add(@RequestBody Pay pay){
        return new ResponseEntity<>(payService.add(pay), HttpStatus.CREATED);
    }
    
}
