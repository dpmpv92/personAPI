package com.dpmpv92.personAPI.person.model;

import com.dpmpv92.personAPI.address.model.Address;
import com.dpmpv92.personAPI.phone.model.Phone;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.joda.time.DateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Person {
    @Id
    @GeneratedValue
    private long id;

    private String name;
    private String company;
    private boolean favorite;
    private String smallImageURL;
    private String largeImageURL;
    private String email;
    private DateTime birthdate;
    @OneToOne
    private Phone phone;
    @OneToOne
    private Address address;

}
