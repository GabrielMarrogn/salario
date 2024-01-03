import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int numeroF = sc.nextInt();
        int horas = sc.nextInt();
        double valorHora = sc.nextDouble();
        sc.close();

        double salario = horas * valorHora;

        System.out.println("NUMBER = " +numeroF);
        System.out.printf("SALARY = U$ %.2f\n", salario);

    }
}
