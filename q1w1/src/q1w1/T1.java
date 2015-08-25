/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q1w1;

/**
 *
 * @author pagh
 */
public class T1 extends Thread
{

    long count = 0;

    @Override
    public void run()
    {

        for (long i = 1; i < 1000000000; i++)
        {
            count = count + i;
        }
        System.out.println("summerer fra T1 til en mil: " + count);
    }
}
