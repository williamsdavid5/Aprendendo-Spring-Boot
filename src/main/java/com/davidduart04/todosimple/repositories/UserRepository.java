package com.davidduart04.todosimple.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.davidduart04.todosimple.models.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
