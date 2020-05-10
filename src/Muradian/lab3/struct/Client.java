package Muradian.lab3.struct;

public class Client {
    private String name;
    private int place;
    private int code;

    public Client(){};

    public Client(String name, int place, int code){
        this.name = name;
        this.place = place;
        this.code = code;
    }

    public void setName(String name) { this.name = name; };
    public void setPlace(int place) { this.place = place; };
    public void setCode(int code) { this.code = code; };

    public String getName() { return name; };
    public int getPlace() { return place; };
    public int getCode() { return code; };


}
