package io.github.jhipster.application.repository;

import io.github.jhipster.application.domain.Period;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PeriodRepository extends MongoRepository<Period, String> {

    Optional<Period> findByName();
}
