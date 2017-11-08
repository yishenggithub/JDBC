package service;

import jdbc.ActiveRecord;
import model.Students;
import model.Users;

import java.util.List;

/**
 * Created by easom on 2017/10/21.
 */
public class StudentsService {
    ActiveRecord activeRecord=new ActiveRecord();
    Students stu=new Students();
    //要在方法里面
    public void Save() throws IllegalAccessException {
        Students stu=new Students();
        stu.setName("jk");
        stu.setTelephone("134524");
        activeRecord.save(stu);
    }

    public void Delete() {

    }

    public void Update(){
        Students students=new Students();
        students.setName("hello");
        students.setId(2);
        activeRecord.find(students).update("test","biubiub");//.update("test","null");

    }

    public void get(){
        Students students=new Students();
      // List<Students> students4=activeRecord.find(students).where().getAll();
        //对于单一的查询用get
        Students students2=activeRecord.get(students,8);
        System.out.println(students2.toString());
    }

    public void getAll(){
        Students students=new Students();
        List list=activeRecord.getAll(students);
        System.out.println(list.toString());
    }

}
