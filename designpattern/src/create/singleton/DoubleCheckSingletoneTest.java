package create.singleton;

public class DoubleCheckSingletoneTest {
	public static void main(String[] args) {
		DoubleCheckSingletone instance1 = DoubleCheckSingletone.getInstance();
		DoubleCheckSingletone instance2 = DoubleCheckSingletone.getInstance();
		System.out.println(instance1 == instance2);
	}

}
