package com.OovEver.spring.boot.bootstrap.repository;

import org.springframework.data.repository.CrudRepository;

import com.OovEver.spring.boot.bootstrap.domain.User;

/**
 * 用户仓库.
 */
public interface UserRepository extends CrudRepository<User, Long>{
}
