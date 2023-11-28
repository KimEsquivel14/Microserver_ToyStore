package pe.cibertec.ecommerce.ToyStore.ApiProduct.entity;

import lombok.Data;

/**
 *
 * @author ClaudioG
 */
@Data
public class Brand {
    private Long id;
    private String brandName;
    private String brandSK;
    private String slogan;
    private String descripcion;
}
