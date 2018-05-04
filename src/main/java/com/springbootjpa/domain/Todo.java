package com.springbootjpa.domain;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "todo")
public class Todo {

    @Id
    @GeneratedValue
    Long id;
}
