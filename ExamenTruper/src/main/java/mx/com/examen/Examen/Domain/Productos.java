package mx.com.examen.Examen.Domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author antoniolonginos
 */

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name="Productos")
public class Productos {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @NotNull
    private Long idProducto;
    
    @Column(length = 15)
    private String clave;
    
    @Column(length = 150)
    private String descripcion;
    
    private boolean archivo;
    
    
}
