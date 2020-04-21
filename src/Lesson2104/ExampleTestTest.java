package Lesson2104;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.*;

import java.util.ArrayList;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class ExampleTestTest {

    @BeforeAll
    static void fixture(){
        System.out.println("Global before");
    }
    @AfterAll
    static void fixtureAfter(){
        System.out.println("Global after");
    }

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        System.out.println("Працює для кожного методу BeforeEach");

    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
        System.out.println("Працює для кожного методу AfterEach");
    }
// 59 60 61  74 75 76  89  90  91  30  68   80   95
    @ParameterizedTest
    @MethodSource("sourceMetod")
    void convert(int ball,int result) {
        ExampleTest exam=new ExampleTest();
        int actResult=exam.convert(ball);
        assertEquals(result,actResult);
    }

   static  Stream<Arguments> sourceMetod(){
        ArrayList<Arguments>  list=new ArrayList<>();
        for(int i=-200;i<120;i++){
            int result=i<60?2:(i<75?3:(i<90?4:5));
            list.add(Arguments.arguments(i,result));
        }
        return list.stream();
    }
    @DisplayName("цвукуе укуекуекуеукеукеуке")
@ParameterizedTest
    @CsvSource({
            "59,         2",
            "60,        3",
            "75, 4"
    })
    void convert33(int ball,int result) {
        ExampleTest exam=new ExampleTest();
        int actResult=exam.convert(ball);
        assertEquals(result,actResult);
    }

    @ParameterizedTest
    @CsvFileSource(resources ="/qwe.csv", numLinesToSkip = 1)
    void convert335(int ball,int result) {
        ExampleTest exam=new ExampleTest();
        int actResult=exam.convert(ball);
        assertEquals(result,actResult);
    }
}