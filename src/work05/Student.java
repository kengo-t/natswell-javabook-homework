package work05;

public class Student {

		private static int num=0;
		private String name;
		private int classroom;
		private int number;
		private int score;
		
		public Student(String name,int classroom,int score) {
			num++;
			this.name=name;
			this.classroom=classroom;
			this.number=num;
			this.score=score;
		}

		public void setClassroom(int classroom) {
			this.classroom = classroom;
		}

		public String getName() {
			return name;
		}

		public int getNumber() {
			return number;
		}

		public int getScore() {
			return score;
		}

		public int getClassroom() {
			return classroom;
		}
}
