package com.co.sofka.testnoreactivo.Repositories;

import com.co.sofka.testnoreactivo.Models.Empleado;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface RepositorioEmpleado extends MongoRepository<Empleado, String> {

}
