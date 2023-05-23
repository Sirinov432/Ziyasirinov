import java.util.Scanner;

public class Mesele {
    public static int mainq() {
        Scanner sc = new Scanner(System.in);
        int max = 0;
        System.out.println("ulk reqemi daxil edin");
        int ilkregem = sc.nextInt();
        System.out.println("ikinci regemi daxil edin");
        int ikinciregem = sc.nextInt();
        System.out.println("ucuncu reqemi daxil edin");
        int ucuncuregem = sc.nextInt();
        if (max < ilkregem) {
            ilkregem = max;

        }
        else if (max< ikinciregem) {
            ikinciregem = max;

        }
        else {
            max = ucuncuregem;
return max;

        }
        return max;
        
    }
}
