package io.github.jhipster.application.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.Instant;
import java.util.HashSet;

@Document
public class Period {

    @org.springframework.data.annotation.Id
    private String id;

    private String name;

    private Instant startDate;

    private Instant endDate;

    private HashSet<Project> projects;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Instant getStartDate() {
        return startDate;
    }

    public void setStartDate(Instant startDate) {
        this.startDate = startDate;
    }

    public Instant getEndDate() {
        return endDate;
    }

    public void setEndDate(Instant endDate) {
        this.endDate = endDate;
    }

    public HashSet<Project> getProjects() {
        return projects;
    }

    public void setProjects(HashSet<Project> projects) {
        this.projects = projects;
    }
}
