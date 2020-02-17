package com.fidelity.email;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EmailGeneratorTest {

	@Before
	public static void onceExecutedBeforeAll() {
		EmailGenerator e;
	}

	@Test
	void returnsCorrectString() {
		EmailGenerator e = new EmailGenerator();
		String temp = e.makeEmailFromName("Kevin Cusack");
		
		assertEquals(temp, "Kevin Cusack", "Not yet implemented");
		assertNotEquals(temp, "Kevin: Cusack", "Strings are the same.");
	}
	
	@Test
	void returnsWrongString() {
		EmailGenerator e = new EmailGenerator();
		String temp = e.makeEmailFromName("Kevin Cusack");
		assertNotEquals(temp, "Kevin - Cusack", "Strings should not be Equal.");
	}

}
