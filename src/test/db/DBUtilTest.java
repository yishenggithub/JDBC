package db;

import jdbc.Db.DBUtil;
import junit.framework.TestCase;

import java.sql.Connection;

/**
 * Created by easom on 2017/10/24.
 */
public class DBUtilTest extends TestCase {
   public void testGetConnection(){
       Connection conn= DBUtil.getConnection();
   }
}