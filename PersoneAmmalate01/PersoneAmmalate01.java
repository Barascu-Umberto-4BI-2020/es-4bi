/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 17258
 */
import java.util.Scanner;

public class PersoneAmmalate01 {
    
   public static void main (String[] args ){
   int persone,tasso,meta,cont=0,contagiate=1;
   Scanner t= new Scanner (System.in);
   System.out.println("Inserisci la popolazione ");
   persone=t.nextInt();
   System.out.println("Inserisci il tasso");
   tasso=t.nextInt();
   meta=persone/2;
   for(int i=0;contagiate<=meta;i++){
       contagiate=contagiate*tasso;
       System.out.println(contagiate);
       cont+=1;
   }
   System.out.println(cont);
   }
    
}
