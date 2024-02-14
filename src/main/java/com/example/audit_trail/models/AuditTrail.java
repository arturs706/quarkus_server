package com.example.audit_trail.models;

import com.example.staff_users.StaffUser;
import jakarta.persistence.*;
import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "audit_trail", schema = "public")
public class AuditTrail {

    @Id
    @Column(name = "entry_id")
    private UUID entryId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", referencedColumnName = "user_id", nullable = false, insertable = false, updatable = false)
    private StaffUser staffUser;

    @Column(name = "timestamp", nullable = false)
    private LocalDateTime timestamp;

    @Column(name = "description", length = 255, nullable = false)
    private String description;

    @Column(name = "action_type", length = 20, nullable = false)
    private String actionType;

    @Column(name = "ip_address", length = 15)
    private String ipAddress;

    // Constructors

    public AuditTrail() {
        // Default constructor
    }

    public AuditTrail(UUID entryId, LocalDateTime timestamp, String description, String actionType, String ipAddress) {
        this.entryId = entryId;
        this.timestamp = timestamp;
        this.description = description;
        this.actionType = actionType;
        this.ipAddress = ipAddress;
    }

    // Getters and Setters

    public UUID getEntryId() {
        return entryId;
    }

    public void setEntryId(UUID entryId) {
        this.entryId = entryId;
    }

    public StaffUser getStaffUser() {
        return staffUser;
    }

    public void setStaffUser(StaffUser staffUser) {
        this.staffUser = staffUser;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getActionType() {
        return actionType;
    }

    public void setActionType(String actionType) {
        this.actionType = actionType;
    }

    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }
}
