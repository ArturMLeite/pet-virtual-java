import java.util.Scanner;

public class tamagochiuliano {
    private String nome;
    private int energia;

    public tamagochiuliano(String nome) {
        this.nome = nome;
        this.energia = 50;
    }

    public void alimentar() {
        if (energia + 10 > 100) {
            energia = 100;
        } else {
            energia += 10;
        }
        System.out.println(nome + " foi alimentado 😋! Energia atual: " + energia);
    }

    public void dormir() {
        if (energia + 15 > 100) {
            energia = 100;
        } else {
            energia += 15;
        }
        System.out.println(nome + " foi colocado pra dormir 😴! Energia atual: " + energia);
    }

    public void brincar() {
        if (energia - 10 < 0) {
            energia = 0;
        } else {
            energia -= 10;
        }
        System.out.println(nome + " brincou bastante 😏! Energia atual: " + energia);
    }

    public int getEnergia() {
        return energia;
    }

    public String getNome() {
        return nome;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do seu pet: ");
        String nomePet = scanner.nextLine();

        tamagochiuliano pet = new tamagochiuliano(nomePet);

        int opcao;
        do {
            System.out.println("\nO que deseja fazer com " + pet.getNome() + "?");
            System.out.println("1. Alimentar");
            System.out.println("2. Dormir");
            System.out.println("3. Brincar");
            System.out.println("0. Sair");
            System.out.print("Escolha: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    pet.alimentar();
                    break;
                case 2:
                    pet.dormir();
                    break;
                case 3:
                    pet.brincar();
                    break;
                case 0:
                    System.out.println("Até logo!");
                    break;
                default:
                    System.out.println("Burro! Escolhe uma opção válida.");
            }

        } while (opcao != 0);

        scanner.close();
    }
}