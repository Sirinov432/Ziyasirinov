import java.util.Scanner;

public class Kalkulyator {
    public static void Hesap() {
        Scanner sc = new Scanner(System.in);
        System.out.println("birinci reqemi yazin");
        double ilkrakam = sc.nextDouble();
        System.out.println("ikincii reqemi yazin");
        double ikincirakam = sc.nextDouble();
        System.out.println("operatoru yazin  1=+;   2= -; 3=*;  4=/; ");
        char operator = sc.next().charAt(0);
        switch (operator) {
            case '1':
                System.out.println(ilkrakam + ikincirakam);
                break;
            case '2':
                System.out.println(ilkrakam - ikincirakam);
                break;
            case '3':
                System.out.println(ilkrakam * ikincirakam);
                break;
            case '4':
                System.out.println(ilkrakam / ikincirakam);
                break;
            default:
                System.out.println("dogru reqem yazin");
        }
    }}
