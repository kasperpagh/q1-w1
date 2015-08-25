/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q1_2w1;

/**
 *
 * @author pagh
 */
public class Q1_1w1
{

    public static Object locker = new Object();
    public static void main(String[] args)
    {
        boolean abekat = true;
        
        Even even = new Even();
        T1 t1 = new T1(even);
        T1 t2 = new T1(even);
        t1.start();
        t2.start();
        while (true)
        {

            if ((t1.gogo(even) % 2) != 0)
            {
                System.out.println("ulige tal!!!");
                break;
            }

            if ((t2.gogo(even) % 2) != 0)
            {
                System.out.println("ulige tal!!!");
                break;
            }

        }

    }
}
