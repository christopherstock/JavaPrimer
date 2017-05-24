
    package de.christopherstock.javaprimer.ui;

    import  java.awt.*;
    import  javax.swing.*;

    /*******************************************************************************************************************
    *   The panel that represents the drawing context.
    *
    *   @author  Christopher Stock
    *   @version 1.0
    *******************************************************************************************************************/
    public class JavaPrimerPanel extends JPanel
    {
        /***************************************************************************************************************
        *   Creates a new game instance.
        ***************************************************************************************************************/
        public JavaPrimerPanel()
        {
        }

        /***************************************************************************************************************
        *   Being invoked every time the panel is repainted.
        *
        *   @param g The drawing context.
        ***************************************************************************************************************/
        public void paint(Graphics g)
        {
            super.paint(g);

            g.setColor(Color.RED);
            g.fillRect(10, 20, 100, 150);
        }
    }
