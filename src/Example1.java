import java.util.ArrayList;
import java.util.Collection;

public class Example1 {

    Collection<Integer> filter (int[] arr, filter_interface rule){
        Collection<Integer> result=new ArrayList<>();
        for(int i=0; i<arr.length; i++){
            if(rule.applyConditions(arr[i])){
                System.out.println(arr[i]);
                result.add(arr[i]);
            }
        }
        return result;
    }
    <T> Collection<T>  filtr(T[] arr,filter_interface33<T> rule){
      Collection<T>  result=new ArrayList<>();
        for(T temp:arr){
          if(rule.applyConditions(temp)==true){
              System.out.println(temp);
              result.add(temp);
          }
      }
        return  result;
    };

    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6};
        filter_interface cond =c -> c%2==0;
        filter_interface cond1= c -> {
            boolean result=false;
            int counter=0;
            for(int i =1;i<=c; i++){
                if(c%i==0){
                    counter++;
                    if(counter>2){
                        break;
                    }

                }
            }
            if(counter<=2){
                result=true;
            }
            return result;
        };
        Example1 ex1 = new Example1();
String [] massiv={"one","table","tree"};

        System.out.println(ex1.filter(arr, cond1));
        System.out.println(ex1.filter(arr, f -> f>3));
        System.out.println(ex1.filtr(massiv,r->r.length()>4));


    }

    public <T extends  Number>  double sumArray(T[] arr) {
        double result=0;
        for(T temp:arr){
            result+=temp.doubleValue();
        }
        return result;
    }
}
@FunctionalInterface
interface filter_interface{
    boolean applyConditions(int c);


}

@FunctionalInterface
interface filter_interface33<W>{
    boolean applyConditions( W  element);


}