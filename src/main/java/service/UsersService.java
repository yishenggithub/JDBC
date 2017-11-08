package service;

import jdbc.ActiveRecord;
import model.Users;

/**
 * Created by easom on 2017/10/21.
 */
public class UsersService {
    ActiveRecord activeRecord=new ActiveRecord();

    public void update() throws IllegalAccessException {
        Users users=new Users();
        ActiveRecord activeRecord=new ActiveRecord();
        users.setId(2);
        //users.setName("hh");
        activeRecord.find(users).update("name","ab");
    }
    public void get(){
        Users users=new Users();
        ActiveRecord activeRecord=new ActiveRecord();
        users=activeRecord.get(users,1);
        System.out.println(users.toString());
    }
}
