package behavior.template;

public class Client {

	public static void main(String[] args) {
		HummerModel h1Model = new HummerH1Model();
		h1Model.run();

		HummerModel h2Model = new HummerH2Model();
		h2Model.run();
	}

}
