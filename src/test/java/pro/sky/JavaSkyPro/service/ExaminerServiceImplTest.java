package pro.sky.JavaSkyPro.service;

import org.junit.jupiter.api.Test;

class ExaminerServiceImplTest {

    private ExaminerServiceImpl examinerService;

    @Test
    void getQuestions() {
        examinerService.getQuestions(3);
    }
}