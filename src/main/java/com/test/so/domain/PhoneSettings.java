package com.test.so.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by azizunsal on 24/02/15.
 */
@Entity
@Table(name = "phone_settings", catalog = "dialer")
public class PhoneSettings implements java.io.Serializable {
    
    @Id
    private Long id;
    private String name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "PhoneSettings{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}