package edu.escuelaing.arem;

import static spark.Spark.get;

/**
 * Hello world!
 *
 */
public class SparkWebApp
{
    public static void main( String[] args )
    {
        System.out.println( "Initiating server... Ready" );
        get("/hello", (req, res) -> "Hello Heroku");
    }
}
