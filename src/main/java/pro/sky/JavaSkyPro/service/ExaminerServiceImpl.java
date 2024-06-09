package pro.sky.JavaSkyPro.service;

import org.springframework.stereotype.Service;
import pro.sky.JavaSkyPro.domain.Question;
import pro.sky.JavaSkyPro.exception.LimitOfQuestionsException;

import java.util.*;

@Service
public class ExaminerServiceImpl implements ExaminerService {

    private final JavaQuestionService questionService;

    public ExaminerServiceImpl(JavaQuestionService questionService) {
        this.questionService = questionService;
    }

    @Override
    public Collection<Question> getQuestions(int amount) {
        Set<Question> questions = new HashSet<>();
        if (amount > questionService.getAll().size()) {
            throw new LimitOfQuestionsException("Достигнут лимит вопросов");
        }
        while (questions.size() < amount) {
            questions.add(questionService.getRandomQuestion());
        }
        return questions;
    }
}