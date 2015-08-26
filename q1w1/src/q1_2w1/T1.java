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
public class T1 extends Thread
{

    private Even even;

    public T1(Even even)
    {
        this.even = even;
    }

    @Override
    public void run()
    {

        gogo(even);

    }

    public synchronized int gogo(Even even)
    {
        return even.next();
    }
}
