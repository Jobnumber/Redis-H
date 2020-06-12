package com.example.demo.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

@Data
@Entity
public class User implements Serializable {


    private static final long serialVersionUID = -3055518357571903443L;
    @Id
    private Integer id;
    private String name;
    private Integer age;

}
