package io.github.jhipster.application.domain;

import java.util.HashSet;

public class Student {

    private String name;

    private String lastName;

    private String role;

    private String status;

    private HashSet<Story> stories = new HashSet<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public HashSet<Story> getStories() {
        return stories;
    }

    public void setStories(HashSet<Story> stories) {
        this.stories = stories;
    }
}
