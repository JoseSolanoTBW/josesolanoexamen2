package io.github.jhipster.application.service;

import io.github.jhipster.application.domain.Student;
import io.github.jhipster.application.repository.StudentRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * Service Implementation for managing Student.
 */
@Service
public class StudentService {

    private final Logger log = LoggerFactory.getLogger(StudentService.class);

    private final StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    /**
     * Save a student.
     *
     * @param student the entity to save
     * @return the persisted entity
     */
    public Student save(Student student) {
        log.debug("Request to save Student : {}", student);
        return studentRepository.save(student);
    }

    /**
     * Get all the students.
     *
     * @return the list of entities
     */
    public List<Student> findAll() {
        log.debug("Request to get all Students");
        return studentRepository.findAllWithEagerRelationships();
    }

    /**
     * Get all the Student with eager load of many-to-many relationships.
     *
     * @return the list of entities
     */
    public Page<Student> findAllWithEagerRelationships(Pageable pageable) {
        return studentRepository.findAllWithEagerRelationships(pageable);
    }
    

    /**
     * Get one student by id.
     *
     * @param id the id of the entity
     * @return the entity
     */
    public Optional<Student> findOne(String id) {
        log.debug("Request to get Student : {}", id);
        return studentRepository.findOneWithEagerRelationships(id);
    }

    /**
     * Delete the student by id.
     *
     * @param id the id of the entity
     */
    public void delete(String id) {
        log.debug("Request to delete Student : {}", id);
        studentRepository.deleteById(id);
    }
}
