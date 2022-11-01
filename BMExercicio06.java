import java.util.Scanner;

public class BMExercicio06{
    public static void main(String[] args){
        Scanner entradaUsuario = new Scanner(System.in);
        int numeroDoDia = 1;

        while (numeroDoDia != 0){
            System.out.println("Digite um número para o dia da semana (0 para sair): ");
            numeroDoDia = entradaUsuario.nextInt();
            switch(numeroDoDia){
                case 1:
                    System.out.println("O dia é Domingo");
                    break;
                case 2:
                    System.out.println("O dia é Segunda");
                    break;
                case 3:
                    System.out.println("O dia é Terça");
                    break;
                case 4:
                    System.out.println("O dia é Quarta");
                    break;
                case 5:
                    System.out.println("O dia é Quinta");
                    break;
                case 6:
                    System.out.println("O dia é Sexta");
                    break;
                case 7:
                    System.out.println("O dia é Sábado");
                    break;
                default:
                    System.out.println("Número inválido");
        }
        }
    }
}
