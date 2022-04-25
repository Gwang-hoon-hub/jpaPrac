package com.pang.jpaprac.hellloJpa;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Baord {

    @Id
    private Long id;
    private String name;
}
