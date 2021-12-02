package com.mokito.Business;

import java.util.ArrayList;
import java.util.List;

import com.mokito.data.api.TodoService;

public class TodoBusinessimpl {
         private TodoService todoservice;

		public TodoBusinessimpl(TodoService todoservice) {
			super();
			this.todoservice = todoservice;
		}
		
		public List<String> retrieveTodosReleatedToSpring(String user){
			List<String>filteredTodos = new ArrayList<String>();
			
			List<String>todos = todoservice.retrieveTodos(user);
		
			for(String todo:todos) {
				if(todo.contains("Spring")) {
					filteredTodos.add(todo);
				}
			}
			return filteredTodos;
		} 
}
