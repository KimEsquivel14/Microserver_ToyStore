package pe.cibertec.ecommerce.ToyStore.ApiProduct.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.cibertec.ecommerce.ToyStore.ApiProduct.entity.Product;

/**
 *
 * @author ClaudioG
 */
public interface ProductRepository extends JpaRepository<Product, Long> {
}
