package com.example.demo.service;

import com.example.demo.daemon.BuscaComandos;
import com.example.demo.model.Cmd_env;
import com.example.demo.model.Ultimo_dado_lido;
import com.example.demo.model.Veiculo;
import com.example.demo.repository.Ult_dado_lidoRepository;

import java.util.Optional;

public class TesteProtocolo {
    Ultimo_dado_lido udl = new Ultimo_dado_lido();
    Veiculo v = new Veiculo();
    Ult_dado_lidoRepository dao = new Ult_dado_lidoRepository() {


        @Override
        public <S extends Ultimo_dado_lido> S save(S entity) {
            return null;
        }

        @Override
        public <S extends Ultimo_dado_lido> Iterable<S> saveAll(Iterable<S> entities) {
            return null;
        }

        @Override
        public Optional<Ultimo_dado_lido> findById(Long aLong) {
            return Optional.empty();
        }

        @Override
        public boolean existsById(Long aLong) {
            return false;
        }

        @Override
        public Iterable<Ultimo_dado_lido> findAll() {
            return null;
        }

        @Override
        public Iterable<Ultimo_dado_lido> findAllById(Iterable<Long> longs) {
            return null;
        }

        @Override
        public long count() {
            return 0;
        }

        @Override
        public void deleteById(Long aLong) {

        }

        @Override
        public void delete(Ultimo_dado_lido entity) {

        }

        @Override
        public void deleteAllById(Iterable<? extends Long> longs) {

        }

        @Override
        public void deleteAll(Iterable<? extends Ultimo_dado_lido> entities) {

        }

        @Override
        public void deleteAll() {

        }
    };


    Integer RPM = 0;
    Long veiculoID;
    Long veiculoSerial;

    public Ultimo_dado_lido processaProtocol(String Input) {


        String status_report = "ST300STT"; //status report


        if ((Input != null) && (!Input.isEmpty())) {
            String[] dados = Input.trim().split(";");
            switch (dados[0]) {
                case "ST300STT":
                    System.out.println("Comando Status_report encontrado!");

                    getVeiculoSerial(dados, 1);
                    getLatitude(dados, 7);

                    break;

                default:
                    System.out.println("Protocolo não identificado");
                    break;
            }


        }

        return udl;
    }
    //funções para coletar e tratar os dados em cada pososição

    public void getVeiculoSerial(String[] dados, int campo) {

        this.veiculoSerial = (Long.parseLong(dados[campo]));
        udl.setUDL_MOD(veiculoSerial);


    }

    public void getRPM(String[] dados, int campo) {
        if (campo >= dados.length || dados[campo] == null || dados[campo].isEmpty()) {
            RPM = 0;
        } else {
            RPM = Integer.parseInt(dados[campo]);
            udl.setUDL_RPM(RPM);
        }
    }

    public void getLatitude(String[] dados, int campo) {
        if (dados[campo] == null || dados[campo].isEmpty()) {
            udl.setUDL_LAT(0D);

        } else {
            Float lat = new Float(dados[campo]);
            if (lat < -90 || lat > 90) {
                udl.setUDL_LAT(0D);
            }
            udl.setUDL_LAT(Double.parseDouble(dados[campo]));
        }

    }

    public String comandos() {
    String comandoTexto = "";

        if (veiculoID == 0){
            if (veiculoSerial == 0){
                return "";
            }
            for (Cmd_env cmd : BuscaComandos.lista_comandos) {

            }
        }


    return comandoTexto;
    }


}
