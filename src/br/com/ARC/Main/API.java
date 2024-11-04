package br.com.ARC.Main;

import br.com.ARC.Beans.*;

import javax.swing.*;
import java.awt.*;

public class API {

    static String texto(String j){
        return JOptionPane.showInputDialog(j);
    }
    static int inteiro (String j){
        return Integer.parseInt(JOptionPane.showInputDialog(j));
    }
    static boolean binario (String j){
        return Boolean.parseBoolean(JOptionPane.showInputDialog(j));
    }

    public static void main(String[] args) {

        Sensores objSensoresVagao = new Sensores(
                texto("Id:"),
                texto("Tipo de dado:"),
                texto("Dado:"),
                texto("Time Stramp: "),
                texto("Localização: "),
                binario("Status da Captura:")
        );
        CamerasInternas objCamerasInternas = new CamerasInternas(
                texto("Id:"),
                texto("Tipo de dado:"),
                texto("Dado:"),
                texto("Time Stramp: "),
                texto("Localização: "),
                binario("Status da Captura:")
        );

        Vagao objVagao = new Vagao(
                texto("Numero do vagão:"),
                inteiro("Capacidade: "),
                objCamerasInternas,
                objSensoresVagao
                );

        Sensores objSensoresTrem = new Sensores(
                texto("Id:"),
                texto("Tipo de dado:"),
                texto("Dado:"),
                texto("Time Stramp: "),
                texto("Localização: "),
                binario("Status da Captura:")
        );

        Trem objTrem = new Trem(
                texto("Numero do trem:"),
                inteiro("Capacidade: "),
                objSensoresTrem
        );

        Camera objCamera = new Camera(
                texto("Id:"),
                texto("Tipo de dado:"),
                texto("Dado:"),
                texto("Time Stramp: "),
                texto("Localização: "),
                binario("Status da Captura:")
        );
        Sensores objSensoresPlataforma = new Sensores(
                texto("Id:"),
                texto("Tipo de dado:"),
                texto("Dado:"),
                texto("Time Stramp: "),
                texto("Localização: "),
                binario("Status da Captura:")
        );

        Plataforma objPlataforma = new Plataforma(
                texto("Numero da Plataforma:"),
                texto("Nome da Estação: "),
                objCamera,
                objSensoresPlataforma
        );

        CentroControle objCentroControle = new CentroControle(
                texto("Status linha 4: "),
                texto("Status linha 5: "),
                texto("Status linha 8: "),
                texto("Status linha 9: ")
        );

        System.out.println("\nINFORMAÇÕES DO VAGAO\n" + objCamerasInternas + objSensoresVagao + objVagao);
        System.out.println("\nINFORMAÇÕES DO TREM\n" + objSensoresTrem + objTrem);
        System.out.println("\nINFORMAÇÕES DA PLATAFORMA\n" + objCamera + objSensoresPlataforma + objPlataforma);
        System.out.println("\nSTATUS DE OPERAÇÃO\n" + objCentroControle);
    }
}