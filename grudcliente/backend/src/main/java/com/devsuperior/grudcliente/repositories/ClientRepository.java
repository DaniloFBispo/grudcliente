package com.devsuperior.grudcliente.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.devsuperior.grudcliente.entities.Client;


@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {

}
