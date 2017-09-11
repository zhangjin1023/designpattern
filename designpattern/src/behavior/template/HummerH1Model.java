package behavior.template;

public class HummerH1Model extends HummerModel {

	@Override
	public void start() {
		System.out.println("H1 启动");

	}

	@Override
	public void stop() {
		System.out.println("H1 停车");

	}

	@Override
	public void alarm() {
		System.out.println("H1 鸣笛");

	}

	@Override
	public void engineBoom() {
		System.out.println("H1 发动机轰鸣");

	}

}
