package com.example.addressbookapp.dto;

import lombok.Data;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;

public @Data class ContactDTO {
//    @Pattern(regexp = "^[A-Z]{1}[a-zA-Z\\s]{2,}$", message = "First name is Invalid!!! ")
//    @NotEmpty(message = "first name cannot be null")
//    public String firstName;
//    @Pattern(regexp = "^[A-Z]{1,}[a-zA-z\\s]{2,}$", message = "Last name is Invalid!!! ")
//    @NotEmpty(message = "last name cannot be null")
//    public String lastName;
@Pattern(regexp = "^[A-Z]{1,}[a-zA-z\\s]{2,}$", message = "Last name is Invalid!!! ")
    @NotEmpty(message = "last name cannot be null")
    public String fullName;
    @NotEmpty(message = "Address cannot be empty")
    @Pattern(regexp = "^[A-Za-z,.0-9\\s]{3,}$", message = "Invalid address")
    public String address;

    @Pattern(regexp = "^[A-Z]{1}[a-zA-Z\\s]{2,}$", message = "State is Invalid!!! ")
    @NotEmpty(message = "State cannot be null")
    public String state;
    @Pattern(regexp = "^[A-Z]{1}[a-zA-Z\\s]{2,}$", message = "City is Invalid!!! ")
    @NotEmpty(message = "City cannot be null")
    public String city;
    @Pattern(regexp = "^[0-9]{3}\\s{0,1}[0-9]{3}$", message = "Zipcode is Invalid!!! ")
    @NotEmpty(message = "Zip cannot be null")
    public String zip;
//    @Pattern(regexp = "^[0-9]{2}?[\\s,-]{0,1}[7-9]{1}[0-9]{9}$", message = "Phoneno is Invalid!!! ")
    @Pattern(regexp = "^{0,1}[7-9]{1}[0-9]{9}$", message = "Phone number is Invalid")
    @NotEmpty(message = "Phoneno cannot be null")
    public String phone;

//    @NotEmpty(message = "Email cannot be empty!")
//    @Pattern(regexp = "^[a-zA-Z-9]+([._+-]*[0-9A-Za-z]+)*@[a-zA-Z0-9]+.[a-zA-Z]{2,4}([.][a-z]{2,4})?$",
//            message = "Invalid email")
//    public String email;


    public ContactDTO(String fullName, String address, String state, String city, String zip,
                      String phone) {
        super();
//        this.firstName = firstName;
//        this.lastName = lastName;
        this.fullName = fullName;
        this.address = address;
        this.state = state;
        this.city = city;
        this.zip = zip;
        this.phone = phone;
    }


}