package services;

import java.util.Scanner;

public class Calcular {

    private Scanner scanner = new Scanner(System.in);

    public void escolhaCalculos() {
        boolean continuar = true;
        
        while (continuar) {
            System.out.println("\nEscolha qual Cálculo de Fórmula gostaria de executar:\n");
            System.out.println("Digite '1' para Equação de 2° grau (Matemática)");
            System.out.println("Digite '2' para Cálculos Geométricos (Matemática)");
            System.out.println("Digite '3' para Conversão de Celsius e Fahrenheit (Física)");
            System.out.println("Digite '4' para Cálculo da Velocidade Média (Física)");
            System.out.println("Digite '5' para Cálculo de Média Aritmética");
            System.out.println("Digite '6' para Cálculo da Média Ponderada\n");

            int escolha = scanner.nextInt();

            switch (escolha) {
                case 1:
                    equacaoSegundoGrau();
                    break;
                case 2:
                    calculosGeometricos();
                    break;
                case 3:
                    conversaoTemperatura();
                    break;
                case 4:
                    calculoVelocidadeMedia();
                    break;
                case 5:
                    mediaAritmetica();
                    break;
                case 6:
                    mediaPonderada();
                    break;
                default:
                    System.out.println("Escolha inválida.");
                    break;
            }

            System.out.print("\nDeseja realizar outro cálculo? (S/N): ");
            String resposta = scanner.next().toUpperCase();
            continuar = resposta.equals("S");
        }
    }

    private void equacaoSegundoGrau() {
        System.out.println("\nCalculando as raízes de uma equação de 2º grau");
        System.out.print("Entre com o valor de a: ");
        double a = scanner.nextDouble();
        System.out.print("Entre com o valor de b: ");
        double b = scanner.nextDouble();
        System.out.print("Entre com o valor de c: ");
        double c = scanner.nextDouble();

        double delta = (b * b) - (4 * a * c);
        if (delta >= 0) {
            double x1 = (-b + Math.sqrt(delta)) / (2 * a);
            double x2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("Valor de x1: " + x1);
            System.out.println("Valor de x2: " + x2);

            System.out.println("\nResolução passo a passo:");
            System.out.println("1: Calcule o valor de Delta usando a fórmula D = (b^2 - 4ac)");
            System.out.printf("D = (%f^2 - 4*%f*%f) = %f%n", b, a, c, delta);
            System.out.println("\n2: Use a fórmula de Bhaskara: x = -b ± √(b² – 4ac)/2a para calcular as raízes:");
            System.out.printf("x1 = (-%f + √%f) / (2*%f)%n", b, delta, a);
            System.out.printf("x2 = (-%f - √%f) / (2*%f)%n", b, delta, a);
            System.out.println("\n3: Substitua os valores de Delta, a e b nas fórmulas e calcule x1 e x2.");
            System.out.printf("4: As raízes calculadas são x1 = %f e x2 = %f.%n", x1, x2);
        } else {
            System.out.println("A equação não possui raízes reais.");
        }
    }

    private void calculosGeometricos() {
        System.out.print("Defina o valor do raio do círculo: ");
        double raio = scanner.nextDouble();
        double area = 3.1416 * raio * raio;
        double perimetro = 2 * 3.1416 * raio;
        System.out.println("Área do círculo: " + area);
        System.out.println("Perímetro do círculo: " + perimetro);

        System.out.println("\nPasso a Passo:");
        System.out.println("\n1: Para a área, use a fórmula A = πr².");
        System.out.printf("A = π * %f² = %f%n", raio, area);
        System.out.println("\n2: Para o perímetro, use a fórmula P = 2πr.");
        System.out.printf("P = 2 * π * %f = %f%n", raio, perimetro);

        System.out.print("Defina o valor do raio da esfera: ");
        double raioEsfera = scanner.nextDouble();
        double areaEsfera = 4 * 3.1416 * raioEsfera * raioEsfera;
        double volumeEsfera = (4 * 3.1416 * Math.pow(raioEsfera, 3)) / 3;
        System.out.println("\nÁrea da esfera: " + areaEsfera);
        System.out.println("Volume da esfera: " + volumeEsfera);

        System.out.println("\nPasso a Passo para a Esfera:");
        System.out.println("\n1: Para a área, use A = 4πr².");
        System.out.printf("A = 4 * π * %f² = %f%n", raioEsfera, areaEsfera);
        System.out.println("2: Para o volume, use V = 4/3πr³.");
        System.out.printf("V = 4/3 * π * %f³ = %f%n", raioEsfera, volumeEsfera);
    }

