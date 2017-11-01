package create.singleton;

public class InnerClassSingletone {

	private InnerClassSingletone() {

	}

	public static InnerClassSingletone getInstance() {
		return HelperHodler.INSTANCE;
	}

	public static class HelperHodler {
		private static final InnerClassSingletone INSTANCE = new InnerClassSingletone();
	}

}
