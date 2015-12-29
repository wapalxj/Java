package CC13_DS;

public class StackInheritanceTest {
	   public static void main( String args[] )
	   {
	      StackInheritance objStack = new StackInheritance();  

	      // Create objects to store in the stack
	      Boolean b = Boolean.TRUE;
	      Character c = new Character( '$' );
	      Integer i = new Integer( 34567 );
	      String s = "hello";

	      // Use the push method
	      objStack.push( b );
	      objStack.print();
	      objStack.push( c );
	      objStack.print();
	      objStack.push( i );
	      objStack.print();
	      objStack.push( s );
	      objStack.print();

	      // Use the pop method
	      Object removedObj = null;

	      try {
	         while ( true ) {
	            removedObj = objStack.pop();
	            System.out.println( removedObj.toString() +
	                                " popped" );
	            objStack.print();
	         }
	      }
	      catch ( EmptyListException e ) {
	         System.err.println( "\n" + e.toString() );
	      }
	   }
	}
