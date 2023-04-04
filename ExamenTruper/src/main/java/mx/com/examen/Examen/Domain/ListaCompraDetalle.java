package mx.com.examen.Examen.Domain;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

/**
 * @author antoniolonginos
 */

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name="ListaCompraDetalle")
public class ListaCompraDetalle {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idListaCompra;
    private Long codigoProducto;
    
    
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "id_Lista", nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @NotNull
    private Long idLista;
    
    //FK de PK Productos
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "idProducto", nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @NotNull
    private Long idCodigoProducto;
    
    private int cantidad;
    
}
