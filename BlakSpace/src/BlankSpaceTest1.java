import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BlankSpaceTest1 {


	 private BlankSpace1 blankSpace2;
	
	@BeforeEach
	void setup() {
		blankSpace2 = new BlankSpace1();
	}
	
	@Test
	void test1() {
		assertEquals("", this.blankSpace2.removeBlankSpace(""));
	}
	
	@Test
	void test2() {
		assertEquals(" ", this.blankSpace2.removeBlankSpace(" "));
	}
	
	@Test
	void test3() {
		assertEquals(" ", this.blankSpace2.removeBlankSpace("   "));
	}
	
	@Test
	void test4() {
		assertEquals("Programmer", this.blankSpace2.removeBlankSpace("Programmer"));
	}
	
	@Test
	void test5() {
		assertEquals("I am a Programmer", this.blankSpace2.removeBlankSpace("I am a Programmer"));
	}
	
	@Test
	void test6() {
		assertEquals("I am a Programmer", this.blankSpace2.removeBlankSpace("I am  a Programmer"));
	}
	
	@Test
	void test7() {
		assertEquals("I am a Programmer", this.blankSpace2.removeBlankSpace("I am a     Programmer"));
	}
	
	@Test
	void test8() {
		assertEquals(" I am a Programmer", this.blankSpace2.removeBlankSpace("  I am a Programmer"));
	}
	
	@Test
	void test9() {
		assertEquals(" I am a Programmer", this.blankSpace2.removeBlankSpace("   I am a Programmer"));
	}
	
	@Test
	void test10() {
		assertEquals("I am a Programmer ", this.blankSpace2.removeBlankSpace("I am a Programmer  "));
	}
	
	@Test
	void test11() {
		assertEquals("I am a Programmer ", this.blankSpace2.removeBlankSpace("I am a Programmer      "));
	}
	

	@Test
	void test12() {
		assertEquals( " I am a Programmer ", this.blankSpace2.removeBlankSpace("  I am a   Programmer   "));
	}
	
	@Test
	void test13() {
		assertEquals(" I am a Programmer ", this.blankSpace2.removeBlankSpace("   I am a    Programmer    "));
	}
}
