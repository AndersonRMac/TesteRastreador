package com.example.demo.model;


import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name = "ultimo_dado_lido")
public class ultimo_dado_lido implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long VEI_ID = 0L;
    private String UDL_DH;
    private Double UDL_LAT = 0D;
    private Double UDL_LNG = 0D;
    private Integer UDL_DIR = 0;
    private Integer UDL_VEL = 0;
    private Integer UDL_BYT1 = 0;
    private Integer UDL_BYT2 = 0;
    private Long UDL_ODM = 0L;
    private Integer UDL_HRM = 0;
    private Integer UDL_TEN = 0;
    private Float UDL_TMP = null;
    private Float UDL_TMP2 = null;
    private Float UDL_TMP3 = null;
    private Integer UDL_CTM = 0;
    private Integer UDL_CSM = 0;
    private String UDL_DHS;
    private Long UDL_MOD;
    private Integer MOT_ID;
    private String GPRS_DHS;
    private String IGN_OFF = "";
    private Integer UDL_RPM = 0;

    public Long getVEI_ID() {
        return VEI_ID;
    }
    public void setVEI_ID(Long vEI_ID) {
        VEI_ID = vEI_ID;
    }
    public String getUDL_DH() {
        return UDL_DH;
    }
    public void setUDL_DH(String uDL_DH) {
        UDL_DH = uDL_DH;
    }
    public Double getUDL_LAT() {
        return UDL_LAT;
    }
    public void setUDL_LAT(Double uDL_LAT) {
        UDL_LAT = uDL_LAT;
    }
    public Double getUDL_LNG() {
        return UDL_LNG;
    }
    public void setUDL_LNG(Double uDL_LNG) {
        UDL_LNG = uDL_LNG;
    }
    public Integer getUDL_DIR() {
        return UDL_DIR;
    }
    public void setUDL_DIR(Integer uDL_DIR) {
        UDL_DIR = uDL_DIR;
    }
    public Integer getUDL_VEL() {
        return UDL_VEL;
    }
    public void setUDL_VEL(Integer uDL_VEL) {
        UDL_VEL = uDL_VEL;
    }
    public Integer getUDL_BYT1() {
        return UDL_BYT1;
    }
    public void setUDL_BYT1(Integer uDL_BYT1) {
        UDL_BYT1 = uDL_BYT1;
    }
    public Integer getUDL_BYT2() {
        return UDL_BYT2;
    }
    public void setUDL_BYT2(Integer uDL_BYT2) {
        UDL_BYT2 = uDL_BYT2;
    }
    public Long getUDL_ODM() {
        return UDL_ODM;
    }
    public void setUDL_ODM(Long uDL_ODM) {
        UDL_ODM = uDL_ODM;
    }
    public Integer getUDL_HRM() {
        return UDL_HRM;
    }
    public void setUDL_HRM(Integer uDL_HRM) {
        UDL_HRM = uDL_HRM;
    }
    public Integer getUDL_TEN() {
        return UDL_TEN;
    }
    public void setUDL_TEN(Integer uDL_TEN) {
        UDL_TEN = uDL_TEN;
    }
    public Float getUDL_TMP() {
        return UDL_TMP;
    }
    public void setUDL_TMP(Float uDL_TMP) {
        UDL_TMP = uDL_TMP;
    }
    public Float getUDL_TMP2() {
        return UDL_TMP2;
    }
    public void setUDL_TMP2(Float uDL_TMP2) {
        UDL_TMP2 = uDL_TMP2;
    }
    public Float getUDL_TMP3() {
        return UDL_TMP3;
    }
    public void setUDL_TMP3(Float uDL_TMP3) {
        UDL_TMP3 = uDL_TMP3;
    }
    public Integer getUDL_CTM() {
        return UDL_CTM;
    }
    public void setUDL_CTM(Integer uDL_CTM) {
        UDL_CTM = uDL_CTM;
    }
    public Integer getUDL_CSM() {
        return UDL_CSM;
    }
    public void setUDL_CSM(Integer uDL_CSM) {
        UDL_CSM = uDL_CSM;
    }
    public String getUDL_DHS() {
        return UDL_DHS;
    }
    public void setUDL_DHS(String uDL_DHS) {
        UDL_DHS = uDL_DHS;
    }
    public Long getUDL_MOD() {
        return UDL_MOD;
    }
    public void setUDL_MOD(Long uDL_MOD) {
        UDL_MOD = uDL_MOD;
    }
    public Integer getMOT_ID() {
        return MOT_ID;
    }
    public void setMOT_ID(Integer mOT_ID) {
        MOT_ID = mOT_ID;
    }
    public String getGPRS_DHS() {
        return GPRS_DHS;
    }
    public void setGPRS_DHS(String gPRS_DHS) {
        GPRS_DHS = gPRS_DHS;
    }
    public String getIGN_OFF() {
        return IGN_OFF;
    }
    public void setIGN_OFF(String iGN_OFF) {
        IGN_OFF = iGN_OFF;
    }
    public Integer getUDL_RPM() {
        return UDL_RPM;
    }
    public void setUDL_RPM(Integer uDL_RPM) {
        UDL_RPM = uDL_RPM;
    }
}