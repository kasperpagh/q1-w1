/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q1w1;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author pagh
 */
public class Q1w1
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        try
        {
            T1 t1 = new T1();
            T2 t2 = new T2();
            T3 t3 = new T3();
            t1.start();
            t2.start();
            t3.start();
            Thread.sleep(10000);
            t3.goT3 = false;
        } catch (InterruptedException ex)
        {
            System.err.println("fail i main t");
        }
    }

}
