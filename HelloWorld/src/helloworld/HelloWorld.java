/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworld;
/**
 *
 * @author Dave
 */
public class HelloWorld {

    /**
     * @param args the command line arguments
     */
   public static void main(String[] args) {  
        String nom = "";
        System.out.println("Hello World!");
       Mystere mystere = new Mystere();
        
            for (int i=0;i<args.length;i++) {
                if (i!=0) {
                    nom = nom+" ";
                }
                nom = nom + args[i];
       }
         System.out.println("Bonjour "+nom+"!");
    }
}
