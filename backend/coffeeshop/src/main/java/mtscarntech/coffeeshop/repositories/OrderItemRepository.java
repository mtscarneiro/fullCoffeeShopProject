package mtscarntech.coffeeshop.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import mtscarntech.coffeeshop.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
