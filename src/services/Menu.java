package services;

import java.util.Scanner;

public class Menu {

    public static void selectTopic(Scanner scanner) {
        Calcular calculatorService = new Calcular();

        while (true) {
            System.out.println("Gostaria de acessar o tópico de Questões ou Cálculo de Fórmulas?");
            System.out.println("Q=Questões");
            System.out.println("C=Cálculos de Fórmulas\n");
            System.out.print("Escolha: ");
            String topicos = scanner.nextLine().toUpperCase();

            if (topicos.equals("Q") || topicos.equals("QUESTÕES")) {
                selectQuestion(scanner);
            } else if (topicos.equals("C") || topicos.equals("CÁLCULOS DE FÓRMULAS")) {
                System.out.println("\nCálculos de Fórmulas selecionados!");
                calculatorService.escolhaCalculos();
                return;
            } else {
                System.out.println("\nOpção inválida. Tente novamente.");
            }
        }
    }

    private static void selectQuestion(Scanner scanner) {
        System.out.println("\nEscolha qual questão gostaria de fazer:\n");
        System.out.println("1: Análise Combinatória (Matemática)");
        System.out.println("2: Porcentagem (Matemática)");
        System.out.println("3: Cálculo de Velocidade (Física)");
        System.out.println("4: Cálculo de Altura (Física)\n");
        System.out.print("Insira qual questão deseja: ");
        String escolhaQ = scanner.nextLine();

        switch (escolhaQ) {
            case "1":
                handleQuestion1(scanner);
                break;
            case "2":
                handleQuestion2(scanner);
                break;
            case "3":
                handleQuestion3(scanner);
                break;
            case "4":
                handleQuestion4(scanner);
                break;
            default:
                System.out.println("Opção inválida. Tente novamente.");
        }
    }

    private static void handleQuestion1(Scanner scanner) {
        System.out.println("\nQUESTÃO 01:");
        System.out.println("Um técnico de um time de voleibol possui a sua disposição 15 jogadores que podem jogar em qualquer posição.");
        System.out.println("De quantas maneiras ele poderá escalar seu time de 6 jogadores?");
        System.out.println("(A) 4.450 maneiras");
        System.out.println("(B) 5.210 maneiras");
        System.out.println("(C) 4.500 maneiras");
        System.out.println("(D) 5.005 maneiras");
        System.out.println("(E) 5.610 maneiras");

        System.out.print("\nInsira a letra que representa sua resposta: ");
        String resposta = scanner.nextLine().toUpperCase();

        if (resposta.equals("D")) {
            System.out.println("\nResposta certa. PARABÉNS!");
        } else {
            handleHint(scanner, "A resposta correta seria D) 5.005 maneiras.\n", "Dica: Para calcular o número de maneiras de escalar o time, você pode usar a fórmula de combinação (C(n, k)), onde n é o número de jogadores disponíveis e k é o número de jogadores que o técnico deseja escalar.");
        }
    }

    private static void handleQuestion2(Scanner scanner) {
        System.out.println("\nQUESTÃO 02:");
        System.out.println("Um boleto deveria ser pago no dia 10 de setembro, porém nesta data o devedor não possuía o dinheiro para o pagamento.");
        System.out.println("Pagou o boleto somente no dia 20 de setembro, 10 dias após o vencimento.");
        System.out.println("Ao efetuar o pagamento foi cobrado multa de 2% sobre o valor do boleto e R$ 5,40 por dia de atraso.");
        System.out.println("Se o valor do boleto era de R$ 320,00, o valor pago no dia 20 com multa e juros foi de:");
        System.out.println("(A) R$ 378,80.");
        System.out.println("(B) R$ 380,40.");
        System.out.println("(C) R$ 382,20.");
        System.out.println("(D) R$ 386,60.");
        System.out.println("(E) R$ 392,40.");

        System.out.print("\nInsira a letra que representa sua resposta: ");
        String resposta = scanner.nextLine().toUpperCase();

        if (resposta.equals("B")) {
            System.out.println("\nResposta certa. PARABÉNS!");
        } else {
            handleHint(scanner, "A resposta correta seria B) R$ 380,40.\n", "Dica: Para calcular o valor pago com multa e juros, primeiro calcule a multa de 2% sobre o valor do boleto e depois some os R$ 5,40 por cada dia de atraso.");
        }
    }

    private static void handleQuestion3(Scanner scanner) {
        System.out.println("\nQUESTÃO 03 (FÍSICA):");
        System.out.println("Um objeto de 2 kg está inicialmente em repouso. Se uma força constante de 10 N é aplicada sobre ele, qual será sua velocidade (em m/s) após 5 segundos?");
        System.out.println("(A) 1 m/s");
        System.out.println("(B) 5 m/s");
        System.out.println("(C) 10 m/s");
        System.out.println("(D) 25 m/s");
        System.out.println("(E) 50 m/s");

        System.out.print("\nInsira a letra que representa sua resposta: ");
        String resposta = scanner.nextLine().toUpperCase();

        if (resposta.equals("C")) {
            System.out.println("\nResposta certa. PARABÉNS!");
        } else {
            handleHint(scanner, "A resposta correta seria C) 10 m/s.\n", "Dica: Use a segunda Lei de Newton: F=ma para encontrar a aceleração e logo em seguida, use a fórmula de velocidade v=at para achar a resposta certa.");
        }
    }

    private static void handleQuestion4(Scanner scanner) {
        System.out.println("\nQUESTÃO 04 (FÍSICA):");
        System.out.println("Um corpo é solto de uma altura de 20 metros. Considerando a aceleração da gravidade como 10 m/s², quanto tempo (em segundos) o corpo levará para atingir o solo?");
        System.out.println("(A) 2 segundos");
        System.out.println("(B) 4 segundos");
        System.out.println("(C) 5 segundos");
        System.out.println("(D) 6 segundos");
        System.out.println("(E) 8 segundos");

        System.out.print("\nInsira a letra que representa sua resposta: ");
        String resposta = scanner.nextLine().toUpperCase();

        if (resposta.equals("B")) {
            System.out.println("\nResposta certa. PARABÉNS!");
        } else {
            handleHint(scanner, "A resposta correta seria B) 4 segundos.\n", "Dica: Use a fórmula do movimento vertical. Neste caso, use a fórmula H = (Vi²)/(2.g), onde Vi é a velocidade inicial e g a gravidade.");
        }
    }

    private static void handleHint(Scanner scanner, String mensagemCorreta, String dica) {
        System.out.println("\nOps, não foi dessa vez. Parece que sua resposta está incorreta.");
        System.out.print("Deseja receber uma dica? (S/N): ");
        String respostaDica = scanner.nextLine().toUpperCase();
        if (respostaDica.equals("S")) {
            System.out.println("\n" + dica);
        }
        System.out.println("\n" + mensagemCorreta);
    }
}
