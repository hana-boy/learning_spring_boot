package com.example.webapp;

import com.example.webapp.entity.ToDo;
import com.example.webapp.service.ToDoService;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@RequiredArgsConstructor
public class WebappApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebappApplication.class, args)
				.getBean(WebappApplication.class).exe();
	}

	private final ToDoService service;

	public void exe() {
		System.out.println("全文検索");
		for (ToDo row : service.findAllToDo()) {
			System.out.println(row);
		}

		System.out.println("1件検索");
		System.out.println(service.findByIdToDo(1));

		ToDo todo = new ToDo();
		todo.setTodo("リポジトリへのテスト");
		todo.setDetail("DBへの登録処理");
		service.insertToDo(todo);
		System.out.println("確認");
		System.out.println(service.findByIdToDo(4));

		ToDo target = service.findByIdToDo(4);
		target.setTodo("更新");
		target.setDetail("更新処理");
		service.updateToDo(todo);
		System.out.println("確認");
		System.out.println(service.findByIdToDo(4));

		service.deleteToDo(4);
		for (ToDo row : service.findAllToDo()) {
			System.out.println(row);
		}
	}

}
