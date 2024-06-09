package pro.sky.JavaSkyPro.service;

import pro.sky.JavaSkyPro.domain.Question;

import java.util.Collection;
import java.util.Random;
import java.util.Set;

public interface QuestionService {

    Random RANDOM = new Random();
    Question add(String question, String answer);

    Question add(Question question);

    Question remove(String question, String answer);

    Collection<Question> getAll();

    Question getRandomQuestion(Set<Question> questions);

    Collection<Question> getQuestions(int amount);

    Question findQuestion(String question, String answer);
}
