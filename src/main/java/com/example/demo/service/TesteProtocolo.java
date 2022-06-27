package com.example.demo.service;

import java.text.SimpleDateFormat;
import com.example.demo.model.ultimo_dado_lido;

public class TesteProtocolo {
    ultimo_dado_lido udl = new ultimo_dado_lido();
    String sql = "";
    SimpleDateFormat datahora = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    public String processaProtocol (String Input){
        String out = "";
        String status_report = "ST300STT"; //status report

        int ST300EMG = 2; //emergency report
        int ST300EVT = 3; //event report

        if ((Input != null )&&(!Input.isEmpty())) {
            String[] dados = Input.trim().split(";");
            switch (dados[0]) {
                case "ST300STT":
                    System.out.println("Comando Status_report encontrado!");
                    break;
                default:
                    System.out.println("Protocolo não identificado");
                    break;
            }
        }

        return Input;
    }
}
