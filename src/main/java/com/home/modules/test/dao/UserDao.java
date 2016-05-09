package com.home.modules.test.dao;


import com.home.modules.test.entity.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface UserDao extends CrudRepository<User, Long> {

    public User findByEmail(String email);

}
