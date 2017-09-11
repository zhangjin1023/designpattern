package behavior.template;

public class HummerH2Model extends HummerModel {

	@Override
	public void start() {
		System.out.println("H2 启动");

	}

	@Override
	public void stop() {
		System.out.println("H2 停车");

	}

	@Override
	public void alarm() {
		System.out.println("H2 鸣笛");

	}

	@Override
	public void engineBoom() {
		System.out.println("H2 发动机轰鸣");

	}

}
