package create.singleton;

public class InnerClassSingletoneTest {
	public static void main(String[] args) {
		System.out.println(InnerClassSingletone.getInstance() == InnerClassSingletone.getInstance());
	}

}
