package com.mashibing.controller;

import com.mashibing.bean.Teacher;
import com.mashibing.dao.BaseDao;
import com.mashibing.dao.StudentDao;
import com.mashibing.dao.TeacherDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class BaseController {

//    @Autowired
//    TeacherDao teacherDao;
//    @Autowired
//    StudentDao studentDao;

    @Autowired
    BaseDao<Teacher> baseDao;

    public void save(){
        baseDao.save();
    }


}
