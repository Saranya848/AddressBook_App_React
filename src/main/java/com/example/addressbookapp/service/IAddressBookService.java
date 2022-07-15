package com.example.addressbookapp.service;

import com.example.addressbookapp.dto.ContactDTO;
import com.example.addressbookapp.model.Contact;

import java.util.List;

public interface IAddressBookService {
    List<Contact> getContact();

    void deleteContact(int contactId);

    Contact updateContact(int contactId, ContactDTO contactDTO);

    Contact createContact(ContactDTO contactDTO);

    Contact getContactById(int contactId);

    List<Contact> getContactByCity(String city);

    List<Contact> sortByCity();

    List<Contact> sortByState();
}