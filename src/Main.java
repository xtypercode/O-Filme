import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);
        double A = leitor.nextDouble();
        double B = leitor.nextDouble();
        double per = ((B-A)/A) * 100;
        System.out.printf("%.2f%%\n", per);
    }
}
