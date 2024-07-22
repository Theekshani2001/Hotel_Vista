package com.tharindi.Hotel_Vista.service;

import com.tharindi.Hotel_Vista.exception.AdminNotFoundException;
import com.tharindi.Hotel_Vista.exception.EmployeeNotFoundException;
import com.tharindi.Hotel_Vista.model.Admin;
import com.tharindi.Hotel_Vista.model.Employee;
import com.tharindi.Hotel_Vista.repository.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminService {

    private final AdminRepository adminRepository;
    @Autowired
    public AdminService(AdminRepository adminRepository) {
        this.adminRepository = adminRepository;
    }

    public Admin addAdmin(Admin admin){
        return adminRepository.save(admin);
    }

    public List<Admin> findAllAdmin(){
        return adminRepository.findAll();
    }

    public Admin updateAdmin(Admin admin){
        return adminRepository.save(admin);
    }

    public Admin findAdmin(Long id){
        return adminRepository.findAdminById(id).orElseThrow(() -> new AdminNotFoundException("Admin by id "+id+"was not found"));
    }

    public void deleteAdmin(Long id){
        adminRepository.deleteById(id);
    }
}
