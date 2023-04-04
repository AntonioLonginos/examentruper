package mx.com.examen.Examen.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import mx.com.examen.Examen.Domain.Clientes;
import mx.com.examen.Examen.repo.ClienteRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author antoniolonginos
 */
@RestController
public class Controller {

    @Autowired
    private ClienteRepo clienteRepo;

    @PostMapping("/addCliente")
    public ResponseEntity<Clientes> addBook(@RequestBody Clientes clientes) {
        Clientes clienteObj = clienteRepo.save(clientes);
        return new ResponseEntity<>(clienteObj, HttpStatus.OK);
    }

    @GetMapping("/getListaCliente/{id}")
    public ResponseEntity<Clientes> getBookById(@PathVariable Long id) {
        Optional<Clientes> clienteData = clienteRepo.findById(id);

        if (clienteData.isPresent()) {
            return new ResponseEntity<>(clienteData.get(), HttpStatus.OK);
        }

        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

}
