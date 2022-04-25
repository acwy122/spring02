
package com.mashibing.controller;

import com.mashibing.service.PersonService;
import com.mashibing.service.PersonService2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

@Controller
public class PersonController {
    /**
     * 通过@AutoWired注解能够完成自动注入的功能
     *      是按照什么方式进行自动注入的呢？
     *
     * 默认情况是按照类型byType来进行装配的
     */
    @Autowired
    private PersonService personService;

    public void save(){
        personService.save();
    }
}
