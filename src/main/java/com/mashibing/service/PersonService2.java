package com.mashibing.service;

import com.mashibing.dao.PersonDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonService2 {

    @Autowired
    private PersonDao personDao;

    public void save(){
        System.out.println("personService2.......");
        personDao.save();
    }
}
