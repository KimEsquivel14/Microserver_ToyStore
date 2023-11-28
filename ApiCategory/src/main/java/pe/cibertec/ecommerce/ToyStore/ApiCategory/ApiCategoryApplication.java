package pe.cibertec.ecommerce.ToyStore.ApiCategory;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class ApiCategoryApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiCategoryApplication.class, args);
	}

}
