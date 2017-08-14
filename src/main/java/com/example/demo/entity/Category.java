package com.example.demo.entity;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by KAI on 8/11/17.
 */

@Entity
@Table(name = "category")
public class Category implements Serializable{

    private Integer id;
    private String name;

    @Id
    @Column(name = "cate_id", unique = true, nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Column(name = "cate_name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
