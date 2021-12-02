package com.mokito.Business;

import static org.junit.jupiter.api.Assertions.*;
import  java.util.List;
import static org.mockito.Mockito.when;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.*;
import org.junit.jupiter.api.*;
import org.mockito.Mock;

class ListTest {
	@Mock
	List listmock;

	@Test
	void test() {
		
		
		when(listmock.get(0)).thenReturn(2);
		assertEquals(2,listmock.get(0));
		
	}

}
