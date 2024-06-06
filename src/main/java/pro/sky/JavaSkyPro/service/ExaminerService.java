package pro.sky.JavaSkyPro.service;

import pro.sky.JavaSkyPro.domain.Question;

import java.util.Collection;

public interface ExaminerService {

    Collection<Question> getQuestions(int amount);
}
