package com.stock.gestionstock.repository;

import com.stock.gestionstock.model.Utilisateur;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UtilisateurRepository extends JpaRepository<Integer, Utilisateur> {
}
