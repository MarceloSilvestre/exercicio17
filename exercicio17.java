//Faça um Programa para uma loja de tintas. O programa deverá pedir o tamanho em metros quadrados da área a ser pintada. Considere que a cobertura da tinta é de 1 litro para cada 6 metros quadrados e que a tinta é vendida em latas de 18 litros, que custam R$ 80,00 ou em galões de 3,6 litros, que custam R$ 25,00.
//Informe ao usuário as quantidades de tinta a serem compradas e os respectivos preços em 3 situações:
//comprar apenas latas de 18 litros;
//comprar apenas galões de 3,6 litros;
//misturar latas e galões, de forma que o desperdício de tinta seja menor. Acrescente 10% de folga e sempre arredonde os valores para cima, isto é, considere latas cheias.

import java.util.Scanner;

public class exercicio17 {
    public static void main(String[] args) {

        //variaveis
        double area;
        double cobertura;
        double latas;
        double galao;
        double valorlata;
        double valorgalao;
        double latasmisturadas;
        double galaomisturado;
        double valormisturado;
        

        //entrada
        Scanner teclado = new Scanner(System.in);

        System.out.println("informe o tamanho da área a ser pintada");
        area = teclado.nextDouble();
        System.out.println("");
        teclado.close();

        //calcular

        cobertura = area/6 * 1.10;
        latas = Math.ceil(cobertura / 18); // 80 reais
        galao = Math.ceil(cobertura / 3.6); // 25 reais

        valorlata = latas * 80;
        valorgalao = galao * 25;

        latasmisturadas = Math.floor(cobertura / 18);
        galaomisturado = Math.ceil((cobertura % 18) / 3.6);

        valormisturado = (latasmisturadas * 80) + (galaomisturado * 25);
        

        //situação 1 comprar apenas latas de 18 litros
        System.out.println("comprando apenas latas de 18 litros ");
        System.out.println("valor R$ " + valorlata);
        System.out.println("quantidade de latas " + latas);
        System.out.println("");

        //situação 2 comprar apenas galões de 3.6 litros
        System.out.println("comprando apenas galões de 3.6 litros ");
        System.out.println("valor R$ " + valorgalao);
        System.out.println("quantidade de galões " + galao);
        System.out.println("");

        //situação 3 misturar os 2
        System.out.println("comprando misturado ");
        System.out.println("valor R$ " + valormisturado);
        System.out.println("quantidade de latas " + latasmisturadas);
        System.out.println("quantidade de galões " + galaomisturado);



    }
}
