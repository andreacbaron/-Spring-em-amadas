package com.devsuperior.apicamadas.repository;

import com.devsuperior.apicamadas.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long>  {
}
