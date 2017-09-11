package behavior.template;

public abstract class HummerModel {
	public abstract void start();

	public abstract void stop();

	public abstract void alarm();

	public abstract void engineBoom();

	/**
	 * 具体的实现方法延迟到子类去实现，run方法因为顺序是"固定的"，所以可以在抽象类中实现。
	 */
	public void run(){
	this.start();//启动
	this.engineBoom();//发动机轰鸣
	this.alarm();//鸣笛
	this.stop();//停车
	}

}
