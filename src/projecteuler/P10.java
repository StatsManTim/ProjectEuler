/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projecteuler;

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
    
}
