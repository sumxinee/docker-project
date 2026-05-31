package student;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;

// 순서(Order)대로 테스트를 실행하겠다는 설정
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class StudentManagerTest {

    private static StudentManager studentManager;

    @BeforeAll
    static void setUp() {
        studentManager = new StudentManager();
    }

    @Test
    @Order(1)
    void addStudentTest() {
        // [조건 1] 학생 추가 및 assertTrue 사용
        studentManager.addStudent("홍길동");
        assertTrue(studentManager.hasStudent("홍길동"));
    }

    @Test
    @Order(2)
    void duplicateAddExceptionTest() {
        // [조건 3] 중복 추가 예외 처리 및 assertThrows 사용
        assertThrows(IllegalArgumentException.class, () -> {
            studentManager.addStudent("홍길동");
        });
    }

    @Test
    @Order(3)
    void removeNonExistentExceptionTest() {
        // [조건 4] 존재하지 않는 학생 제거 예외 처리 및 assertThrows 사용
        assertThrows(IllegalArgumentException.class, () -> {
            studentManager.removeStudent("임꺽정");
        });
    }

    @Test
    @Order(4)
    void removeStudentTest() {
        // [조건 2] 학생 제거 및 assertFalse 사용
        studentManager.removeStudent("홍길동");
        assertFalse(studentManager.hasStudent("홍길동"));
    }
}