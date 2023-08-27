package com.camp.campingapp_backend.entity;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "camp")
@Getter
@Setter
@ToString
public class Camp {

    @Id
    private int content_id;
    @Column(columnDefinition = "text")
    private String facltNm;
    @Column(columnDefinition = "text")
    private String lineIntro;
    @Column(columnDefinition = "text")
    private String intro;
    private int allar;
    @Column(columnDefinition = "text")
    private String insrncAt;
    @Column(columnDefinition = "text")
    private String trsagntNo;
    @Column(columnDefinition = "text")
    private String bizrno;
    @Column(columnDefinition = "text")
    private String facltDivNm;
    @Column(columnDefinition = "text")
    private String mangeDivNm;
    @Column(columnDefinition = "text")
    private String mgcDiv;
    @Column(columnDefinition = "text")
    private String manageSttus;
    @Column(columnDefinition = "text")
    private String hvofBgnde;
    @Column(columnDefinition = "text")
    private String hvofEnddle;
    @Column(columnDefinition = "text")
    private String featureNm;
    @Column(columnDefinition = "text")
    private String induty;
    @Column(columnDefinition = "text")
    private String lctCl;
    @Column(columnDefinition = "text")
    private String doNm;
    @Column(columnDefinition = "text")
    private String sigunguNm;
    private int zipcode;
    @Column(columnDefinition = "text")
    private String addr1;
    @Column(columnDefinition = "text")
    private String addr2;
    private Double mapX;
    private Double mapY;
    @Column(columnDefinition = "text")
    private String direction;
    @Column(columnDefinition = "text")
    private String tel;
    @Column(columnDefinition = "text")
    private String homepage;
    @Column(columnDefinition = "text")
    private String resveUrl;
    @Column(columnDefinition = "text")
    private String resveCl;
    private int manageNmpr;
    private int gnrlSiteCo;
    private int auto_site_co;
    private int glampSiteCo;
    private int caravSiteCo;
    private int indvdlCaravSiteCo;
    private int sitedStnc;
    private int siteMg1Width;
    private int siteMg2Width;
    private int siteMg3Width;
    private int siteMg1Vrticl;
    private int siteMg2Vrticl;
    private int siteMg3Vrticl;
    private int siteMg1Co;
    private int siteMg2Co;
    private int siteMg3Co;
    private int siteBottomCl1;
    private int siteBottomCl2;
    private int siteBottomCl3;
    private int siteBottomCl4;
    private int siteBottomCl5;
    @Column(columnDefinition = "text")
    private String tooltip;
    @Column(columnDefinition = "text")
    private String glampInnerFclty;
    @Column(columnDefinition = "text")
    private String caravInnerFclty;
    @Column(columnDefinition = "text")
    private String prmisnDe;
    @Column(columnDefinition = "text")
    private String operPdCl;
    @Column(columnDefinition = "text")
    private String operDeCl;
    @Column(columnDefinition = "text")
    private String trlerAcmpnyAt;
    @Column(columnDefinition = "text")
    private String caravAcmpnyAt;
    private int toiletCo;
    private int swrmCo;
    private int wtrplCo;
    @Column(columnDefinition = "text")
    private String brazierCl;
    @Column(columnDefinition = "text")
    private String sbrsCl;
    @Column(columnDefinition = "text")
    private String sbrsEtc;
    @Column(columnDefinition = "text")
    private String posblFcltyCl;
    @Column(columnDefinition = "text")
    private String posblFcltyEtc;
    @Column(columnDefinition = "text")
    private String clturEventAt;
    @Column(columnDefinition = "text")
    private String clturEvent;
    @Column(columnDefinition = "text")
    private String exprnProgrmAt;
    @Column(columnDefinition = "text")
    private String exprnProgrm;
    private int extshrCo;
    private int frprvtWrppCo;
    private int frprvtSandCo;
    private int fireSensorCo;
    @Column(columnDefinition = "text")
    private String themaEnvrnCl;
    @Column(name = "animal_cmg_cl", columnDefinition = "text")
    private String animal;
    @Column(columnDefinition = "text")
    private String tourEraCl;
    @Column(columnDefinition = "text")
    private String firstImageUrl;
    @Column(columnDefinition = "text")
    private String createdtime;
    @Column(columnDefinition = "text")
    private String modifiedtime;

}
