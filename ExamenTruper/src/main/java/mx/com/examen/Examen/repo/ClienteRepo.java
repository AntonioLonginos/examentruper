package mx.com.examen.Examen.repo;

import mx.com.examen.Examen.Domain.Clientes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author antoniolonginos
 */

@Repository
public interface ClienteRepo extends JpaRepository<Clientes, Long>{
    
}
