/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner;

package paninopastina;

/**
 *
 * @author 17258
 */
public class PaninoPastina {

    
    public static void main(String[] args) {
    int giorni=0;
    double pastina=1,panino=1.5,credito=0;
    String check="";
    Scanner t= new Scanner(System.in);
    System.out.println("Inserisci i soldi di Mario");
    credito=t.nextDouble();
    System.out.println("Cosa vuole mangiare Mario?");
    check=t.nextLine();
    while(credito>=panino || credito>=pastina){
        System.out.println("Inserire pan per panino o pas per pastina");
        check=t.nextLine();
        if (check.equals("pan")){
            credito=credito-panino;
        }
        else if (check.equals("pas")){
                    credito=credito-pastina;
                    }
        else {
            System.out.println("Inserisci una stringa valida");
    }
    giorni+=1;
    }
    System.out.println("Mario ha mangiato per " + giorni + "giorni") ; 
        
        
    }
    
}
