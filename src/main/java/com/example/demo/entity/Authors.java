package com.example.demo.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

/**
 * Created by KAI on 8/11/17.
 */
@Entity
@Table(name = "authors")
public class Authors implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", unique = true, nullable = false)
    private Integer id;

    @Column
    private String name;

    @OneToMany(mappedBy = "authors")
    private List<BookAuthors> bookAuthors;

    @Version
    private int version;

    public List<BookAuthors> getBookAuthors() {
        return bookAuthors;
    }

    public void setBookAuthors(List<BookAuthors> bookAuthors) {
        this.bookAuthors = bookAuthors;
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

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


}
