package com.webster.jsm.module.sys.entity;

import com.webster.jsm.core.entity.PersonEntity;
import org.springframework.stereotype.Repository;

import javax.persistence.*;

@Repository
@Table(name = "sys_staff")
public class Staff extends PersonEntity{

}