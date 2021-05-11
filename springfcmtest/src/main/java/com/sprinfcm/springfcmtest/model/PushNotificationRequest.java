package com.sprinfcm.springfcmtest.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "pnr")
public class PushNotificationRequest {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Size(max = 250)
    private String title;

    @NotNull
    @Size(max = 250)
    private String message;

    @NotNull
    @Size(max = 250)
    private String topic;


    private String token;

    public PushNotificationRequest(String title, String message, String topic) {
    }

    public PushNotificationRequest(Long id,String title, String message, String topic, String token) {
        this.id=id;
        this.title = title;
        this.message = message;
        this.topic = topic;
        this.token = token;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