    private void conversaoTemperatura() {
        System.out.print("Defina o valor de Celsius: ");
        double celsius = scanner.nextDouble();
        double fahrenheit = (1.8 * celsius) + 32;
        System.out.println("Valor em Fahrenheit: " + fahrenheit);

        System.out.println("\nPasso a Passo para Conversão de Celsius para Fahrenheit:");
        System.out.println("\n1: Use a fórmula F = 1.8 * C + 32.");
        System.out.printf("F = 1.8 * %f + 32 = %f%n", celsius, fahrenheit);

        System.out.print("Defina o valor de Fahrenheit: ");
        double fahr = scanner.nextDouble();
        double cel = (fahr - 32) / 1.8;
        System.out.println("Valor em Celsius: " + cel);

        System.out.println("\nPasso a Passo para Conversão de Fahrenheit para Celsius:");
        System.out.println("\n1: Use a fórmula C = (F - 32) / 1.8.");
        System.out.printf("C = (%f - 32) / 1.8 = %f%n", fahr, cel);
    }

    private void calculoVelocidadeMedia() {
        System.out.print("Insira a Variação da Posição em metros: ");
        double variacaoEspaco = scanner.nextDouble();
        System.out.print("Insira o Intervalo de Tempo em segundos: ");
        double variacaoTempo = scanner.nextDouble();

        double velocidadeMedia = variacaoEspaco / variacaoTempo;
        System.out.println("Velocidade Média: " + velocidadeMedia + " m/s");
        System.out.println("Velocidade Média em Km/h: " + velocidadeMedia * 3.6 + " Km/h");

        System.out.println("\nPasso a Passo:");
        System.out.println("\n1: Use a fórmula v = Δs / Δt.");
        System.out.printf("v = %f / %f = %f m/s%n", variacaoEspaco, variacaoTempo, velocidadeMedia);
        System.out.printf("Em Km/h, v = %f * 3.6 = %f Km/h%n", velocidadeMedia, velocidadeMedia * 3.6);
    }

    private void mediaAritmetica() {
        System.out.print("Quantos valores deseja inserir para calcular a média? ");
        int numeroValores = scanner.nextInt();
        double soma = 0;
        
        for (int i = 1; i <= numeroValores; i++) {
            System.out.print("Insira o valor " + i + ": ");
            soma += scanner.nextDouble();
        }

        double media = soma / numeroValores;
        System.out.println("Valor da Média Aritmética: " + media);

        System.out.println("\nPasso a Passo:");
        System.out.println("\n1: Some todos os valores inseridos.");
        System.out.println("2: Divida a soma pelo número total de valores.");
    }

    private void mediaPonderada() {
        System.out.print("Quantos valores deseja inserir? ");
        int numeroValores = scanner.nextInt();
        double somaProdutos = 0;
        double somaPesos = 0;

        for (int i = 1; i <= numeroValores; i++) {
            System.out.print("Insira o valor " + i + ": ");
            double valor = scanner.nextDouble();
            System.out.print("Insira o peso para o valor " + i + ": ");
            double peso = scanner.nextDouble();

            somaProdutos += valor * peso;
            somaPesos += peso;
        }

        double mediaPonderada = somaProdutos / somaPesos;
        System.out.println("Média Ponderada: " + mediaPonderada);

        System.out.println("\nPasso a Passo:");
        System.out.println("\n1: Multiplique cada valor pelo seu peso e some os produtos.");
        System.out.println("2: Some todos os pesos.");
        System.out.println("3: Divida a soma dos produtos pela soma dos pesos.");
    }
}
