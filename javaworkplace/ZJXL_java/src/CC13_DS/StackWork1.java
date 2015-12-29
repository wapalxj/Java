package CC13_DS;

public class StackWork1 {
	/*
	 * ÄæÐòÊä³ö¾ä×Ó
	 */
	public static void main(String[] args) {
		StackComposition table = new StackComposition();
		String sentence="I am a good boy";
		String []words=sentence.split(" ");
		for (int i = 0; i < words.length; i++) {
			table.push(words[i]);
		}
		
		Object removedObj = null;

		   try {
		      while ( true ) {
		         removedObj = table.pop();
		         System.out.print(removedObj.toString()+" "); 
		      }
		   }
		   catch ( EmptyListException e ) {
		      System.err.println( "\n" + e.toString() );
		   }
	}
}
