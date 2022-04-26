package com.mashibing.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class TeacherDao extends BaseDao<TeacherDao> {

    public void save(){
        System.out.println("保存老师");
    }
}
