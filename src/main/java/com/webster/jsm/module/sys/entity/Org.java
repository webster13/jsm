package com.webster.jsm.module.sys.entity;

import com.webster.jsm.core.entity.TreeEntity;
import org.springframework.stereotype.Repository;

import javax.persistence.*;
import java.util.Date;

@Repository
@Table(name = "sys_org")
public class Org extends TreeEntity{

}