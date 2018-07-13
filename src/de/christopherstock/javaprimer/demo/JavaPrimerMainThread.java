
    package de.christopherstock.javaprimer.demo;

    import  de.christopherstock.javaprimer.*;

    /*******************************************************************************************************************
    *   The main thread.
    *******************************************************************************************************************/
    public class JavaPrimerMainThread extends Thread
    {
        /** Flags the end of this thread. */
        private                 boolean                     destroyed                       = false;

        /***************************************************************************************************************
        *   Performs a threaded operation.
        ***************************************************************************************************************/
        public void run()
        {
            while ( !this.destroyed )
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

        /***************************************************************************************************************
        *   Stops this main thread.
        ***************************************************************************************************************/
        public void stopMainThread()
        {
            this.destroyed = true;
        }
    }
