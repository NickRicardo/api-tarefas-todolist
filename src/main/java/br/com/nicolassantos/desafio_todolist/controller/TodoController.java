package br.com.nicolassantos.desafio_todolist.controller;

import br.com.nicolassantos.desafio_todolist.entity.Todo;
import br.com.nicolassantos.desafio_todolist.service.TodoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/todos")
public class TodoController {

    public TodoController(TodoService service) {
        this.service = service;
    }

    private TodoService service;

    @PostMapping
    List<Todo>create (@RequestBody Todo todo){
        return service.create(todo);
    }

    @GetMapping
    List<Todo>list (){
        return service.list();
    }


    @PutMapping
    List<Todo>update (@RequestBody Todo todo){
        return service.update(todo);
    }


    @DeleteMapping("{id}")
    List<Todo>delete (@PathVariable("id") Long id){
        return service.delete(id);
    }
}
