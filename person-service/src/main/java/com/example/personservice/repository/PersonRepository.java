package com.example.personservice.repository;

import com.example.personservice.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.persistence.*;

public interface PersonRepository extends JpaRepository<Person,Long> {
}
