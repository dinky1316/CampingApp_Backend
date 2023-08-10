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
@Table(name = "fes")

public class FesEntity {
    @Id
    @Column(name = "fesId")
    private int fesId;

    @Column(columnDefinition = "text")
    private String fesname;


    @Column(columnDefinition = "text")
    private String addr;

    @Column(columnDefinition = "text")
    private String startdate;

    @Column(columnDefinition = "text")
    private String enddate;

    @Column(columnDefinition = "text")
    private String content;

    @Column(columnDefinition = "text")
    private String tel;

    @Column(columnDefinition = "text")
    private String pageaddr;

    @Column(name = "lat")
    private double lat;

    @Column(name = "lnt")
    private double lnt;

}
