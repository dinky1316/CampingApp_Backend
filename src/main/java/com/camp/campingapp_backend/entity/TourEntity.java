package com.camp.campingapp_backend.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.stereotype.Repository;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Repository
@ToString
@Table(name = "tour")
public class TourEntity {

    @Id @Column(name="tourid")
    private int tourid;

    @Column(columnDefinition = "text")
    private String  name;

    @Column(columnDefinition = "text")
    private String tourtype;


    @Column(columnDefinition = "text")
    private String addr1;


    @Column(columnDefinition = "text")
    private String addr2;

    @Column(name = "x")
    private double x;

    @Column(name = "y")
    private double y;

    @Column(columnDefinition = "text")
    private String Convenience;

    @Column(columnDefinition = "text")
    private String info;

    @Column(columnDefinition = "text")
    private String tel;

    @Column(columnDefinition = "text")
    private String agencyname;

    @Column(columnDefinition = "text")
    private  String updatedate;

    @Column(columnDefinition = "text")
    private String providername;





}
