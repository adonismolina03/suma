
package suma1;

import java.util.Scanner;


public class SUMA1 {

    public static void main(String[] args) {
        Scanner adonis = new Scanner(System.in);
        int x, y, z;
        
        System.out.println("Digite un valor");
        x=adonis.nextInt();
        
        System.out.println("Digite el segundo valor");
        y=adonis.nextInt();
        
        z=x+y;
        System.out.println("El resultado es: " + z);
        
    }
    
}
