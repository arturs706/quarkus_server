package com.example.staff_users;


import io.quarkus.hibernate.orm.panache.PanacheRepository;

import jakarta.enterprise.context.ApplicationScoped;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@ApplicationScoped
public class StaffUserRepository implements PanacheRepository<StaffUser> {

    public List<StaffUser> findAllStaffUsers() {
        return listAll();
    }

    public Optional<StaffUser> findById(UUID userId) {
        return find("userId", userId).firstResultOptional();
    }
    public List<StaffUser> findByName(String name) {
        return find("name", name).list();
    }

    public List<StaffUser> findByUsername(String username) {
        return find("username", username).list();
    }

    public List<StaffUser> findByMobPhone(String mobPhone) {
        return find("mobPhone", mobPhone).list();
    }

    public List<StaffUser> findByAccessLevel(String accessLevel) {
        return find("accessLevel", accessLevel).list();
    }


}