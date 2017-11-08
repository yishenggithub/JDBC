package service;

import junit.framework.TestCase;

/**
 * Created by easom on 2017/10/31.
 */
public class UsersServiceTest extends TestCase {
    UsersService usersService=new UsersService();
    public void testUpdate() throws IllegalAccessException {
        usersService.update();
    }

    public void testGet(){
        usersService.get();
    }

}