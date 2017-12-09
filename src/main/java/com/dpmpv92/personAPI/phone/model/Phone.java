package com.dpmpv92.personAPI.phone.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Phone {
    @Id
    @GeneratedValue
    private long id;
    private String work;
    private String home;
    private String mobile;
    private String other;
    private String fax;
    private String bussines;
}
