package Gress.lab2;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Main m = new Main();
        Scanner scan = new Scanner(System.in);
        //task 27 autorisation
        try{
            m.autorisation();
        } catch (AutorisationException e) {
            System.out.println(e.getMessage());
        }

/*

        //task 24 with Comparator
        Student[] studentArr = {new Student("Zakharova", 20, 167), new Student("Muradian", 19, 175), new Student("Hress", 20, 170)};

        System.out.println("before sort: ");
        for(Student temp: studentArr)
            System.out.println(temp);
        System.out.println("___________________");


        int criteriaNum;
        do {
            System.out.println("Enter the number of the criteria you want your array to be sorted:");
            System.out.println("1. Surname\n2. Age\n3. Height");
            criteriaNum = scan.nextInt();
        }
        while(criteriaNum < 1 || criteriaNum > 3);
        switch (criteriaNum){
            case 1: m.sortStudents(studentArr, Student.studentSurnameComp); break;
            case 2: m.sortStudents(studentArr, Student.studentAgeComp); break;
            case 3: m.sortStudents(studentArr, Student.studentHightComp); break;
        }

        System.out.println("after sort: ");


        for(Student temp: studentArr)
            System.out.println(temp);
        System.out.println("___________________");

        //task 31, exception with /0
        ExceptionsForLab ex = new ExceptionsForLab();
        try {
            ex.showDivByZeroT();
        }
        finally {
            System.out.println("doing smth");
        }
        ex.showDivByZeroTC();

        //task 33, show exceptions: ArrayIndexOutOfBoundsException, ArithmeticException(was shown in task 31),
        //NullPointerException, IndexOutOfBoundsException, Exception (все методы в классе ExceptionsForLab, здесь всё на теории базируется)
        ex.showArrIndexOut();
        ex.showIndexOut();
        ex.showNullPtr();

        try {
            ex.showException();
        }catch (Exception e)
        {
            e.printStackTrace();
        }

        //task 37 with finding the areas of figures

        ArrayList<Coordinates> arrForTriangle = new ArrayList<>();
        Collections.addAll(arrForTriangle, new Coordinates(0,0),new Coordinates(0,3),new Coordinates(4,0));
        ArrayList<Coordinates> arrForRectangle = new ArrayList<>();
        Collections.addAll(arrForRectangle, new Coordinates(0,0), new Coordinates(0,3), new Coordinates(4,3), new Coordinates(4,0));
        ArrayList<Coordinates> arrForTrapezoid = new ArrayList<>();
        Collections.addAll(arrForTrapezoid, new Coordinates(0,0), new Coordinates(2,5), new Coordinates(5,5), new Coordinates(7,0));
        Figure[] arrOfFigures = {new Rectangle(arrForRectangle), new Trapezoid(arrForTrapezoid), new Triangle(arrForTriangle)};
        System.out.println("square of all figures = " + m.countAreaOfFigures(arrOfFigures));
*/



    }

    private void sortStudents(Student[] studentArr, Comparator<Student> comp){Arrays.sort(studentArr, comp);}

    private double countAreaOfFigures(Figure[] f)
    {
        double sum = 0;
        for(int i = 0; i < f.length; i++)
            sum += f[i].countArea();
        return sum;
    }

    private void autorisation () throws AutorisationException {
        Scanner scan = new Scanner(System.in);
        //task 27 autorisation
        HashMap <String, String> logAndPass = new HashMap<>();
        logAndPass.put("hress.a", "jhdf67p");
        logAndPass.put("muradian.k", "aks23ok8");
        logAndPass.put("reznichenko.s", "hn12okp0");
        String passwordEntered;
        int count1 = 0;
        do
        {
            int count2 = 0;
            System.out.println("Enter login: ");
            String loginEntered = scan.next();
            //scan.next

            if(!logAndPass.containsKey(loginEntered)) {
                System.out.println("this login doesn't exist, try again");
                count1++;
            }
            else {
                do{
                    System.out.println("Enter password: ");
                    passwordEntered = scan.next();
                    if(logAndPass.get(loginEntered).compareTo(passwordEntered) == 0){
                        System.out.println("you're logged in successfuly");
                        return;
                    }
                    else{
                        System.out.println("incorrect password. try again");
                        count2++;
                        count1++;
                    }

                }
                while (count2 < 3);
                System.out.println("you've tried to log in as " + loginEntered + " three times and they were not successful, so " +
                        "you're unable to log in with this login");
                logAndPass.remove(loginEntered);
            }



        } while(count1 < 7);
        if(count1 == 7)
            throw new AutorisationException("you've tried 7 times to log in. unfortunately, you're run out of attempts");
        //System.out.println("you've tried 7 times to log in. unfortunately, you're ran out of attempts ");
    }


}
