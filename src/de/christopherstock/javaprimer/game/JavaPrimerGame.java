
    package de.christopherstock.javaprimer.game;

    import  javax.swing.JFrame;
import  javax.swing.WindowConstants;

import de.christopherstock.javaprimer.JavaPrimer;

    /*******************************************************************************************************************
    *   The game class.
    *
    *   @author  Christopher Stock
    *   @version 1.0
    *******************************************************************************************************************/
    public class JavaPrimerGame
    {
        /** The frame that displays the game. */
        private                 JFrame                  frame               = null;

        /***************************************************************************************************************
        *   Creates a new game instance.
        ***************************************************************************************************************/
        public JavaPrimerGame()
        {
        }

        /***************************************************************************************************************
        *   Initializes the game from scratch.
        ***************************************************************************************************************/
        public void init()
        {
            this.initFrame();
        }

        /***************************************************************************************************************
        *   Initializes the frame that displays our game.
        ***************************************************************************************************************/
        private void initFrame()
        {
            this.frame = new JFrame();

            this.frame.setTitle(JavaPrimer.TITLE);
            this.frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
            this.frame.setSize(800, 600);
            this.frame.setLocation(100, 100);

            this.frame.setVisible(true);
        }
    }
