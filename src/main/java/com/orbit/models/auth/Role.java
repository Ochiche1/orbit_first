package com.orbit.models.auth;



import javax.persistence.EnumType;
import javax.persistence.Enumerated;


public class Role {

    private Integer id;

    @Enumerated(EnumType.STRING)
    private EnumRole name;

    public Role() {
    }

    public Role(Integer id, EnumRole name) {
        this.id = id;
        this.name = name;
    }

    public Role(EnumRole name) {
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public EnumRole getName() {
        return name;
    }

    public void setName(EnumRole name) {
        this.name = name;
    }
}
