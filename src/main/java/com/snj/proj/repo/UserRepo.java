package com.snj.proj.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RestController;

import com.snj.proj.dao.User;

@Repository
public interface UserRepo extends JpaRepository<User, Integer> {

}
