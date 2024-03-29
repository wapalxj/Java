package CC15_5_Method;

//Algorithms1.java
//Collections methods reverse, fill, copy, max and min.
import java.util.List;
import java.util.Arrays;
import java.util.Collections;

public class Algorithms1 
{
	public static void main( String[] args )
	{
	   // create and display a testList< Character >
	   Character[] letters = { 'P', 'C', 'M' };
	   List< Character > list = Arrays.asList( letters ); // get testList
	   System.out.println( "list contains: " );
	   output( list );
	
	   // reverse and display the testList< Character >
	   Collections.reverse( list ); // reverse order the elements
	   System.out.println( "\nAfter calling reverse, list contains: " );
	   output( list );
	
	   // create copyList from an array of 3 Characters
	   Character[] lettersCopy = new Character[ 3 ]; 
	   List< Character > copyList = Arrays.asList( lettersCopy ); 
	
	   // copy the contents of list into copyList
	   Collections.copy( copyList, list );
	   System.out.println( "\nAfter copying, copyList contains: " );
	   output( copyList );
	
	   // fill list with Rs 
	   Collections.fill( list, 'R' ); 
	   System.out.println( "\nAfter calling fill, list contains: " );
	   output( list );
	} // end main
	
	// output testList information
	private static void output( List< Character > listRef )
	{
	   System.out.print( "The list is: " );
	
	   for ( Character element : listRef )
	      System.out.printf( "%s ", element );
	
	   System.out.printf( "\nMax: %s", Collections.max( listRef ) );
	   System.out.printf( "  Min: %s\n", Collections.min( listRef ) );
	} // end method output
} // end class Algorithms1

/**************************************************************************
* (C) Copyright 1992-2012 by Deitel & Associates, Inc. and               *
* Pearson Education, Inc. All Rights Reserved.                           *
*                                                                        *
* DISCLAIMER: The authors and publisher of this book have used their     *
* best efforts in preparing the book. These efforts include the          *
* development, research, and testing of the theories and programs        *
* to determine their effectiveness. The authors and publisher make       *
* no warranty of any kind, expressed or implied, with regard to these    *
* programs or to the documentation contained in these books. The authors *
* and publisher shall not be liable in any event for incidental or       *
* consequential damages in connection with, or arising out of, the       *
* furnishing, performance, or use of these programs.                     *
*************************************************************************/
