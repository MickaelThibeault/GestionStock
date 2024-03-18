package com.stock.gestionstock.repository;

import com.stock.gestionstock.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Integer, Client> {
}
