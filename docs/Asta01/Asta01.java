
package asta01;

import java.util.Scanner;

public class Asta01 {

    public static void main(String[] args) {
    Scanner t= new Scanner(System.in);
    int c1,c2;
    do{
        System.out.println("Primo contratore");
        c1=t.nextInt();
        System.out.println("Secondo compratore");
        c2=t.nextInt();
    }while((c1!=0)&&(c2!=0));
    if (c1>c2){
        System.out.println("Il primo compratore si è aggiudicato l'asta con : " + c1);
    }
    else{
         System.out.println("Il secondo compratore si è aggiudicato l'asta con : " + c2);
    }
    }
    
}
