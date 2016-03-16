package com.webster.jsm.module.sys.entity;

import com.webster.jsm.core.entity.PersonEntity;
import org.springframework.stereotype.Repository;

import javax.persistence.*;
import java.util.Date;

@Repository
@Table(name = "sys_student")
public class Student extends PersonEntity{

}