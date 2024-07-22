package com.tharindi.Hotel_Vista.controller;

import com.tharindi.Hotel_Vista.model.Admin;
import com.tharindi.Hotel_Vista.service.AdminService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/admin")
public class AdminController {
    private final AdminService adminService;
    @Autowired
    public AdminController(AdminService adminService) {
        this.adminService = adminService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<Admin>> getAllAdmins(){
        List<Admin> adminList=adminService.findAllAdmin();
        return new ResponseEntity<>(adminList, HttpStatus.OK);
    }


    @GetMapping("/find/{id}")
    public ResponseEntity<Admin> getAdminById(@PathVariable("id") Long id){
        Admin admin=adminService.findAdmin(id);
        return new ResponseEntity<>(admin, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<Admin> addAdmin(@Valid @RequestBody Admin admin){
        Admin newAdmin=adminService.addAdmin(admin);
        return new ResponseEntity<>(newAdmin, HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public ResponseEntity<Admin> updateAdmin(@RequestBody Admin admin){
        Admin updateAdmin=adminService.updateAdmin(admin);
        return new ResponseEntity<>(updateAdmin, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteById(@PathVariable("id") Long id){
        adminService.deleteAdmin(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }


}
