package com.dev.adv.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dev.adv.entities.Advogado;

@Repository
public interface AdvogadoRepository extends JpaRepository<Advogado, Long>{

}
