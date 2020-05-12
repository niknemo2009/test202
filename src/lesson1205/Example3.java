package lesson1205;

import java.util.*;

public class Example3 {
    public static void main(String[] args) {
// Create cafe
        //  Клієн повинен заказати місце
        // Адміністрація кафе надає пропозиції щодо місця
        // Клієнт снідає та покидає кафе

    }
}

class  Klient extends  Thread{
String name;
int maxTimeWaiting;
Service service;
boolean isSatiated;


    public Klient(String name, int maxTimeWaiting,Service service) {
        this.name = name;
        this.maxTimeWaiting = maxTimeWaiting;
    }

    @Override
    public void run() {
        while(!isSatiated)
        getService(service);
            }

    void getService(Service serv){
        serv.serv(this);
    }

    @Override
    public String toString() {
        return name +" "+ maxTimeWaiting ;
    }
}
class Cafe implements Service,Runnable {
    Set<Klient> queie=new HashSet<>();
    List<Table> places=new ArrayList<>();
    String name;
    int countTable;

    public Cafe(String name, int countTable) {
        this.name = name;
        this.countTable = countTable;
        for(int i=0;i<countTable;i++){
            places.add(new Table(i,4));
        }
    }


    @Override
    public boolean serv(Klient klient) {
        for (Table temp:places) {
            if(temp.isFreePlace()){
                temp.listClient.add(klient);\
            }
        }
        return false;
    }

    @Override
    public void run() {

    }
}
class Table{
    int number;
    int maxCountPerson;
    List<Klient> listClient=new Vector<>();

    public Table(int number, int maxCountPerson) {
        this.number = number;
        this.maxCountPerson = maxCountPerson;
    }
}

@FunctionalInterface
interface Service {
          boolean serv(Klient klient);
}