/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import java.util.Scanner; 
/**
 *
 * @author k_zeb
 */
public class Main {
    public static void main(String[] args){
    Scanner in = new Scanner(System.in);
    String word = in.nextLine().toUpperCase();
    System.out.print("* ");
    for (int i=0;i<word.length();i++) {
        System.out.print(word.charAt(i)+" ");
    }
    System.out.println("*");
    //divider (top to middle)
    for (int i=0;i<word.length();i++) {
        System.out.print(word.charAt(word.length()-(i+1))+" ");
    for (int x=0;x<word.length();x++) {
        System.out.print("* "); 
    }
    System.out.println(word.charAt(i));
    }
    //divider (middle to bottom)
    System.out.print("* ");
    for (int i = word.length()-1;i>=0;i--) {
        System.out.print(word.charAt(i)+" ");
    }
    System.out.println("*");
    //divider (end)
    in.close(); 

    } 

}
