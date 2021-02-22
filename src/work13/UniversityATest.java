package work13;

import static org.junit.Assert.*;

import org.hamcrest.core.Is;
import org.junit.Test;


/**
 * UniversityAクラスのテストクラス
 * @author kengo-t
 *
 */
public class UniversityATest {
	
	private UniversityA target = new UniversityA("大学名");

	/**
	 * {@link UniversityA#add(Student)}を適切な引数で呼び出し
	 */
	@Test
	public void testAddTrue() {
		boolean b = target.add(new Student("佐藤", 15, 50));
		assertTrue(b);
	}

	/**
	 * {@link UniversityA#add(Student)}を不適な引数で呼び出し
	 */
	@Test
	public void testAddFalse() {
		boolean b = target.add(new Student("佐藤", 15, 49));
		assertFalse(b);
	}
	
	/**
	 * {@link UniversityA#evaluateGrade}を返り値"F"となる引数で呼び出し
	 * 
	 */
	@Test
	public void evaluateGradeTestF() {
		String string = target.evaluateGrade(50);
		assertThat(string, Is.is("F"));
	}
	
	/**
	 * {@link UniversityA#evaluateGrade}を返り値"D"となる引数で呼び出し
	 * 
	 */
	@Test
	public void evaluateGradeTestD() {
		String string = target.evaluateGrade(60);
		assertThat(string, Is.is("D"));
	}
	
	/**
	 * {@link UniversityA#evaluateGrade}を返り値"C"となる引数で呼び出し
	 * 
	 */
	@Test
	public void evaluateGradeTestC() {
		String string = target.evaluateGrade(65);
		assertThat(string, Is.is("C"));
	}

	/**
	 * {@link UniversityA#evaluateGrade}を返り値"B"となる引数で呼び出し
	 * 
	 */
	@Test
	public void evaluateGradeTestB() {
		String string = target.evaluateGrade(75);
		assertThat(string, Is.is("B"));
	}
	
	/**
	 * {@link UniversityA#evaluateGrade}を返り値"A"となる引数で呼び出し
	 * 
	 */
	@Test
	public void evaluateGradeTestA() {
		String string = target.evaluateGrade(90);
		assertThat(string, Is.is("A"));
	}

	/**
	 * {@link UniversityA#evaluateGrade}を返り値"A+"となる引数で呼び出し
	 * 
	 */
	@Test
	public void evaluateGradeTestAPLUS() {
		String string = target.evaluateGrade(95);
		assertThat(string, Is.is("A+"));
	}

	/**
	 * {@link UniversityA#evaluateGrade}を返り値""となる引数で呼び出し
	 * 
	 */
	@Test
	public void evaluateGradeTestNone() {
		String string = target.evaluateGrade(150);
		assertThat(string, Is.is(""));
	}

}
