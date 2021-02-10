package work06;

public class Student {

		private String name;
		private int score;
		
		public Student(String name,int score) throws DataFaileException {
			this.name=name;
			if(score<=0 || score>100)throw new DataFaileException();
			this.score=score;
		}

		public String getName() {
			return name;
		}

		public int getScore() {
			return score;
		}
}
