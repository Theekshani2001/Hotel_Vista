package com.tharindi.Hotel_Vista.repository;

import com.tharindi.Hotel_Vista.model.Admin;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface AdminRepository extends JpaRepository<Admin,Long> {
    Optional<Admin> findAdminById(Long id);
}
