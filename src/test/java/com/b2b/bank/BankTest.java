package com.b2b.bank;

import static org.junit.Assert.*;

import org.junit.Test;

import com.b2b.bank.util.Utils;

public class BankTest {

	@Test
	public void testCzyListaJestPusta() {
		Utils utils = new Utils();
		String nazwisko = utils.nazwiskoKlienta();
		
		assertEquals("nazwisko", nazwisko);
	}

}
