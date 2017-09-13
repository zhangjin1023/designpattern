package structure.decorator;

public class Father {

	public static void main(String[] args) {
		SchoolReport sr = new SortDecorator(new HighScoreDecorator(new FourthGradeSchoolReport()));
		sr.report();
		sr.sign();
	}

}
