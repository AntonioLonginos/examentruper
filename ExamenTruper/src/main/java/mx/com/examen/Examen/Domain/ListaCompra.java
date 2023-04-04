package mx.com.examen.Examen.Domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import javax.persistence.Column;
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
import org.springframework.format.annotation.DateTimeFormat;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

/**
 * @author antoniolonginos
 */
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "ListaCompra")
public class ListaCompra {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @NotNull
    private Long idLista;

    //Generar FK
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "customer_id", nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @NotNull
    private Long customerId; //Falta

    @NotNull
    @Column(name = "nombre", length = 50)
    private char nombreListaCompra;

    @DateTimeFormat(pattern = "yyyy-MM-dd hh:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date fechaRegistro;
    private Date fechaUltimaActualizacion;

    private boolean archivo;

}
