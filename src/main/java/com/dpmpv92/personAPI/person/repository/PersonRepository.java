package com.dpmpv92.personAPI.person.repository;

import com.dpmpv92.personAPI.person.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.support.JpaRepositoryFactory;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

@RepositoryRestResource
public interface PersonRepository extends PagingAndSortingRepository<Person, Long> {
}
