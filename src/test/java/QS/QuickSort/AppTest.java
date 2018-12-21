package QS.QuickSort;
import junit.framework.Test;

import junit.framework.TestCase;

import junit.framework.TestSuite;



/**

 * Unit test for simple App.

 */

public class AppTest 

    extends TestCase

{

    /**

     * Create the test case

     *

     * @param testName name of the test case

     */

    public AppTest( String testName )

    {

        super( testName );

    }



    /**

     * @return the suite of tests being tested

     */

    public static Test suite()

    {

        return new TestSuite( AppTest.class );

    }



    /**

     * Rigourous Test :-)

     *  assertTrue( true );

     */

    public void testApp()

    {

    	int tamano = 1000;

		int desordenado[] = new int[tamano];

		int ordenado[] = new int[tamano];

		for(int i = 0; i < tamano; i++) desordenado[i] = (int) (Math.random() * 1000);

		App a = new App();

		a.sort(desordenado);

		ordenado = a.getNumbers();

		for(int i = 0; i < tamano - 1; i++) assertTrue( ordenado[i] <= ordenado[i+1] );

    }

}