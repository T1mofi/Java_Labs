package com.compare.numbers.entity;

import javax.persistence.*;


@Entity
public class Input {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer id;

    private String params;

    public Input() {
    }

    public Input(String params) {
        this.params = params;
    }


    public String getParams() {
        return params;
    }

    public void setParams(String params) {
        this.params = params;
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

}

