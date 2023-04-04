package mx.com.examen.Examen.Domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.validation.constraints.NotNull;

/**
 * @author antoniolonginos
 */

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name="Clientes")
public class Clientes {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @NotNull
    private Long idCliente;
    
    @NotNull
    @Column(name = "nombre", length=50)
    private String nombre;
    
    private boolean archivo;
    
    //Enviar a cacortesc@truper.com 
    
}
