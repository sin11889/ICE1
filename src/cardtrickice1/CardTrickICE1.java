/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cardtrickice1;

import java.util.Scanner;

/** step1 : generate 7 random cards and store in array - how
 * step 2: take any card input from user suit,number
 * step 3: user card is in  the array 'card is found
 *
 * @author Gurminder Singh
 * Student id: 991657830
 */
public class CardTrickICE1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
       Card[] magicHand = new Card[7]; //Array of object
        System.out.println("THE HAND WAS =");
        
        for ( int i=0;i<magicHand.length;i++)
        {
            Card c1 = new Card();
            c1.setValue((int)(Math.random()*13));//use a method to generate random *13
            c1.setSuits(Card.SUITS[(int)(Math.random()*4)]);//random method suit 
            magicHand[i]=c1;
            System.out.println(magicHand[i].getValue()+" of "+magicHand[i].getSuits());
        }
        Scanner input = new Scanner(System.in);
        System.out.println("Please choose a value ( 1 to 12 ) : ");
        int number = input.nextInt();
        input.nextLine();
        
        System.out.println("Please choose the suit :  ");
        System.out.println("1. Diamonds");
        System.out.println("2. Clubs");
        System.out.println("3. Hearts");
        System.out.println("4. Clubs");
        String s = input.nextLine();
        
        CardTrickICE1 LuckyCard;
        LuckyCard = new CardTrickICE1();
       
       
        
        //step 3: match with array
        for (Card magicHand1 : magicHand) {
            if (magicHand1.getValue() == number && magicHand1.getSuits().equalsIgnoreCase(s)) {
                System.out.println("your card generated");
                return;
            }
        }
         System.out.println("Sorry, no match. ");
        
    }
    
}
