package pro.sky.JavaSkyPro.service;

import pro.sky.JavaSkyPro.domain.Question;

import java.util.Collection;

public interface JavaQuestionService {

    Question add(String question, String answer);

    Question add(Question question);

    Question remove(Question question);

    Question remove(String question, String answer);

    Collection<Question> getAll();

    Question getRandomQuestion();

    Question findQuestion(String question, String answer);
}