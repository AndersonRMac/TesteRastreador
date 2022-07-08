package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "cmd_env")
public class Cmd_env implements Serializable {

    @Id
    Long CME_ID = 0L;
    private Long VEI_ID;
    private Integer USR_ID;
    private String CME_PAR;
    private String CME_DHC;
    private String CME_DHA;
    private String CME_DHE;
    private Integer CME_TQTD = 10;
    private Integer CME_TEXE = 0;
    private Integer CME_PRO = 0;
    private String CMD_RESP;

    public Cmd_env(){
    }

    public Long getCME_ID() {
        return CME_ID;
    }

    public void setCME_ID(Long CME_ID) {
        this.CME_ID = CME_ID;
    }

    public Long getVEI_ID() {
        return VEI_ID;
    }

    public void setVEI_ID(Long VEI_ID) {
        this.VEI_ID = VEI_ID;
    }

    public Integer getUSR_ID() {
        return USR_ID;
    }

    public void setUSR_ID(Integer USR_ID) {
        this.USR_ID = USR_ID;
    }

    public String getCME_PAR() {
        return CME_PAR;
    }

    public void setCME_PAR(String CME_PAR) {
        this.CME_PAR = CME_PAR;
    }

    public String getCME_DHC() {
        return CME_DHC;
    }

    public void setCME_DHC(String CME_DHC) {
        this.CME_DHC = CME_DHC;
    }

    public String getCME_DHA() {
        return CME_DHA;
    }

    public void setCME_DHA(String CME_DHA) {
        this.CME_DHA = CME_DHA;
    }

    public String getCME_DHE() {
        return CME_DHE;
    }

    public void setCME_DHE(String CME_DHE) {
        this.CME_DHE = CME_DHE;
    }

    public Integer getCME_TQTD() {
        return CME_TQTD;
    }

    public void setCME_TQTD(Integer CME_TQTD) {
        this.CME_TQTD = CME_TQTD;
    }

    public Integer getCME_TEXE() {
        return CME_TEXE;
    }

    public void setCME_TEXE(Integer CME_TEXE) {
        this.CME_TEXE = CME_TEXE;
    }

    public Integer getCME_PRO() {
        return CME_PRO;
    }

    public void setCME_PRO(Integer CME_PRO) {
        this.CME_PRO = CME_PRO;
    }

    public String getCMD_RESP() {
        return CMD_RESP;
    }

    public void setCMD_RESP(String CMD_RESP) {
        this.CMD_RESP = CMD_RESP;
    }
}