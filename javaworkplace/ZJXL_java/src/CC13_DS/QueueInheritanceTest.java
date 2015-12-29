package CC13_DS;

//QueueInheritanceTest.java
//Class QueueInheritanceTest

public class QueueInheritanceTest {
	public static void main( String args[] )
	{
		  QueueInheritance objQueue = new QueueInheritance();  
		
		  // Create objects to store in the queue
		  Boolean b = Boolean.TRUE;
		  Character c = new Character( '$' );
		  Integer i = new Integer( 34567 );
		  String s = "hello";
		
		  // Use the enqueue method
		  objQueue.enqueue( b );
		  objQueue.print();
		  objQueue.enqueue( c );
		  objQueue.print();
		  objQueue.enqueue( i );
		  objQueue.print();
		  objQueue.enqueue( s );
		  objQueue.print();
		
		  // Use the dequeue method
		  Object removedObj = null;
		
		  try {
		     while ( true ) {
		        removedObj = objQueue.dequeue();
		        System.out.println( removedObj.toString() +
		                            " dequeued" );
		        objQueue.print();
		     }
		  }
		  catch ( EmptyListException e ) {
		     System.err.println( "\n" + e.toString() );
		  }
	 }
}


/**************************************************************************
* (C) Copyright 1999 by Deitel & Associates, Inc. and Prentice Hall.     *
* All Rights Reserved.                                                   *
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
