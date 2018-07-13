
    package de.christopherstock.javaprimer;

    import  de.christopherstock.javaprimer.demo.*;

    /*******************************************************************************************************************
    *   The main class of the Java Primer Project.
    *******************************************************************************************************************/
    public class JavaPrimer
    {
        /** The application title. */
        public      static  final   String                  TITLE           = "JavaPrimer, (c) 2017 Mayflower GmbH";

        /** The singleton instance of our demo class. */
        public      static          JavaPrimerDemo          demo            = null;

        /***************************************************************************************************************
        *   The main method that acts as the application's entry point.
        *
        *   @param args The command line arguments being passed to the java application.
        ***************************************************************************************************************/
        public static void main(String[] args)
        {
            System.out.println( "Welcome to [" + JavaPrimer.TITLE + "]" );

            JavaPrimer.demo = new JavaPrimerDemo();
            JavaPrimer.demo.init();
        }
    }
