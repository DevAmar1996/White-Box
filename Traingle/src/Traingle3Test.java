import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class Traingle3Test {
	 private Triangle3 triangle3;
		
		@BeforeEach
		void setup() {
			triangle3 = new Triangle3();
		}
		
		@Test
		void test1() {
			assertEquals("Equilateral", this.triangle3.checkTriangle(1, 1, 1));
		}
		
		@Test
		void test2() {
			assertEquals("Isosceles", this.triangle3.checkTriangle(1, 5, 5));
		}
		
		@Test
		void test3() {
			assertEquals("Isosceles", this.triangle3.checkTriangle(5, 5, 1));
		}
		
		@Test
		void test4() {
			assertEquals("Isosceles", this.triangle3.checkTriangle(5, 1, 5));
		}
		
		@Test
		void test5() {
			assertEquals("Scalene", this.triangle3.checkTriangle(5, 3, 4));
		}
		
		@Test
		void test6() {
			assertEquals("Invalid Triangle", this.triangle3.checkTriangle(0, 1, 1));
		}
		
		@Test
		void test7() {
			assertEquals("Invalid Triangle", this.triangle3.checkTriangle(1, 0, 1));
		}
		
		@Test
		void test8() {
			assertEquals("Invalid Triangle", this.triangle3.checkTriangle(1, 1, 0));
		}
		
		@Test
		void test9() {
			assertEquals("Invalid Triangle", this.triangle3.checkTriangle(0, 0, 1));
		}

		@Test
		void test10() {
			assertEquals("Invalid Triangle", this.triangle3.checkTriangle(0, 1, 0));
		}
			

		@Test
		void test11() {
			assertEquals("Invalid Triangle", this.triangle3.checkTriangle(1, 0, 0));
		}
		

		@Test
		void test12() {
			assertEquals("Invalid Triangle", this.triangle3.checkTriangle(-1, 1, 1));
		}
		

		@Test
		void test13() {
			assertEquals("Invalid Triangle", this.triangle3.checkTriangle(1, -1, 1));
		}
		
		@Test
		void test14() {
			assertEquals("Invalid Triangle", this.triangle3.checkTriangle(1, 1, -1));
		}
		
		@Test
		void test15() {
			assertEquals("Invalid Triangle", this.triangle3.checkTriangle(-1, -1, 1));
		}
		
		@Test
		void test16() {
			assertEquals("Invalid Triangle", this.triangle3.checkTriangle(1, -1, -1));
		}
		
		@Test
		void test17() {
			assertEquals("Invalid Triangle", this.triangle3.checkTriangle(-1, 1, -1));
		}
		
		@Test
		void test18() {
			assertEquals("Invalid Triangle", this.triangle3.checkTriangle(-1, -1, -1));
		}
		
		@Test
		void test19() {
			assertEquals("Invalid Triangle", this.triangle3.checkTriangle(1, 1, 3));
		}
		
		@Test
		void test20() {
			assertEquals("Invalid Triangle", this.triangle3.checkTriangle(1, 3, 1));
		}
		
		@Test
		void test21() {
			assertEquals("Invalid Triangle", this.triangle3.checkTriangle(3, 1, 1));
		}
}
