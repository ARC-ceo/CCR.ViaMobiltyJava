package br.com.ARC.Main;

import br.com.ARC.Beans.CentroControle;
import br.com.ARC.Beans.Passageiros;
import br.com.ARC.Beans.Sensores;
import br.com.ARC.Beans.Trem;

import javax.swing.*;
import java.util.Scanner;

public class Aplicativo {

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
        String nome;
        int idade;
        int embarque;
        int destino;
        int idUsuario;
        Scanner scanner = new Scanner(System.in);
        boolean executando = true;

        while (executando) {
            System.out.println("\n--- Menu Principal ---");
            System.out.println("1. Cadastrar Passageiro");
            System.out.println("2. Verificar Superlotação nos trens");
            System.out.println("3. Status de Operação");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");

            if (scanner.hasNextInt()) {
                int opcao = scanner.nextInt();
                scanner.nextLine();

                switch (opcao) {
                    case 1:
                        System.out.println("Opção 1: Iniciando cadastro...");
                        System.out.print("Digite seu nome: ");
                        nome = scanner.nextLine();
                        System.out.print("Digite sua idade: ");
                        idade = scanner.nextInt();
                        scanner.nextLine();
                        System.out.print("Digite seu embarque: ");
                        embarque = scanner.nextInt();
                        scanner.nextLine();
                        System.out.print("Digite seu destino: ");
                        destino = scanner.nextInt();
                        scanner.nextLine();
                        System.out.print("Digite seu id passageiro: ");
                        idUsuario = scanner.nextInt();
                        scanner.nextLine();
                        Passageiros objPassageiros = new Passageiros(nome,idade,embarque,destino,idUsuario);
                        System.out.println("Usuario "+objPassageiros.getNome()+" cadastrado com sucesso!");
                        break;
                    case 2:
                        System.out.println("Opção 2: Exibindo lotação...\n");
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
                        System.out.println(objTrem.statusOcupacao());
                        break;
                    case 3:
                        System.out.println("Opção 3: Exibindo status operacional...");
                        CentroControle objCentroControle = new CentroControle(
                                texto("Status linha 4: "),
                                texto("Status linha 5: "),
                                texto("Status linha 8: "),
                                texto("Status linha 9: ")
                        );
                        System.out.println(objCentroControle.statusLinha());
                        break;
                    case 4:
                        System.out.println("Saindo do programa...");
                        executando = false;
                        break;
                    default:
                        System.out.println("Opção inválida. Por favor, escolha novamente.");
                }
            } else {
                System.out.println("Entrada inválida. Por favor, insira um número.");
                scanner.nextLine();
            }
        }
        scanner.close();
    }
}