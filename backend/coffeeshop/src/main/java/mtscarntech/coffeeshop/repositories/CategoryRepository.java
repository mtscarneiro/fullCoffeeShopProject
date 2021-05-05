package mtscarntech.coffeeshop.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import mtscarntech.coffeeshop.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
