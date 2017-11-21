package com.boot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.boot.model.Role;

public interface RoleRepository extends JpaRepository<Role, Long>{
}
