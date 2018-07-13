
    package de.christopherstock.javaprimer.demo;

    import  de.christopherstock.javaprimer.*;
    import  de.christopherstock.javaprimer.ui.*;
    import  de.christopherstock.javaprimer.util.*;
    import  java.awt.*;
    import  javax.swing.*;

    /*******************************************************************************************************************
    *   The demo class.
    *******************************************************************************************************************/
    public class JavaPrimerDemo
    {
        /** The frame that displays the demo. */
        private                 JFrame                  frame               = null;

        /** The panel that represents our drawing context. */
        protected               JavaPrimerPanel         panel               = null;

        /** All rects to animate. */
        private                 JavaPrimerRect[]        rects               = null;

        /** The main thread. */
        private                 JavaPrimerMainThread    mainThread          = null;

        /***************************************************************************************************************
        *   Creates a new demo instance.
        ***************************************************************************************************************/
        public JavaPrimerDemo()
        {
        }

        /***************************************************************************************************************
        *   Initializes the demo from scratch.
        ***************************************************************************************************************/
        public void init()
        {
            this.initFrame();
            this.initPanel();

            this.initRects();
            this.initMainThread();
        }

        /***************************************************************************************************************
        *   Initializes the frame that displays our demo.
        ***************************************************************************************************************/
        private void initFrame()
        {
            this.frame = new JFrame();

            this.frame.setTitle( JavaPrimer.TITLE );
            this.frame.setDefaultCloseOperation( WindowConstants.EXIT_ON_CLOSE );
            this.frame.setSize( 800, 600 );
            this.frame.setLocation( 100, 100 );

            this.frame.setVisible( true );
        }

        /***************************************************************************************************************
        *   Initializes the panel that represents our drawing context.
        ***************************************************************************************************************/
        private void initPanel()
        {
            this.panel = new JavaPrimerPanel();

            this.frame.add( this.panel );
        }

        /***************************************************************************************************************
        *   Initializes the rectangles that shall be animated and displayed later.
        ***************************************************************************************************************/
        private void initRects()
        {
            this.rects = new JavaPrimerRect[]
            {
                new JavaPrimerRect( 15,  35,  75, 25, Color.BLUE   ),
                new JavaPrimerRect( 85,  70,  35, 80, Color.GREEN  ),
                new JavaPrimerRect( 125, 25,  50, 70, Color.YELLOW ),
                new JavaPrimerRect( 175, 180, 40, 35, Color.ORANGE ),
            };
        }

        /***************************************************************************************************************
        *   Initializes and starts the main thread.
        ***************************************************************************************************************/
        private void initMainThread()
        {
            this.mainThread = new JavaPrimerMainThread();
            this.mainThread.start();
        }

        /***************************************************************************************************************
        *   Renders the current demo scene.
        ***************************************************************************************************************/
        protected void render()
        {
            for ( JavaPrimerRect rect : this.rects )
            {
                rect.x += 1;
                rect.y += 1;
            }
        }

        /***************************************************************************************************************
        *   Draws the current demo scene.
        *
        *   @param g The drawing context to draw onto.
        ***************************************************************************************************************/
        public void draw(Graphics g)
        {
            for (JavaPrimerRect rect : this.rects)
            {
                rect.draw(g);
            }
        }
    }
