package com.daw.calculadora.shared.dominio.repositorio;

import com.daw.calculadora.shared.dominio.entities.OperacionEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface OperacionRepositorio extends CrudRepository<OperacionEntity,Long> {



}
