package strategy;

public class Report {
	private String content;

	public String getContent() {
		return content;
	}

	private int credits;

	public int getCredits() {
		return credits;
	}

	public void setCredits(int credits) {
		this.credits = credits;
	}

	public int getAutorsReports() {
		// nacita pocet odovodnenych reportov pre konkretneho memebera
		return credits;
	}

	// tu by bola impelemntacia vyberu strategie podla reportu
	private ReportStrategy strategy;

	public ReportStrategy getStrategy() {
		return strategy;
	}

	public void setStrategy(ReportStrategy strategy) {
		this.strategy = strategy;
	}

}
