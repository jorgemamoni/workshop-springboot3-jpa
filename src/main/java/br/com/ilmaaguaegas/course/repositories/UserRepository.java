package br.com.ilmaaguaegas.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.ilmaaguaegas.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
