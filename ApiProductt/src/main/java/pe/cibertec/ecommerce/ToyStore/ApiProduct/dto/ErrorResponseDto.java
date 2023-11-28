package pe.cibertec.ecommerce.ToyStore.ApiProduct.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import lombok.Getter;
import lombok.Setter;
import org.springframework.http.HttpStatus;

/**
 *
 * @author ClaudioG
 */
@Getter
@Setter
public class ErrorResponseDto {
     @JsonFormat(shape=JsonFormat.Shape.STRING,pattern="dd-MM-yyyy hh:mm:ss")
    private Date timeStamp;
    private int code;
    private String status;
    private String stackTrace;
    private Object message;
    
    public ErrorResponseDto(HttpStatus httpStatus,
            Object message,String stackTrace){
        timeStamp = new Date();
        code=httpStatus.value();
        status=httpStatus.name();
        this.stackTrace=stackTrace;
        this.message = message;
    }
    
}
