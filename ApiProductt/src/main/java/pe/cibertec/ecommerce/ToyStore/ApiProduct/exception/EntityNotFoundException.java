package pe.cibertec.ecommerce.ToyStore.ApiProduct.exception;

/**
 *
 * @author ClaudioG
 */
public class EntityNotFoundException extends RuntimeException{
    
     public EntityNotFoundException(String message) {
        super(message);
    }

}