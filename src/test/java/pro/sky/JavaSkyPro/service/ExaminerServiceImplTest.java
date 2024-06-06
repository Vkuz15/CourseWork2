package pro.sky.JavaSkyPro.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ExaminerServiceImplTest {

    private ExaminerServiceImpl service;

    @Test
    void getQuestions() {
        service.getQuestions(3);
    }
}