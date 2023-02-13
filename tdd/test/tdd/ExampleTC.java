package tdd;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ExampleTC {

	@Test
	void testMath() throws Exception {
		
		int answer = MyMath.add(2, 2);
		
		assertEquals(4, answer, "Bad Math");
	}
		
		@Test
		void testMath2() throws Exception {
			
			int answer = MyMath.add(2, 2);
			
			assertEquals(4, answer, "Bad Math");
			
	}

}
