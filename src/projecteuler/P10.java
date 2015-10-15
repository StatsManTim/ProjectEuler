/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projecteuler;

import static java.lang.Math.max;
import static java.lang.Math.sqrt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author Tim
 */
public class P10 {
    
    public static void p1(int a, int b, int N){
        int sum = 0;
        for(int i=1; i < N; i++)
            if (i % a == 0 || i % b == 0)
                sum += i;
        System.out.println(sum);
    }
    
    public static void p2(int N){
        int temp;
        int a = 1;
        int b = 2;
        int sum = 0;
        
        while (b < N){
            if (b % 2 == 0)
                sum += b;
            temp = a;
            a = b;
            b += temp;
        }
        System.out.println(sum);
    }
    
    public static void p3(double N){
        double stopN = sqrt(N);
        double maxFactor=0;
        
        
        for (int i = 2; i <= stopN; i++){
            //System.out.print(i + " ");
            if (N % i == 0){
                N /= i;
                maxFactor = i;
                i -= 1;
            }
            //System.out.println(i);
        }
        System.out.println(max(maxFactor,N));
    }
    
    public static void p4(int a, int b){
        String testString;       
        int maxNum = 0;
        int testNum;
        for (int i = a; i < b; i++){
            for (int j = i; j < b; j++){
                testString = String.valueOf( i * j);
                String reverse = new StringBuffer(testString).reverse().toString();
                if (testString.equals(reverse)){
                    testNum = Integer.parseInt(testString);
                    maxNum = max(maxNum, testNum);
                }
            }
        }
        System.out.println(maxNum);
    }
    
    public static void p5(int N){
        List<Integer> primeArray = new ArrayList<>();
        int myProd = 1;
        for (int i=1; i<=N; i++){
            int myNum = i;
            for (int el: primeArray){
                if (myNum % el == 0)
                    myNum /= el;
            }
            if (myNum > 1){
                primeArray.add(myNum); 
                myProd *= myNum;
            }
        }
    System.out.println(myProd);    
    }
    
    public static void p6(int N){
        int sumSquare = N * (2*N*N + 3*N + 1) / 6;
        int squareSum = N*(N+1)*N*(N+1)/4;
        int myDif = squareSum - sumSquare;
        System.out.println(myDif);
    }
    
    public static void p7(int N){
        List<Integer> primeArray = new ArrayList<>();
        primeArray.add(2);
        Boolean isPrime;
        Boolean primeFound = false;
        int i = 2;
        
        while (primeFound == false){    
            isPrime = true;
            for (int el : primeArray) {
                if (i % el == 0){
                    isPrime = false;
                    break;
                }
            }            
            if (isPrime){
                primeArray.add(i);
            }
            if (primeArray.size() == N){
                System.out.println( primeArray.get(N-1) );
                primeFound = true;
            }
            i++;
        }
    }
}
