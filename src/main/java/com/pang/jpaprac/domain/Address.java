package com.pang.jpaprac.domain;

import javax.persistence.Embeddable;
import javax.persistence.Entity;


@Embeddable // jpa 의 내장타입이다.
public class Address {

    private String city;
    private String street;
    private String zipcode;
}
