import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        iphone iphone = new iphone();
        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.println("Bem vindo a home do Iphone, selecione qual opção  irá acessar:");
            System.out.println("1 - Aparelho Telefonico");
            System.out.println("2 - Navegador de internet");
            System.out.println("3 - Reprodutor musical");
            System.out.println("4 - desligar iphone");
            int escolha = scanner.nextInt();
            scanner.nextLine();

            if (escolha == 1){
                while(true) {
                    System.out.println("Aparelho telefonico, selecione uma das opções a seguir:");
                    System.out.println("1 - Ligar");
                    System.out.println("2 - Atender");
                    System.out.println("3 - Iniciar correio de voz");
                    int escolha2 = scanner.nextInt();
                    scanner.nextLine();
                    if (escolha2 == 1) {
                        System.out.println("Digite o número que sera ligado:");
                        String numero = scanner.nextLine();
                        iphone.ligar(numero);
                    } else if (escolha2 == 2) {
                        iphone.atender();
                    } else if (escolha2 == 3) {
                        iphone.iniciarCorreioVoz();
                    } else {
                        System.out.println("Opção inválida, retornando as opções");
                    }
                    System.out.println("Ação finalizada, deseja retornar a home?");
                    System.out.println("1 - Sim");
                    System.out.println("2 - Não");
                    int escolha3 = scanner.nextInt();
                    scanner.nextLine();
                    if (escolha3 == 1){
                        break;
                    }
                }
            } else if (escolha == 2) {
                while(true) {
                    System.out.println("Navegador de internet, selecione uma das opções a seguir:");
                    System.out.println("1 - exibirPagina");
                    System.out.println("2 - AdicionarNovaAba");
                    System.out.println("3 - atualizarPagina");
                    int escolha2 = scanner.nextInt();
                    scanner.nextLine();
                    if (escolha2 == 1) {
                        System.out.println("Digite a url que sera exibida:");
                        String url = scanner.nextLine();

                        iphone.exibirPagina(url);
                    } else if (escolha2 == 2) {
                        iphone.adicionarNovaAba();
                    } else if (escolha2 == 3) {
                        iphone.atualizarPagina();
                    } else {
                        System.out.println("Opção inválida, retornando as opções");
                    }
                    System.out.println("Ação finalizada, deseja retornar a home?");
                    System.out.println("1 - Sim");
                    System.out.println("2 - Não");
                    int escolha3 = scanner.nextInt();
                    scanner.nextLine();
                    if (escolha3 == 1){
                        break;
                    }
                }


            } else if (escolha == 3) {
                String musica = "0";
                while(true) {
                    System.out.println("Reprodutor musical, selecione uma das opções a seguir: ");
                    System.out.println("1 - Selecionar musica");
                    System.out.println("2 - Pausar");
                    System.out.println("3 - Tocar");

                    int escolha2 = scanner.nextInt();
                    scanner.nextLine();
                    if (escolha2 == 1) {
                        System.out.println("Digite o a musica que sera selecionada:");
                        musica = scanner.nextLine();
                        iphone.selecionarMusica(musica);

                    } else if (escolha2 == 2) {
                        if(!musica.equals("0")) {
                            iphone.pausar();
                        } else {
                            System.out.println("Nenhuma música foi selecionada sendo assim não há nada para pausar: ");
                        }

                    } else if (escolha2 == 3) {
                        if(!musica.equals("0")) {
                            iphone.tocar();
                        } else {
                            System.out.println("Nenhuma música foi selecionada sendo assim não há nada para tocar: ");
                        }
                    } else {
                        System.out.println("Opção inválida, retornando as opções");
                    }
                    System.out.println("Ação finalizada, deseja retornar a home?");
                    System.out.println("1 - Sim");
                    System.out.println("2 - Não");
                    int escolha3 = scanner.nextInt();
                    scanner.nextLine();
                    if (escolha3 == 1){
                        break;
                    }
                }

        } else if (escolha == 4) {
                System.out.println("Saindo do iphone");
                break;

            } else {
                System.out.println("Opção inválida, retornando a home");
            }
        }
    }
}