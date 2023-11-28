/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.cibertec.ecommerce.ToyStore.ApiSend.controller;

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
import pe.cibertec.ecommerce.ToyStore.ApiSend.entity.Send;
import pe.cibertec.ecommerce.ToyStore.ApiSend.service.SendService;

/**
 *
 * @author ClaudioG
 */
@RestController
@RequestMapping("api/v1/send")
public class SendController {
    
        
        @Autowired
        private SendService sendService;
        
        @GetMapping("findAll")
        public ResponseEntity<List<Send>> findAll(){
            return new ResponseEntity<>(sendService.findAll(), HttpStatus.OK);
        }
        
        @GetMapping("findByDistrito/{distrito}")
        public ResponseEntity<Send> findByDistrito(@PathVariable String distrito){
            return new ResponseEntity<>(sendService.findByDistrito(distrito), HttpStatus.OK);
        }
        
        @GetMapping("findBySendSK/{sendSK}")
        public ResponseEntity<Send> findBySendSK(@PathVariable String sendSK){
            return new ResponseEntity<>(sendService.findBySendSK(sendSK),HttpStatus.OK);
        }
        
        @PostMapping("add")
        public ResponseEntity<Send> add(@RequestBody Send send){
            return new ResponseEntity<>(sendService.add(send),HttpStatus.CREATED);
        }
}
