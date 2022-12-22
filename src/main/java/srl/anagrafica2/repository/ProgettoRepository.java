package srl.anagrafica2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import srl.anagrafica2.model.Progetto;

@Repository
public interface ProgettoRepository extends JpaRepository<Progetto, Long>{

}
