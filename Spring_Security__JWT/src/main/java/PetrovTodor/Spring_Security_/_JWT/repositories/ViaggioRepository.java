package PetrovTodor.Spring_Security_._JWT.repositories;


import PetrovTodor.Spring_Security_._JWT.entities.Viaggio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface ViaggioRepository extends JpaRepository<Viaggio, UUID> {

}
