package com.goutham.MovieApplication.repository;

import com.goutham.MovieApplication.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {

    public List<User> getUserByUserName(String userName);

    List<User> getUserById(Long id);
}
