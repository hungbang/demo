package com.example.demo.entity;

import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

/**
 * Created by KAI on 8/11/17.
 */

@Embeddable
public class BookAuthorsId implements Serializable{
    private Integer bookId;
    private Integer authorsId;

    public Integer getBookId() {
        return bookId;
    }

    public void setBookId(Integer bookId) {
        this.bookId = bookId;
    }

    public Integer getAuthorsId() {
        return authorsId;
    }

    public void setAuthorsId(Integer authorsId) {
        this.authorsId = authorsId;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((bookId == null) ? 0 : bookId.hashCode());
        result = prime * result + ((authorsId == null) ? 0 : authorsId.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj)
            return true;
        if(obj == null)
            return false;
        if(getClass() != obj.getClass())
            return false;
        BookAuthorsId bookAuthorsId = (BookAuthorsId)obj;
        return Objects.equals(bookId, bookAuthorsId.bookId) && Objects.equals(authorsId, bookAuthorsId.authorsId);
    }

    @Override
    public String toString() {
        return "BookAuthorsId [bookId=" + bookId + ", authorsId="+authorsId +"]";
    }
}
