package com.demo;

import static org.junit.jupiter.api.Assertions.*;

import java.time.Duration;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalTest {

	private Cal cal;

	@BeforeEach
	void setUp() throws Exception {
		cal=new Cal();
	}
	
//	@Test
//	void testAdd() {
//		Assertions.assertEquals(4, cal.add(2, 2));
//	}

//	@Test
//	void testDivide() {
//		Assertions.assertThrows(ArithmeticException.class, ()-> cal.divide(3, 0));
//	}
//	
//	@Test
//	void testDivide() {
//		int sum=Assertions.assertTimeout(Duration.ofMillis(100), ()-> cal.add(2, 1));
//	}

	@AfterEach
	void tearDown() throws Exception {
		cal=null;
	}

	
}
