package j08;
import java.util.Scanner;
public class Contoh02 {
    public static void main(String[] args) 
       {
           Scanner baca = new Scanner(System.in);
           
           int x;
           int y;
           
           System.out.print("Silahkan Masukkan bilangan");
           y = baca.nextInt();
           
            // FOR
            for(x = 1; x <= y; x++)
                
            {
                System.out.print(x + " ");
            }
            
            // WHILE
            x = 1;
            while(x <= 10)
            {
                System.out.print(x + " ");
            }
            
            // DO WHILE
            x = 1;
            do
            {
                System.out.print(x + " ");
                x++;
            }
            while (x <= 10);
           
        }
    }

    
    
    

