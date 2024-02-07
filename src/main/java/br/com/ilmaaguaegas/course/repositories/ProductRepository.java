package br.com.ilmaaguaegas.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.ilmaaguaegas.course.entities.Category;
import br.com.ilmaaguaegas.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
