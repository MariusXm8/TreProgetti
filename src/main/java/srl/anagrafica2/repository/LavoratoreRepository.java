package srl.anagrafica2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import srl.anagrafica2.additional.Lavoratore;

@Repository
public interface LavoratoreRepository extends JpaRepository<Lavoratore,Long>{

}
