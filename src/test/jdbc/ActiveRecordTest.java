package jdbc;

import junit.framework.TestCase;
import model.Users;

/**
 * Created by easom on 2017/10/31.
 */
public class ActiveRecordTest extends TestCase {

    public void testDelete(){
        ActiveRecord activeRecord=new ActiveRecord();
        activeRecord.find(Users.class).delete("id",2);
    }
}