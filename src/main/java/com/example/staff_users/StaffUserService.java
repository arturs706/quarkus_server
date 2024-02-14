package com.example.staff_users;

import java.util.Optional;
import java.util.UUID;


public class StaffUserService {

    private StaffUserRepository staffRepository;

    public StaffUserService(StaffUserRepository staffRepository) {
        this.staffRepository = staffRepository;
    }

    public StaffUser findById(UUID id) throws StaffUserNotFoundException {

        Optional<StaffUser> staffUser = staffRepository.findById(id);

        if (staffUser.isEmpty()) {
            throw new StaffUserNotFoundException();
        }
        return staffUser.get();
    }
}