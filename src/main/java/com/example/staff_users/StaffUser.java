package com.example.staff_users;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "staff_users", schema = "public")
public class StaffUser {

    @Id
    @Column(name = "user_id", length = 40, nullable = false)
    private UUID userId;

    @Column(name = "name", length = 100, nullable = false)
    private String name;

    @Column(name = "username", length = 50, unique = true, nullable = false)
    private String username;

    @Column(name = "mob_phone", length = 50, unique = true, nullable = false)
    private String mobPhone;

    @Column(name = "passwd", length = 100, nullable = false)
    private String passwd;

    @Column(name = "acc_level", length = 20, nullable = false)
    private String accessLevel;

    @Column(name = "status", length = 20, nullable = false)
    private String status;

    @Column(name = "a_created", nullable = false)
    private LocalDateTime aCreated;

    // Constructors

    public StaffUser() {
        // Default constructor
    }

    public StaffUser(UUID userId, String name, String username, String mobPhone, String passwd,
                     String accessLevel, String status, LocalDateTime aCreated) {
        this.userId = userId;
        this.name = name;
        this.username = username;
        this.mobPhone = mobPhone;
        this.passwd = passwd;
        this.accessLevel = accessLevel;
        this.status = status;
        this.aCreated = aCreated;
    }

    // Getters and Setters

    public UUID getUserId() {
        return userId;
    }

    public void setUserId(UUID userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getMobPhone() {
        return mobPhone;
    }

    public void setMobPhone(String mobPhone) {
        this.mobPhone = mobPhone;
    }

    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }

    public String getAccessLevel() {
        return accessLevel;
    }

    public void setAccessLevel(String accessLevel) {
        this.accessLevel = accessLevel;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public LocalDateTime getACreated() {
        return aCreated;
    }

    public void setACreated(LocalDateTime aCreated) {
        this.aCreated = aCreated;
    }
    public static class Builder {
        private StaffUser staffUser;

        public Builder() {
            this.staffUser = new StaffUser();
        }

        public Builder name(String name) {
            this.staffUser.name = name;
            return this;
        }

        public Builder username(String username) {
            this.staffUser.username = username;
            return this;
        }

        public Builder mobPhone(String mobPhone) {
            this.staffUser.mobPhone = mobPhone;
            return this;
        }

        public Builder passwd(String passwd) {
            this.staffUser.passwd = passwd;
            return this;
        }

        public Builder accessLevel(String accessLevel) {
            this.staffUser.accessLevel = accessLevel;
            return this;
        }

        public Builder status(String status) {
            this.staffUser.status = status;
            return this;
        }

        public Builder aCreated(LocalDateTime aCreated) {
            this.staffUser.aCreated = aCreated;
            return this;
        }

        public StaffUser build() {
            return this.staffUser;
        }
    }
}
