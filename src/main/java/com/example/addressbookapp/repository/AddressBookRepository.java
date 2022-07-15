package com.example.addressbookapp.repository;

import com.example.addressbookapp.model.Contact;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AddressBookRepository extends JpaRepository<Contact,Integer>, AddressBookRepository1 {
    @Query(value = "select * from addressbook_table where city= :city", nativeQuery = true)
    List<Contact> findContactListByCity(String city);

    @Query(value = "select * from addressbook_table order by city", nativeQuery = true)
    List<Contact> sortByCity();

    @Query(value="select * from addressbook_table order by state",nativeQuery = true)
    List<Contact> sortByState();
    boolean existsDistinctByFullName(String FullName);
}
