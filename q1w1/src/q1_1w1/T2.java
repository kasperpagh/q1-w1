/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q1_1w1;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author pagh
 */
public class T2 extends Thread
{
    @Override
    public void run()
    {
        for(int i = 1; i < 6; i++)
        {
            try
            {
                System.out.println("Her fra t2 kommer 1-5: " + i);
                Thread.sleep(2000);
            } catch (InterruptedException ex)   
            {
                System.err.println("sleep fuckede up i t2");
            }
        }
    }
}
