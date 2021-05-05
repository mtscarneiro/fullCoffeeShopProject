package mtscarntech.coffeeshop.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import mtscarntech.coffeeshop.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
