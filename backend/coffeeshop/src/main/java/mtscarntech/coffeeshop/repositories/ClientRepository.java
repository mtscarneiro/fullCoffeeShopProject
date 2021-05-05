package mtscarntech.coffeeshop.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import mtscarntech.coffeeshop.entities.Client;

public interface ClientRepository extends JpaRepository<Client, Long> {

}
