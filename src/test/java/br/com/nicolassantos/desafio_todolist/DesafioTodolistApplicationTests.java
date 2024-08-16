package br.com.nicolassantos.desafio_todolist;

import br.com.nicolassantos.desafio_todolist.entity.Todo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.reactive.server.WebTestClient;

@SpringBootTest
class DesafioTodolistApplicationTests {

    @Autowired
    private WebTestClient webTestClient;

    @Test
    void testCreateTodoSuccess() {
        var todo = new Todo("todo 1", "Desc Todo 1", false, 1);
    }



    @Test
    void testCreateTodoFailure() {

    }

}
