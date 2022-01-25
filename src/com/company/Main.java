package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// Algoritmo para cálculo do século com base no ano informado.
        Scanner sc1 = new Scanner(System.in);
        int ano, seculo;
        System.out.println("Digite um ano: ");
        ano = sc1.nextInt();
        seculo = (ano + 99)/100;

        System.out.println(" O século do ano de " +ano+ " informado é  " +seculo);


    }
}
