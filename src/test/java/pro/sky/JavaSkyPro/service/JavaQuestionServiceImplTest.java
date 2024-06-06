package pro.sky.JavaSkyPro.service;

import org.junit.jupiter.api.Test;
import pro.sky.JavaSkyPro.domain.Question;

import java.util.Set;

class JavaQuestionServiceImplTest {

    Set<Question> exam = Set.of(
            new Question("Вопрос1", "Ответ1"),
            new Question("Вопрос2", "Ответ2"),
            new Question("Вопрос3", "Ответ3"),
            new Question("Вопрос4", "Ответ4"),
            new Question("Вопрос5", "Ответ5")
    );

    @Test
    void add() {
    }

    @Test
    void testAdd() {
    }

    @Test
    void remove() {
    }

    @Test
    void testRemove() {
    }

    @Test
    void getAll() {
    }

    @Test
    void findQuestion() {
    }
}