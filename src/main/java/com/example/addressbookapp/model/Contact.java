package com.example.addressbookapp.model;

import com.example.addressbookapp.dto.ContactDTO;
import lombok.Data;

import javax.persistence.*;


@Data
@Entity
@Table(name = "addressbook_table")
public class Contact {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private int contactId;

    @Column(name = "full_name")
    private String fullName;

//    @Column(name = "last_name")
//    private String lastName;

    @Column(name = "address")
    private String address;

    @Column(name = "state")
    private String state;

    @Column(name = "city")
    private String city;

    @Column(name = "zip")
    private String zip;

    @Column(name = "phone")
    private String phone;

//    @Column(name = "email")
//    private String email;

    public Contact() {
    }

    public Contact( ContactDTO contactDTO) {
        this.updateAddressBookData(contactDTO);
    }

    public void updateAddressBookData(ContactDTO contactDTO)
    {

//        this.firstName = contactDTO.firstName;
        this.fullName = contactDTO.fullName;
        this.address = contactDTO.address;
        this.state = contactDTO.state;
        this.city = contactDTO.city;
        this.zip = contactDTO.zip;
        this.phone = contactDTO.phone;
//        this.email = contactDTO.email;

    }

}