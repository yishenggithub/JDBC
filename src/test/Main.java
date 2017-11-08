import jdbc.ActiveRecord;
import model.Users;

import java.lang.reflect.Field;

public class Main {

    public static void main(String[] args) throws IllegalAccessException {
        Users users=new Users();
        ActiveRecord activeRecord=new ActiveRecord();
        activeRecord.find(users).update("name","ab");
    }
}
