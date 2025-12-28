package draft;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.Arrays;

public class DraftClass {
    @Test (dataProvider = "loginData")
    public void  login(String email, String password, boolean success){
        System.out.println("Login credentials:\nLogin Email: "+email+"\nLogin Password: "+password+"\nLogin Success: "+success+"\n\n");
    }
    @DataProvider
    public  Object [][] loginData(){
        Object [][]data = new Object[3][3];
        data[0][0] = "alicade@gamil.com" ; data[0][1] = "12345" ; data[0][2] = true ;
        data[1][0] = "abiturije@gamil.com" ; data[1][1] = "12345" ; data[1][2] = false ;
        data[2][0] = "dusabe@gamil.com" ; data[2][1] = "12345" ; data[2][2] = true ;
        return  data;
    }
}
