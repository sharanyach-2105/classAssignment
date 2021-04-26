package com.ibm.Junit_Test;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class LifeCycleJunit {
	@BeforeAll
	public static void beforeAll() {
		System.out.println("Before all");
	}

	@BeforeEach
	public void setup() {
		System.out.println("Before Every Test Case");
	}

	@Test
	public void test1() {
		System.out.println("Test 1 Executed");
	}

	@Test
	public void test2() {
		System.out.println("Test 2 Executed");
	}

	@Test
	public void test3() {
		System.out.println("Test 3 Executed");
	}

	@AfterEach
	public void testDown() {
		System.out.println("After Each Test Case");
	}

	@AfterAll
	public static void afterAll() {
		System.out.println("After All");
	}
}