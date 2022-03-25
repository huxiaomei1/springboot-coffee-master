package spring.springbucks.waiter.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import spring.springbucks.waiter.model.CoffeeOrder;

public interface CoffeeOrderRepository extends JpaRepository<CoffeeOrder, Long> {
}
