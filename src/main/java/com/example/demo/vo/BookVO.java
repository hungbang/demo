package com.example.demo.vo;

import java.util.List;

/**
 * Created by KAI on 8/12/17.
 */
public class BookVO {
    private Integer id;
    private String name;
    private List<String> authorsName;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getAuthorsName() {
        return authorsName;
    }

    public void setAuthorsName(List<String> authorsName) {
        this.authorsName = authorsName;
    }
}
