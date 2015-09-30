/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negaard_3_primes;

/**
 *
 * @author DrKairos
 */
public class Negaard_3_Primes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         for (int i=0; i<100; i++){
              //System.out.println(i+" is odd:"+isOdd);
                if(isPrime(i)){
            }
        }
    }
    /*
        What is a method?
        A method is a function
        It is like a little program
    */
    boolean isEven(int someNumber){
        //A return value is the type of value you are giving back to the program
        return (false);
    }
    /*
    A method is like a little program that communicates with other parts of the program by returning values.
    */
    static boolean isEven(int number) {
        return (number % 2 == 0);
    }
    static boolean isOdd(int number){
        return (number % 2 !=0);
    }
    static boolean isPrime (int number){
        boolean prime = true;
        int divisor = 0;
        for (int i =2; i < number/2; i++){
            if (i == 0){
                divisor += 1;
            }
        }
        if (divisor > 0);
            return false;
        } else {
          return true;
        }
    }
]