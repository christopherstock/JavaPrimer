
    package de.christopherstock.javaprimer;

    import  de.christopherstock.javaprimer.game.*;

    /*******************************************************************************************************************
    *   The main class of the Java Primer Project.
    *
    *   @author  Christopher Stock
    *   @version 1.0
    *******************************************************************************************************************/
    public class JavaPrimer
    {
        /** The application title. */
        public      static  final   String                  TITLE           = "JavaPrimer, (c) 2017 Mayflower GmbH";

        /** The singleton instance of our game class. */
        private     static          JavaPrimerGame          game            = null;

        /***************************************************************************************************************
        *   The main method that acts as the application's entry point.
        *
        *   @param args The command line arguments being passed to the java application.
        ***************************************************************************************************************/
        public static final void main(String[] args)
        {
            System.out.println("Welcome to [" + JavaPrimer.TITLE + "]");

            JavaPrimer.game = new JavaPrimerGame();
            JavaPrimer.game.init();
        }
    }
