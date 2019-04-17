package io.github.jhipster.application.service;

import io.github.jhipster.application.domain.Period;
import io.github.jhipster.application.domain.Project;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProjectService {

    private final PeriodService periodService;

    public ProjectService(PeriodService periodService) {
        this.periodService = periodService;
    }

    public Period save (Project project) throws Exception {

        Period period = periodService.getPeriodById(project.getPeriod());
        HashSet<Project> projects = period.getProjects() == null ? new HashSet<>() : period.getProjects();
        int id = (projects.size() + 1);
        project.setId(id+"");
        projects.add(project);
        period.setProjects(projects);

        return periodService.update(period);
    }

    public Period update (Project project) throws Exception {

        Period period = periodService.getPeriodById(project.getPeriod());
        HashSet<Project> projects = period.getProjects() == null ? new HashSet<>() : period.getProjects();

        projects.forEach(p->{
            if(p.getId().equalsIgnoreCase(project.getId())){
                p.setName(project.getName());
                p.setNumStudent(project.getNumStudent());
                p.setStatus(project.getStatus());
                p.setSchedule(project.getSchedule());
                p.setTeam(project.getTeam() == null ? p.getTeam() : project.getTeam());
            }

        });

        return periodService.update(period);
    }

    public List<Project> getAll (String id) throws Exception {
        Period period = periodService.getPeriodById(id);
        return period.getProjects().stream().collect(Collectors.toList());
    }

    public boolean delete (Project project) throws Exception {
        Period period = periodService.getPeriodById(project.getPeriod());
        HashSet<Project> projects = new HashSet<>();
        period.getProjects().forEach(p -> {
            if(!p.getId().equalsIgnoreCase(project.getId()))
                projects.add(p);
        });
        period.setProjects(projects);
        periodService.update(period);
        return true;
    }


}
