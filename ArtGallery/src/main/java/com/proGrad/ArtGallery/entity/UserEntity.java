package com.proGrad.ArtGallery.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "user_log_data")

public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "emailId")
    private String emailId;

    @Column(name = "password")
    private String password;

    public UserEntity() {
    }

    public UserEntity(Long id, String emailId, String password) {
        this.id = id;
        this.emailId = emailId;
        this.password = password;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
