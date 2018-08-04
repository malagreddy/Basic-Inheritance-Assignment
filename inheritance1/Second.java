package inheritance1;

// class second inherits class first
public class Second extends First {
	int i;

	void Second() {
		super.First();
		System.out.println("Second ");
	}

}
