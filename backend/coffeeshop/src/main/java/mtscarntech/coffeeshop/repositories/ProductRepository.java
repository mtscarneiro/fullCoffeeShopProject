package mtscarntech.coffeeshop.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import mtscarntech.coffeeshop.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
