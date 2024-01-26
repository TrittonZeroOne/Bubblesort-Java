/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package kecilkebesar;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Kecilkebesar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    int a = 0 ;
       Scanner input = new Scanner(System.in);
       System.out.print("banyaknya data =");
       int banyak = input.nextInt();
       int []angka = new int[banyak] ;
       
//input data 
while (a < banyak)
{
    System.out.print("Bilangan "+(a+1)+" = ");
    angka[a] = input.nextInt();
    a++;
}
//proses pertukaran data
for (a=0 ; a < banyak ; a++)
{
    for (int b=0 ; b < banyak-1 ; b++)
   {
     if (angka [b] > angka[b+1])
     {
       int temp = angka[b];
       angka[b] = angka[b+1];
       angka[b+1] = temp;
     }
   }
}
//output
for (a = 0 ; a < banyak ; a++)
{
System.out.println(angka[a]);
        }
    
    }
}
