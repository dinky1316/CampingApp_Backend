package com.camp.campingapp_backend.dto;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;

@Getter
@Setter
public class CampDto {
    private int content_id;
    private String facltNm;
    private String lineIntro;
    private String intro;
    private int allar;
    private String insrncAt;
    private String trsagntNo;
    private String bizrno;
    private String facltDivNm;
    private String mangeDivNm;
    private String mgcDiv;
    private String manageSttus;
    private String hvofBgnde;
    private String hvofEnddle;
    private String featureNm;
    private String induty;
    private String lctCl;
    private String doNm;
    private String sigunguNm;
    private int zipcode;
    @Column(columnDefinition = "text")
    private String addr1;
    @Column(columnDefinition = "text")
    private String addr2;
    private Double mapX;
    private Double mapY;
    private String direction;
    private String tel;
    private String homepage;
    private String resveUrl;
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
    private String tooltip;
    private String glampInnerFclty;
    private String caravInnerFclty;
    private String prmisnDe;
    private String operPdCl;
    private String operDeCl;
    private String trlerAcmpnyAt;
    private String caravAcmpnyAt;
    private int toiletCo;
    private int swrmCo;
    private int wtrplCo;
    private String brazierCl;
    private String sbrsCl;
    private String sbrsEtc;
    private String posblFcltyCl;
    private String posblFcltyEtc;
    private String clturEventAt;
    private String clturEvent;
    private String exprnProgrmAt;
    private String exprnProgrm;
    private int extshrCo;
    private int frprvtWrppCo;
    private int frprvtSandCo;
    private int fireSensorCo;
    private String themaEnvrnCl;
    private String eqpmnLendCl;
    @Column(columnDefinition = "text")
    private String animal;
    private String tourEraCl;
    private String firstImageUrl;
    private String createdtime;
    private String modifiedtime;
}
