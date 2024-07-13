package DesafioControleFluxo;

import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o primeiro parâmetro:");
        int parametroUm = sc.nextInt();
        System.out.println("Digite o segundo parâmetro:");
        int parametroDois = sc.nextInt();

        try {
            contar((parametroUm), parametroDois);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    static void contar(int parametroUm, int parametroDois) throws IllegalArgumentException {
        if (parametroUm > parametroDois) {
            throw new IllegalArgumentException("O primeiro parâmetro deve ser menor que segundo parâmetro.");
        }

        int n = parametroDois - parametroUm;
        for (int i = 0; i <= n; i++) {
            System.out.println("Contando: " + parametroUm);
            parametroUm++;
        }
    }
}