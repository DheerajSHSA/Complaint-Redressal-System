package com.crs.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.crs.model.User;
import com.crs.model.UserType;

@Repository
public interface UserRepo extends JpaRepository<User, String>{
    @Query("FROM User WHERE name=?1 and password = ?2 and usertype=?3") 
	public User getUserByUsernameAndPaswordAndRole(String name, String password, UserType usertype);
}
