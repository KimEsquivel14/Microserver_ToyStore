package pe.cibertec.ecommerce.ToyStore.ApiProduct;

import lombok.extern.java.Log;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@Log
@EnableDiscoveryClient
@SpringBootApplication
@EnableFeignClients
public class ApiProductApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiProductApplication.class, args);
	}

}
