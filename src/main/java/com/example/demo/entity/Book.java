package com.example.demo.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

/**
 * Created by KAI on 8/11/17.
 */
@Entity
@Table(name = "book")
public class Book implements Serializable {
    @Id
    @Column(name = "id", unique = true, nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column
    private String name;

    @OneToMany(mappedBy = "book")
    private List<BookAuthors> bookAuthors;

    public List<BookAuthors> getBookAuthors() {
        return bookAuthors;
    }

    public void setBookAuthors(List<BookAuthors> bookAuthors) {
        this.bookAuthors = bookAuthors;
    }

    @Version

    private int version;

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
