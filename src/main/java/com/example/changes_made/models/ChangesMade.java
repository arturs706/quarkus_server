package com.example.changes_made.models;

import com.example.staff_users.StaffUser;
import jakarta.persistence.*;
import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "changes_made", schema = "public")
public class ChangesMade {

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

    @Column(name = "target_user", length = 100)
    private String targetUser;

    // Constructors

    public ChangesMade() {
        // Default constructor
    }

    public ChangesMade(UUID entryId, LocalDateTime timestamp, String description, String actionType, String targetUser) {
        this.entryId = entryId;
        this.timestamp = timestamp;
        this.description = description;
        this.actionType = actionType;
        this.targetUser = targetUser;
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

    public String getTargetUser() {
        return targetUser;
    }

    public void setTargetUser(String targetUser) {
        this.targetUser = targetUser;
    }
}
