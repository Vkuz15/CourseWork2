package pro.sky.JavaSkyPro.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pro.sky.JavaSkyPro.domain.Question;

import java.util.Collection;
import java.util.List;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class JavaQuestionServiceImplTest {

    JavaQuestionService javaQuestionService = new JavaQuestionServiceImpl();

    @Test
    void add() {
        Question question = new Question("Question1", "answer1");

        Question addQuestion = javaQuestionService.add("Question2", "Answer2");

        assertEquals(1, javaQuestionService.getAll().size());
        assertEquals(javaQuestionService, addQuestion);

        Question founded = javaQuestionService.findQuestion("Question2", "Answer2");

        assertEquals(javaQuestionService, founded);
    }

    @Test
    void testAdd() {
        Question findQuestion = javaQuestionService.add("Question", "Answer");
        assertEquals(findQuestion, javaQuestionService.findQuestion("Question", "Answer"));
    }

    @Test
    void remove() {
        Question expected = javaQuestionService.add("Question", "Answer");

        assertEquals(1, javaQuestionService.getAll().size());
        assertTrue(javaQuestionService.getAll().contains(expected));

        Question actual = javaQuestionService.remove("Question", "Answer");
        assertEquals(expected, actual);
        assertTrue(javaQuestionService.getAll().isEmpty());
    }

    @Test
    void testRemove() {
        Question removeQuestion = javaQuestionService.add("Question", "Answer");
        Question actual = javaQuestionService.remove("Question", "Answer");
        assertEquals(removeQuestion, actual);
        assertTrue(javaQuestionService.getAll().isEmpty());
    }

    @Test
    void getAll() {
        Question question1 = javaQuestionService.add("Question1", "Answer1");
        Question question2 = javaQuestionService.add("Question2", "Answer2");
        Collection<Question> expected = List.of(question1, question2);

        Collection<Question> actual = javaQuestionService.getAll();
        assertIterableEquals(expected, actual);
    }

    @Test
    void findQuestion() {
        Question question1 = javaQuestionService.add("Question1", "Answer1");
        Question question2 = javaQuestionService.add("Question2", "Answer2");
        Collection<Question> expected = List.of(question1, question2);

        Collection<Question> actual = javaQuestionService.getAll();
        assertIterableEquals(expected, actual);
    }
}