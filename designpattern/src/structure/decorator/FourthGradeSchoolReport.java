package structure.decorator;

public class FourthGradeSchoolReport extends SchoolReport {

	@Override
	public void report() {
		// 成绩单格式
		System.out.println("尊敬的***家长");
		System.out.println("............");
		System.out.println("分数：60");
		System.out.println("家长签字");
	}

	@Override
	public void sign() {
		System.out.println("家长签字：zhangsan");

	}

}
