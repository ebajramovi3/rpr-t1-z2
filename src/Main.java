import java.util.Scanner;
public class Main {
    public static int sumaCifara(int a){
        int suma = 0;
        while(a != 0){
            suma += a%10;
            a /= 10;
        }
        return suma;
    }
    public static void main(String[] args) {
        System.out.println("Unesite n: ");
        Scanner ulaz = new Scanner(System.in);
        int n = ulaz.nextInt();
        for(int i = 1; i < n; i++)
            if(i % sumaCifara(i) == 0) System.out.println(i);
    }
}