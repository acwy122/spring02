
package com.mashibing.controller;

import com.mashibing.service.PersonService;
import com.mashibing.service.PersonService2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

@Controller
public class PersonController {
    /**
     * 通过@AutoWired注解能够完成自动注入的功能
     *      是按照什么方式进行自动注入的呢？
     *
     *      默认情况是按照类型byType来进行装配的
     *      如果找到直接赋值，找不到直接报错
     *      如果有多个类型一样的bean类对象，此时会按照id来进行查找，默认的id是类名的首字母小写
     *      如果找到直接注入，找不到直接报错
     *
     *      如果想要通过名字进行查找，可以自己规定名称，使用@Qualifier("personService")注解
     */
    @Autowired
    @Qualifier("personService")
    private PersonService personService2;

    public void save(){
        personService2.save();
    }
}
