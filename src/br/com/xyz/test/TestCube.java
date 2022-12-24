package br.com.xyz.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import br.com.xyz.extend.Cube;

class TestCube {

	Cube cube;

	@BeforeEach
	void setUp() throws Exception {
		cube = new Cube(10);
	}

	@Test
	void testCalculateVolume() {
		assertEquals(600, cube.calculateVolume());
	}

	@Test
	void testCalculateArea() {
		assertEquals(1000, cube.calculateArea());
	}

}
