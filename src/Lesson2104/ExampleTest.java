package Lesson2104;

import java.util.function.Predicate;

public class ExampleTest {
    public static void main(String[] args) {

    }



// покриття за операторами 93
    // покриття по рішенням 39  61 75 85 93
    // покриття по умовам 30 31 62 63 45 77  87 93
    public int convert(int ball) {
        int result = 0;
        if (ball < 60 || ball%2==0) {
            if (ball == 45) {
                result = 5;
            } else {
                result = 2;
            }

        } else if (ball < 75) {
            result = 3;
        } else if (ball < 90) {
            result = 4;
        } else {
            result = 5;
        }
        return result;
    }

    int sumForCondition(int[] arr, Predicate<Integer> condition) {
        int result = 0;
        for (int i = 0; i < arr.length; i++) {
            if (condition.test(arr[i])) {
                result += arr[i];
            }
        }
        return result;
    }

    String convertToString(int digit) {
        String result = "";
        switch (digit) {
            case 1: {
                result = "one";
                break;
            }
            case 2: {
                result = "two";
            }
            default: {
                result = "default";

            }
        }

        return result;
    }
}
