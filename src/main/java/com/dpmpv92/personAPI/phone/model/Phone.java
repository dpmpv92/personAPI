package com.dpmpv92.personAPI.phone.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
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
