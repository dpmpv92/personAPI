package com.dpmpv92.personAPI.person.model;

import com.dpmpv92.personAPI.address.model.Address;
import com.dpmpv92.personAPI.phone.model.Phone;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

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
    @JsonFormat(shape = JsonFormat.Shape.NUMBER)
    private Date birthdate;
    @OneToOne(cascade = CascadeType.ALL)
    private Phone phone;
    @OneToOne(cascade = CascadeType.ALL)
    private Address address;
}
