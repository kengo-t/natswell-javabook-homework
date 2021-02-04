package work03;

public enum EvaluateType{
	A_PLUS("A+",100,96),A("A",95,85),B("B",84,75),C("C",74,65),D("D",64,60),F("F",59,0);

	private final String evaluation;
	private final int upper;
	private final int lower;
	
	EvaluateType(String evaluation, int uppper, int lower) {
		this.evaluation = evaluation;
		this.upper = uppper;
		this.lower = lower;
	}

	public String getEval() {
		return evaluation;
	}

	public int getUpper() {
		return upper;
	}

	public int getLower() {
		return lower;
	}
}
