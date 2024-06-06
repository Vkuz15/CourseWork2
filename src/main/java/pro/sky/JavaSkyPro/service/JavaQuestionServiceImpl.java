package pro.sky.JavaSkyPro.service;

import org.springframework.stereotype.Service;
import pro.sky.JavaSkyPro.domain.Question;

import java.util.*;

@Service
public class JavaQuestionServiceImpl implements JavaQuestionService {

    private Set<Question> questions = new HashSet<>();

    @Override
    public Question add(Question question) {
        questions.add(question);
        return question;
    }

    @Override
    public Question add(String question, String answer) {
        Question addQuestion = new Question(question, answer);
        questions.add(addQuestion);
        return addQuestion;
    }

    @Override
    public Question remove(Question question) {
        Question removeQuestion = question;
        questions.remove(question);
        return removeQuestion;
    }

    @Override
    public Question remove(String question, String answer) {
        Question findQuestion = findQuestion(question, answer);
        return remove(findQuestion);
    }

    @Override
    public Collection<Question> getAll() {
        return Collections.unmodifiableCollection(questions);
    }

    @Override
    public Question getRandomQuestion() {
        Random random = new Random();
        int randomInt = random.nextInt(questions.size());
        Question randomQuestion = questions.stream().skip(randomInt).findFirst().orElse(null);
        return randomQuestion;
    }

    public Question findQuestion(String question, String answer) {
        Question findQuestion = null;
        for (Question question1 : questions) {
            if (question1.getQuestion().equals(question) && question1.getAnswer().equals(answer)) {
                findQuestion = question1;
            }
        }
        return findQuestion;
    }
}
