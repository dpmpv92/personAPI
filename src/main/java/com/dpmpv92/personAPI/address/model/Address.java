package com.dpmpv92.personAPI.address.model;

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
public class Address {
    @Id
    @GeneratedValue
    private long id;
    private String street;
    private String city;
    private String state;
    private String country;
    private String zip;
    private Double latitude;
    private Double longitude;
}
