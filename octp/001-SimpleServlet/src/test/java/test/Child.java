package test;

public class Child extends Parent {
	private void doThings() {
		System.out.println("child");
	}
	public void doT() {
		doThings();
	}
	public static void main(String[] args) {
		Parent p = new Child();
		p.doT();
	}
}
