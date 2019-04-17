package io.github.jhipster.application.service;

import io.github.jhipster.application.domain.Period;
import io.github.jhipster.application.repository.PeriodRepository;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class PeriodService {

    private final PeriodRepository periodRepository;

    public PeriodService(PeriodRepository periodRepository) {
        this.periodRepository = periodRepository;
    }

    public Period save (Period period)
    {
        period.setStartDate(Instant.now());

        LocalDateTime time = LocalDateTime.ofInstant(period.getStartDate(), ZoneOffset.ofHours(0));

        time = time.plus(4, ChronoUnit.MONTHS);

        period.setEndDate(time.atZone(ZoneOffset.ofHours(0)).toInstant());
        
        return periodRepository.save(period);
    }

    public Period update (Period period) throws Exception {
        Optional<Period> periodOptional = periodRepository.findById(period.getId());

        if(!periodOptional.isPresent())
            throw new Exception("No existe el periodo");

        Period periodDb = periodOptional.get();

        period.setName(period.getName() == null ? periodDb.getName() : period.getName());
        period.setEndDate(period.getEndDate() == null ? periodDb.getEndDate() : period.getEndDate());
        period.setStartDate(period.getStartDate() == null ? periodDb.getStartDate() : period.getStartDate());
        period.setProjects(period.getProjects() == null ? periodDb.getProjects() : period.getProjects());

        return periodRepository.save(period);
    }

    public List<Period> getAll (){
        return periodRepository.findAll();
    }

    public boolean delete(Period period) throws Exception {
        Optional<Period> periodOptional = periodRepository.findById(period.getId());

        if(!periodOptional.isPresent())
            throw new Exception("No existe el periodo");

        Period periodDb = periodOptional.get();

        periodRepository.delete(periodDb);

        return true;
    }
}
