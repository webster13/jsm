package com.webster.jsm.module.sys.entity;

import com.webster.jsm.core.entity.BaseEntity;
import org.springframework.stereotype.Repository;

import javax.persistence.*;
import java.util.Date;

@Repository
@Table(name = "sys_file")
public class File extends BaseEntity{


    @Column(name = "file_name")
    private String fileName;

    @Column(name = "file_path")
    private String filePath;

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }
}