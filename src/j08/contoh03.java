package j08;
import java.util.Scanner;

public class contoh03 {
    public static void main(String[] args) 
    {
        // CARA I
        // MENAMPILKAN 10 BILANGAN GANJIL PERTAMA
        int x = 1;
        
        for(x = 1; x <= 20; x+=2)
        {
            System.out.print(x + " "); 
        }
        
        System.out.println();
        
        // MENAMPILKAN 10 BILANGAN GENAP PERTAMA
        for(x = 2; x <= 20; x+=2)
        {
            System.out.print(x + " ");
            
            // CARA II
            // MENAMPILKAN 10 BILANGAN GANJIL PERTAMA
            for(x = 1; x <= 20; x++)
            {
                if(x % 2 == 1)
                {
                    System.out.print(x + " ");
                }
            }
            
            // MENAMPILKAN 10 BILANGAN GENAP PERTAMA
            for(x = 1; x <= 20; x++)
                
            {
                if(x % 2 == 0 )
                {
                    System.out.print(x + " ");
                }
            }
        }
        
    }
    
}
