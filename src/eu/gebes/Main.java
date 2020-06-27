package eu.gebes;

import java.math.BigInteger;

public class Main {

    public static void main(String[] args) {
        record();
    }

    private static void checkSpecificNumber(BigInteger i){
        System.out.println(i +": " + steps(i));
    }

    private static void record(){

        int longest = 0;

        for (int i = 1; i < 1000000; i++) {

            if(steps(BigInteger.valueOf(i)) > longest)
                longest = i;

          //  System.out.println(i);

        }

        System.out.println("Longest chain is " + longest);

    }

    private static int steps(BigInteger count){

        int steps = 1;

        while (!count.equals(BigInteger.ONE)){
            if(count.mod(BigInteger.TWO).equals(BigInteger.ZERO)){
                count = count.divide(BigInteger.TWO);
            }else{
                count = count.multiply(BigInteger.valueOf(3)).add(BigInteger.ONE);
            }
            steps ++;

        }

        return steps;

    }

}
