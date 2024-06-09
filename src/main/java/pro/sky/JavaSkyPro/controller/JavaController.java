package pro.sky.JavaSkyPro.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.JavaSkyPro.domain.Question;
import pro.sky.JavaSkyPro.service.JavaQuestionService;

import java.util.Collection;

@RestController
@RequestMapping("/exam/java")
public class JavaController {
    private final JavaQuestionService questionService;

    public JavaController(JavaQuestionService questionService) {
        this.questionService = questionService;
    }

    @GetMapping(path = "/add")
    public Question addQuestion(@RequestParam String question, @RequestParam String answer) {
        return questionService.add(question, answer);
    }

    @GetMapping(path = "/remove")
    public Question removeQuestion(@RequestParam String question, @RequestParam String answer) {
        return questionService.remove(question, answer);
    }

    @GetMapping(path = "/find")
    public Question findQuestion(@RequestParam String question, @RequestParam String answer) {
        return null;
    }

    @GetMapping()
    public Collection<Question> getQuestions() {
        return questionService.getAll();
    }
}
