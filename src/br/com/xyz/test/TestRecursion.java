package br.com.xyz.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import br.com.xyz.refined.Recursion;

class TestRecursion {

	@Test
	void testSum() {
		assertEquals(55, Recursion.sum(10));
	}

	@Test
	void testPower() {
		assertEquals(81, Recursion.power(3, 4));
	}

}
