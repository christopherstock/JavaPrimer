
    package de.christopherstock.javaprimer.demo;

    import  de.christopherstock.javaprimer.*;

    /*******************************************************************************************************************
    *   The main thread.
    *
    *   @author  Christopher Stock
    *   @version 1.0
    *******************************************************************************************************************/
    public class JavaPrimerMainThread extends Thread
    {
        /***************************************************************************************************************
        *   Performs a threaded operation.
        ***************************************************************************************************************/
        public void run()
        {
            while (true)
            {
                // render demo scene
                JavaPrimer.demo.render();

                // force immediate repaint
                JavaPrimer.demo.panel.repaint();

                // delay current loop run
                try
                {
                    Thread.sleep(100);
                }
                catch (InterruptedException ie)
                {
                    ie.printStackTrace();
                }
            }
        }
    }
