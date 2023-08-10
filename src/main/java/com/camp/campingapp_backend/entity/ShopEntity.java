package com.camp.campingapp_backend.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.stereotype.Repository;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Getter
@Setter
@Repository
@ToString
@Table(name = "shop")
public class ShopEntity {

    @Id @Column(name = "shopId")
    private int shopId;

    @Column(columnDefinition = "text")
    private String name;

    @Column(columnDefinition = "text")
    private String tel;

    @Column(columnDefinition = "text")
    private String addr;


    private double lat;


    private double lnt;

    @Column(columnDefinition = "text")
    private String info;
}
