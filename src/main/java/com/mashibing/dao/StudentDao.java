package com.mashibing.dao;

import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

@Repository
public class StudentDao extends BaseDao<StudentDao> {

    public void save(){
        System.out.println("保存学生");
    }
}
