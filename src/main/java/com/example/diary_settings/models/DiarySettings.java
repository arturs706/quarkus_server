package com.example.diary_settings.models;

import com.example.staff_users.StaffUser;
import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "diary_settings", schema = "public")
public class DiarySettings {

    @Id
    @Column(name = "staff_id")
    private UUID staffId;

    @Column(name = "diary_colour", length = 20)
    private String diaryColour;

    @Column(name = "popup_notifi_en")
    private Boolean popupNotificationEnabled;

    @Column(name = "email_notifi_en")
    private Boolean emailNotificationEnabled;

    @Column(name = "updated_at", nullable = false)
    private LocalDateTime updatedAt;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "staff_id", referencedColumnName = "user_id", insertable = false, updatable = false)
    private StaffUser staffUser;

    // Constructors

    public DiarySettings() {
        // Default constructor
    }

    public DiarySettings(UUID staffId, String diaryColour, Boolean popupNotificationEnabled,
                         Boolean emailNotificationEnabled, LocalDateTime updatedAt) {
        this.staffId = staffId;
        this.diaryColour = diaryColour;
        this.popupNotificationEnabled = popupNotificationEnabled;
        this.emailNotificationEnabled = emailNotificationEnabled;
        this.updatedAt = updatedAt;
    }

    // Getters and Setters

    public UUID getStaffId() {
        return staffId;
    }

    public void setStaffId(UUID staffId) {
        this.staffId = staffId;
    }

    public String getDiaryColour() {
        return diaryColour;
    }

    public void setDiaryColour(String diaryColour) {
        this.diaryColour = diaryColour;
    }

    public Boolean getPopupNotificationEnabled() {
        return popupNotificationEnabled;
    }

    public void setPopupNotificationEnabled(Boolean popupNotificationEnabled) {
        this.popupNotificationEnabled = popupNotificationEnabled;
    }

    public Boolean getEmailNotificationEnabled() {
        return emailNotificationEnabled;
    }

    public void setEmailNotificationEnabled(Boolean emailNotificationEnabled) {
        this.emailNotificationEnabled = emailNotificationEnabled;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    public StaffUser getStaffUser() {
        return staffUser;
    }

    public void setStaffUser(StaffUser staffUser) {
        this.staffUser = staffUser;
    }
}
