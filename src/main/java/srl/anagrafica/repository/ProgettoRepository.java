package srl.anagrafica.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import srl.anagrafica.model.Progetto;

@Repository
public interface ProgettoRepository extends JpaRepository<Progetto, Long>{

}
