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
public class T3 extends Thread
{
    volatile boolean goT3 = true;
    @Override
    public void run()
    {
        
        int count = 10;
        while(true)
        {
            try
            {
                System.out.println("Her fra t3 kommer alle tal fra ti og op: " + count);
                count++;
                Thread.sleep(3000);
                if(goT3 == false)
                {
                    break;
                }
            } catch (InterruptedException ex)
            {
                System.err.println("fail i t3");
            }
            
        }
    }
}
