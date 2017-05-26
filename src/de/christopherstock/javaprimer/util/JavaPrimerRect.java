
    package de.christopherstock.javaprimer.util;

    import  java.awt.*;

    /*******************************************************************************************************************
    *   Represents a rectangle in 2D space.
    *
    *   @author  Christopher Stock
    *   @version 1.0
    *******************************************************************************************************************/
    public class JavaPrimerRect
    {
        /** The position x of the left edge. */
        public                  int         x                           = 0;
        /** The position y of the top edge. */
        public                  int         y                           = 0;
        /** The width of the rectangle. */
        public                  int         width                       = 0;
        /** The height of the rectangle. */
        public                  int         height                      = 0;
        /** The fill color. */
        public                  Color       color                       = null;

        /***************************************************************************************************************
        *   Creates a new rectangle in 2D space.
        *
        *   @param x      The position x of the left edge.
        *   @param y      The position y of the top edge.
        *   @param width  The width of the rectangle.
        *   @param height The height of the rectangle.
        *   @param color  The fill color.
        ***************************************************************************************************************/
        public JavaPrimerRect(int x, int y, int width, int height, Color color)
        {
            this.x      = x;
            this.y      = y;
            this.width  = width;
            this.height = height;
            this.color  = color;
        }

        /***************************************************************************************************************
        *   Draws this rectangle onto the specified drawing context.
        *
        *   @param g The drawing context.
        ***************************************************************************************************************/
        public void draw(Graphics g)
        {
            g.setColor(this.color);
            g.fillRect(this.x, this.y, this.width, this.height);
        }
    }
