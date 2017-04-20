package C10_InnerClass;

public class P195_methodInner {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Vero vero = new Vero();
		Destination destination = vero.dest("sss");
		destination.readLabel();
	}
}

class Vero {
	public Destination dest(String s) {
		class PDestination implements Destination {
			private String label;
			private PDestination(String whereTo) {
				label = whereTo;
			}
			@Override
			public String readLabel() {
				return label;
			}
		}
		return new PDestination(s);
	}
}

interface Destination {
	String readLabel();
}