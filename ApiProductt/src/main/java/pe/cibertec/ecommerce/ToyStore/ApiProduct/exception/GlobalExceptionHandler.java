package pe.cibertec.ecommerce.ToyStore.ApiProduct.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import pe.cibertec.ecommerce.ToyStore.ApiProduct.dto.ErrorResponseDto;

/**
 *
 * @author ClaudioG
 */
@RestControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(EntityNotFoundException.class)
    public ResponseEntity<ErrorResponseDto> handleEntityNotFound(EntityNotFoundException ex){
        var status = HttpStatus.NOT_FOUND;
        var errorResponse = new ErrorResponseDto(status, ex.getMessage(), ex.toString());
        return new ResponseEntity<>(errorResponse,status);
    }
}
