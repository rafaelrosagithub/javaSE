package br.com.xyz.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import br.com.xyz.poo.Mathematics;

class MathTest {

	Mathematics m;

	@BeforeEach
	void setUp() throws Exception {
		m = new Mathematics();
	}

	@Test
	void testRoot() {
		assertEquals(4, m.root(16));
	}

	@Test
	void testLarge() {
		assertEquals(25, m.larger(15, 25));
	}

	@Test
	void testDivide() {
		assertEquals(2, m.divide(10, 5));
	}

	@Test
	void testDivideByZero() {
		assertEquals(2, m.divide(10, 0));
	}

	@Test
	void testDivideFailedReult() {
		assertEquals(4, m.divide(5, 2));
	}

}
