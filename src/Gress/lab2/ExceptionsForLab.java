package Gress.lab2;

import java.io.FileInputStream;

public class ExceptionsForLab {
    public void showDivByZeroTC(){
        try {
            System.out.println(21 / 0);
        } catch (ArithmeticException e){
            // e.printStackTrace();
            System.out.println("div by 0");
        }
        finally {
            System.out.println("release of resources");
        }
    }

    public void showDivByZeroT() throws ArithmeticException{
        System.out.println(21 / 0);
    }

    public void showArrIndexOut(){
        int[] arr = {1, 3, 5, 7};
        try {
            arr[13] = 9;
        } catch (ArrayIndexOutOfBoundsException e){
            e.printStackTrace();
        }
    }

    public void showIndexOut(){
        String str = "kindergarten";
        try {
            String subStr = str.substring(5, 15);
        }catch (IndexOutOfBoundsException e){
            e.printStackTrace();
        }
    }
    private Student st;
    public void showNullPtr(){

        try {
            st.toString();
        }catch (NullPointerException e){
            e.printStackTrace();
        }
    }

    public void showException() throws Exception{
        FileInputStream f = null;
        f = new FileInputStream("newFile");

    }
}
