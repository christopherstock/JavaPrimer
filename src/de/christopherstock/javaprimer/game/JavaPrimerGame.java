
    package de.christopherstock.javaprimer.game;

    import  de.christopherstock.javaprimer.*;
    import  de.christopherstock.javaprimer.ui.*;
    import  javax.swing.*;

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

        /** The panel that represents our drawing context. */
        private                 JavaPrimerPanel         panel               = null;

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
            this.initPanel();
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

        /***************************************************************************************************************
        *   Initializes the panel that represents our drawing context.
        ***************************************************************************************************************/
        private void initPanel()
        {
            this.panel = new JavaPrimerPanel();

            this.frame.add(this.panel);
        }
    }
