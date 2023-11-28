package pe.cibertec.ecommerce.ToyStore.ApiBrand;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class ApiBrandApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiBrandApplication.class, args);
	}

}
