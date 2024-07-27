package br.dio.Gagriel07;

import br.dio.Gagriel07.ParametrosInvalidosException;

import java.util.Locale;
import java.util.Scanner;

public class Contador {

    public static void main(String[] args) {

        Scanner terminal = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite o primeiro número: ");
        int parametroUm = terminal.nextInt();
        System.out.println("Digite o segundo número: ");
        int parametroDois = terminal.nextInt();

        try {
            contar(parametroUm, parametroDois);
        } catch (ParametrosInvalidosException exception) {
            exception.printStackTrace();
        }

    }

    private static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {

        if(parametroDois < parametroUm) {
            throw new ParametrosInvalidosException();
        }

        int contagem = parametroDois - parametroUm;

        for(int i = 0; i < contagem; i++) {
            System.out.println("Imprimindo o número " + (i + 1));
        }
    }

}