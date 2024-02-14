package com.example.notes.models;

import com.example.staff_users.StaffUser;
import jakarta.persistence.*;
import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "notes", schema = "public")
public class Note {

    @Id
    @Column(name = "note_id")
    private UUID noteId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", referencedColumnName = "user_id", nullable = false, insertable = false, updatable = false)
    private StaffUser staffUser;

    @Column(name = "timestamp", nullable = false)
    private LocalDateTime timestamp;

    @Column(name = "note_text", columnDefinition = "TEXT", nullable = false)
    private String noteText;

    // Constructors

    public Note() {
        // Default constructor
    }

    public Note(UUID noteId, LocalDateTime timestamp, String noteText) {
        this.noteId = noteId;
        this.timestamp = timestamp;
        this.noteText = noteText;
    }

    // Getters and Setters

    public UUID getNoteId() {
        return noteId;
    }

    public void setNoteId(UUID noteId) {
        this.noteId = noteId;
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

    public String getNoteText() {
        return noteText;
    }

    public void setNoteText(String noteText) {
        this.noteText = noteText;
    }
}
