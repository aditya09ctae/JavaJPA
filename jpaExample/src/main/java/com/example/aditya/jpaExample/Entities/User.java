package com.example.aditya.jpaExample.Entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User implements Serializable{

    @Id
    @GeneratedValue
    private Integer id;

    private String name;

    private String branch;

    private Double salary;
}
