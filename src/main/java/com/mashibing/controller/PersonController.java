
package com.mashibing.controller;

import com.mashibing.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

@Controller
public class PersonController {
    @Autowired
    private PersonService personService;

    public void save(){
        personService.save();
    }
}
