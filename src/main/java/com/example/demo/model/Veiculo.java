package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "veiculo")
public class Veiculo {
    @Id
    Long VEI_ID;
    private Long EQP_SRN;
    private Integer VEI_FLD;
    private String VEL_VIA;
    private String CHECA_CERCA;

    public Veiculo(){}

    public Long getVEI_ID() {
        return VEI_ID;
    }

    public void setVEI_ID(Long VEI_ID) {
        this.VEI_ID = VEI_ID;
    }

    public Long getEQP_SRN() {
        return EQP_SRN;
    }

    public void setEQP_SRN(Long EQP_SRN) {
        this.EQP_SRN = EQP_SRN;
    }

    public Integer getVEI_FLD() {
        return VEI_FLD;
    }

    public void setVEI_FLD(Integer VEI_FLD) {
        this.VEI_FLD = VEI_FLD;
    }

    public String getVEL_VIA() {
        return VEL_VIA;
    }

    public void setVEL_VIA(String VEL_VIA) {
        this.VEL_VIA = VEL_VIA;
    }

    public String getCHECA_CERCA() {
        return CHECA_CERCA;
    }

    public void setCHECA_CERCA(String CHECA_CERCA) {
        this.CHECA_CERCA = CHECA_CERCA;
    }
}
