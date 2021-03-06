package com.pang.jpaprac.domain.item;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
@Getter @Setter
@DiscriminatorValue("B")
public class Book extends Item{

    private String author;
    private Long isbn;
}
