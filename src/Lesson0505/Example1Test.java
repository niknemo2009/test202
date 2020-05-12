package Lesson0505;

import org.testng.annotations.DataProvider;

import static org.testng.Assert.*;

public class Example1Test {

    @org.testng.annotations.Test(dataProvider = "Datatest1")
    public void testSum(String res,int ...ew) {
        Example1 ex1=new Example1();
        int expResult=Integer.valueOf(res);
        assertEquals(expResult,ex1.sum(ew));
    }

    @DataProvider(name = "Datatest1")
    public Object[][] createData1() {
        return new Object[][] {
                { "7",1,2,3},
                { "23",3,4,7,9},
                { "0",new int[]{}}
        };
    }

    @org.testng.annotations.Test(dataProvider = "Datatest23")
    public void testSum12(String res,int ...ew) {
        Example1 ex1=new Example1();
        int expResult=Integer.valueOf(res);
        assertEquals(expResult,ex1.sum(ew));
    }

    @DataProvider(name = "Datatest23")
    public Object[][] createData2333() {
        return new Object[][] {
                { "6",1,2,3},
                { "23",3,4,7,9},
                { "17",5,5,7}
        };
    }

}