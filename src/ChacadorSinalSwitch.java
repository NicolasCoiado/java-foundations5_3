import java.util.Scanner;
public class ChacadorSinalSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a cor atual do sinal: ");
        int corAtual = sc.nextInt();
        sc.close();
        switch (corAtual) {
            case 1 -> System.out.println("A próxima luz do sinal será verde.");
            case 2 -> System.out.println("A próxima luz do sinal será amarelo.");
            case 3 -> System.out.println("A próxima luz do sinal será vemelho.");
            default -> System.out.println("Cor inválida");
        }
    }
}