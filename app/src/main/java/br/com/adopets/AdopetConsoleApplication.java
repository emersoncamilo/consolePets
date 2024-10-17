package br.com.adopets;

import java.util.Scanner;

public class AdopetConsoleApplication {

    public static void main(String[] args) {

        CommandExecutor executor = new CommandExecutor();
        welcomeMessage();
        try {
            int opcaoEscolhida = 0;
            while (opcaoEscolhida != 5) {
                exibirMenu();

                String textoDigitado = new Scanner(System.in).nextLine();
                opcaoEscolhida = Integer.parseInt(textoDigitado);

                switch (opcaoEscolhida) {
                    case 1 -> executor.executeCommand(new ListarAbrigoCommand());
                    case 2 -> executor.executeCommand(new CadastrarAbrigoCommand());
                    case 3 -> executor.executeCommand(new ListarPetsDoAbrigoCommand());
                    case 4 -> executor.executeCommand(new ImportarPetsDoAbrigoCommand());
                    case 5 -> System.exit(0);
                    default -> opcaoEscolhida = 0;
                }


                if (opcaoEscolhida == 1) {
                    executor.executeCommand(new ListarAbrigoCommand());
                } else if (opcaoEscolhida == 2) {
                    executor.executeCommand(new CadastrarAbrigoCommand());
                } else if (opcaoEscolhida == 3) {
                    executor.executeCommand(new ListarPetsDoAbrigoCommand());
                } else if (opcaoEscolhida == 4) {
                    executor.executeCommand(new ImportarPetsDoAbrigoCommand());
                } else if (opcaoEscolhida == 5) {
                    break;
                } else {
                    System.out.println("NÚMERO INVÁLIDO!");
                    opcaoEscolhida = 0;
                }
            }
            System.out.println("Finalizando o programa...");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    private static void exibirMenu() {
        System.out.println("\nDIGITE O NÚMERO DA OPERAÇÃO DESEJADA:");
        System.out.println("1 -> Listar abrigos cadastrados");
        System.out.println("2 -> Cadastrar novo abrigo");
        System.out.println("3 -> Listar pets do abrigo");
        System.out.println("4 -> Importar pets do abrigo");
        System.out.println("5 -> Sair");
    }

    private static void welcomeMessage() {
        System.out.println("" +
                "\n" +
                " __          ________ _      _____ ____  __  __ ______            _____   ____  _____  ______ _______ \n" +
                " \\ \\        / /  ____| |    / ____/ __ \\|  \\/  |  ____|     /\\   |  __ \\ / __ \\|  __ \\|  ____|__   __|\n" +
                "  \\ \\  /\\  / /| |__  | |   | |   | |  | | \\  / | |__       /  \\  | |  | | |  | | |__) | |__     | |   \n" +
                "   \\ \\/  \\/ / |  __| | |   | |   | |  | | |\\/| |  __|     / /\\ \\ | |  | | |  | |  ___/|  __|    | |   \n" +
                "    \\  /\\  /  | |____| |___| |___| |__| | |  | | |____   / ____ \\| |__| | |__| | |    | |____   | |   \n" +
                "     \\/  \\/   |______|______\\_____\\____/|_|  |_|______| /_/    \\_\\_____/ \\____/|_|    |______|  |_|   \n" +
                "                                                                                                      \n" +
                "                                                                                                      \n" +
                "" +
                "");
    }
}