package spring.springbucks.waiter.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import spring.springbucks.waiter.model.Coffee;

import java.util.List;

public interface CoffeeRepository extends JpaRepository<Coffee, Long> {
    List<Coffee> findByNameInOrderById(List<String> list);

    Coffee findByName(String name);
}
