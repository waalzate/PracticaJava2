package com.example.demo;

import com.example.demo.entities.Task;
import com.example.demo.entities.TaskList;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;

@SpringBootApplication
public class DemoApplication {


	public static void main(String[] args) {
		 SpringApplication.run(DemoApplication.class, args) ;
		/*Task tarea1 = new Task("Aprender Java", false, LocalDate.of(2022,12,31));
		System.out.println(tarea1.getDescription());
		tarea1.setDescription("Aprender Java y desarrollo Web");
		System.out.println(tarea1.getDescription());

		TaskList propositos = new TaskList("propositos fin de años");
		propositos.addTask(tarea1);
		System.out.println(propositos.getTaskList().size());
		Task tarea2 = new Task("Aprender HTML", false, LocalDate.of(2022,12,31));

		propositos.addTask(tarea2);
		System.out.println(propositos.getTaskList().size());

*/
	}


}
