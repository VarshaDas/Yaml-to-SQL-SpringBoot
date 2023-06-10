package com.varsha.yamlparser.repository;

import com.varsha.yamlparser.models.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<Person,Long> {
}
