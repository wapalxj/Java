package CC13_DS;
/**
 * ¿®∫≈∆•≈‰
 * @author Administrator
 *
 */
public class StackWork2 {

	public static void main(String[] args) {
//		StackComposition  matchBras= new StackComposition();
		StackComposition table = new StackComposition();
		String sequences="([()([]])";
		String []seqs=sequences.split("");

		for (int i = 0; i < seqs.length; i++) {
			table.push(seqs[i]);
			if ((table.getTop().getObject().equals(")")&&table.getTop().next.getObject().equals("("))||
				(table.getTop().getObject().equals("]")&&table.getTop().next.getObject().equals("["))
				) {
				table.pop();
				table.pop();
			}
		}
		if(table.isEmpty()){
			System.out.println("good!");
		}
		else {
			System.out.println("no!");
		}
		
	}

}
