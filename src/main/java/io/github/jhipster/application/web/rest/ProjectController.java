package io.github.jhipster.application.web.rest;

import io.github.jhipster.application.domain.Period;
import io.github.jhipster.application.domain.Project;
import io.github.jhipster.application.service.PeriodService;
import io.github.jhipster.application.service.ProjectService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/project")
public class ProjectController {

    private final ProjectService periodService;

    public ProjectController(ProjectService periodService) {
        this.periodService = periodService;
    }

    @PostMapping("/create")
    public Period create(@RequestBody Project project) throws Exception {
        return periodService.save(project);
    }

    @PutMapping("/update")
    public Period update(@RequestBody Project project) throws Exception {
        return periodService.update(project);
    }

    @GetMapping("/get-all")
    public List<Project> getAll(@RequestParam String period) throws Exception {
        return periodService.getAll(period);
    }

    @DeleteMapping("/delete")
    public boolean delete(@RequestBody Project project) throws Exception {
        return periodService.delete(project);
    }
}
