package structure.decorator;
/**
 * 排名修饰
 * @author zhang_jin[zhang_jin@suixingpay.com]
 *
 */
public class SortDecorator extends Decorator {

	public SortDecorator(SchoolReport schoolReport) {
		super(schoolReport);
	}
	
	private void sortReport(){
		System.out.println("我排名38");
	}
	
	@Override
	public void report() {
		super.report();
		this.sortReport();//汇报完成绩，再说明排名
	}

}
