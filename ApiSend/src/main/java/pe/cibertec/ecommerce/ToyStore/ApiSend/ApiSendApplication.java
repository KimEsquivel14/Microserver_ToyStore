package pe.cibertec.ecommerce.ToyStore.ApiSend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class ApiSendApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiSendApplication.class, args);
	}

}
