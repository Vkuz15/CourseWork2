package pro.sky.JavaSkyPro.service;

import pro.sky.JavaSkyPro.domain.Question;

import java.util.Collection;
import java.util.Collections;
import java.util.Set;

public interface JavaQuestionService {

    Question add(String question, String answer);

    Question add(Question question);

    Question remove(Question question);

    Question remove(String question, String answer);

    Collection<Question> getAll();

    Question getRandomQuestion();

}