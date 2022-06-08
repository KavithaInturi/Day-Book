package com.dairyfarm.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dairyfarm.entity.auth.Role;

import java.util.Optional;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(String name);
}
