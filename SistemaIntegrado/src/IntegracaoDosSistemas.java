import java.util.Scanner;

public class IntegracaoDosSistemas {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            System.out.println("\n============================================================");
            System.out.println("         SISTEMA INTEGRADO DE GERENCIAMENTOS");
            System.out.println("============================================================");
            System.out.println("1. Sistema de Gerenciamento de Clínica");
            System.out.println("2. Sistema de Gerenciamento de Eventos");
            System.out.println("3. Sistema de Gerenciamento de Restaurante");
            System.out.println("4. Perguntas para Tomada de Decisão");
            System.out.println("5. Sair");
            System.out.println("===========================================");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    Clinica.main(new String[] {});
                    break;
                case 2:
                    GerenciarEvento.main(new String[] {});
                    break;
                case 3:
                    Restaurante.main(new String[] {});
                    break;
                case 4:
                    mostrarOpcoesDeDecisao();
                    break;
                case 5:
                    continuar = false;
                    System.out.println("Saindo do sistema integrado...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }

        scanner.close();
    }

    private static void mostrarOpcoesDeDecisao() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n============================================================");
        System.out.println("    PERGUNTAS PARA AUXILIAR NA TOMADA DE DECISÃO");
        System.out.println("============================================================");
        System.out.println("1. Qual médico mais solicitado?");
        System.out.println("2. Qual quantidade de consultas canceladas?");
        System.out.println("3. Qual evento mais frequentado?");
        System.out.println("4. Qual item do cardápio mais pedido?");
        System.out.println("5. Qual mesa mais utilizada?");
        System.out.print("Escolha uma opção: ");
        int opcaoDecisao = scanner.nextInt();

        switch (opcaoDecisao) {
            case 1:
                Clinica.mostrarMedicoMaisSolicitado();
                break;
            case 2:
                Clinica.mostrarConsultasCanceladas();
                break;
            case 3:
                GerenciarEvento.mostrarEventoMaisFrequentado();
                break;
            case 4:
                Restaurante.mostrarItemMaisPedido();
                break;
            case 5:
                Restaurante.mostrarMesaMaisUtilizada();
                break;
            default:
                System.out.println("Opção inválida.");
        }
    }
}