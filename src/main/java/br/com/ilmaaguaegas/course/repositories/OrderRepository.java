package br.com.ilmaaguaegas.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.ilmaaguaegas.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
