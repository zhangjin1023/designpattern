package structure.decorator;

public abstract class Decorator extends SchoolReport {

	private SchoolReport schoolReport;

	public Decorator(SchoolReport schoolReport) {
		this.schoolReport = schoolReport;
	}

	@Override
	public void report() {
		this.schoolReport.report();

	}

	@Override
	public void sign() {
		this.schoolReport.sign();

	}

}
