//Main praktikum4.soal1
package praktikum4.soal1;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String a, b;
        int c;
        
        input.next();
        a = input.nextLine();
        input.next();
        b = input.nextLine();
        input.next();
        input.next();
        c = input.nextInt();
        Buku buku = new Buku(a, b, c);
        buku.display();
    }
}