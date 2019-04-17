package io.github.jhipster.application.web.rest;

import io.github.jhipster.application.domain.Period;
import io.github.jhipster.application.service.PeriodService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/period")
public class PeriodController {

    private final PeriodService periodService;

    public PeriodController(PeriodService periodService) {
        this.periodService = periodService;
    }

    @PostMapping("/create")
    public Period create(@RequestBody Period period){
        return periodService.save(period);
    }

    @PutMapping("/update")
    public Period update(@RequestBody Period period) throws Exception {
        return periodService.update(period);
    }

    @GetMapping("/get-all")
    public List<Period> getAll() throws Exception {
        return periodService.getAll();
    }

    @DeleteMapping("/delete")
    public boolean delete(@RequestBody Period period) throws Exception {
        return periodService.delete(period);
    }
}
