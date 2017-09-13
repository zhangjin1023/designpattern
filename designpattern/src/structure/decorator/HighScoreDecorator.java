package structure.decorator;
/**
 * 最高分修饰
 * @author zhang_jin[zhang_jin@suixingpay.com]
 *
 */
public class HighScoreDecorator extends Decorator {

	public HighScoreDecorator(SchoolReport schoolReport) {
		super(schoolReport);
	}
	
	private void reportHighScore(){
		System.out.println("最高分是：75");
	}
	
	@Override
	public void report() {
		this.reportHighScore();//汇报成绩之前，先说明最高分。
		super.report();
	}

}
