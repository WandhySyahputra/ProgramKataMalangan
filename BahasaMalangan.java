
package bahasamalangan;

import java.util.Scanner;

public class BahasaMalangan {

    public static void main(String[] args) {
        // variabel untuk menampung hasil validasi kata
        String saveKata= " ";
        
        Scanner input = new Scanner(System.in);
        System.out.println("--- Masukkan Satu Kata ---");
           
        System.out.print("Masukkan Sebuah Kata : ");
        String masukan = input.nextLine();
        
        char[] validasi = masukan.toCharArray();
        
//        untuk validasi kata
        for (int i = validasi.length - 1; i >= 0; i--){
            if (validasi[i] == ' '){
                System.out.println("Anda memasukkan kalimat bukan kata !!!");
                System.exit(0);
            
            } else {
                saveKata = masukan;
            }
        }
         
        
        char[] kata = saveKata.toCharArray();
        
        
        for (int a = kata.length - 1; a >= 0; a--){
            if(kata[a] == 'n' && kata[a + 1] == 'g'){
                System.out.print(kata[a + 1]);
            } else if(kata[a] == 'g' && kata[a - 1] == 'n'){
                System.out.print(kata[a - 1]);
            } else if(kata[a] == 'n' && kata[a + 1] == 'y'){
                System.out.print(kata[a + 1]);
            } else if(kata[a] == 'y' && kata[a - 1] == 'n'){
                System.out.print(kata[a - 1]);
            } else {
                System.out.print(kata[a]);
            }
        }       
        System.out.println(" ");
    } 
}
