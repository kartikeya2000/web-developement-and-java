package com.mokito.Business;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.stub;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import com.mokito.data.api.TodoService;
import com.mokito.data.api.TodoServiceStub;

class TodoBusinessimplStub {
	
	@Test
	void test() {
	
		TodoService mocktodoservice  = mock(TodoService.class);
		List<String> todos = Arrays.asList("Learn Spring MVC","Learn Spring", "Learn to dance"); 
		
		when(mocktodoservice.retrieveTodos("Dummy")).thenReturn(todos);
		TodoBusinessimpl todobusinessimpl = new TodoBusinessimpl(mocktodoservice);
		
		List<String> filteredtodos =  todobusinessimpl.retrieveTodosReleatedToSpring("Dummy");
		
		assertEquals(2,filteredtodos.size());
		
		
	}

}
