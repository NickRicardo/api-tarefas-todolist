package br.com.nicolassantos.desafio_todolist.service;

import br.com.nicolassantos.desafio_todolist.entity.Todo;
import br.com.nicolassantos.desafio_todolist.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TodoService {

    private TodoRepository repository;

    public TodoService(TodoRepository repository) {
        this.repository = repository;
    }

    public List<Todo> create(Todo todo) {
        repository.save(todo);
        return list();
    }

    public List<Todo> list() {
        Sort sort = Sort.by("prioridade").descending().and(
                Sort.by("nome").ascending()
        );
        return repository.findAll(sort);
    }

    public List<Todo> update(Todo todo) {
        repository.save(todo);
        return list();
    }

    public List<Todo> delete(Long id) {
        repository.deleteById(id);
        return list();
    }
}
