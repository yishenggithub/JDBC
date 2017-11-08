package service;

import junit.framework.TestCase;

/**
 * Created by easom on 2017/10/22.
 */
public class StudentsServiceTest extends TestCase {

    public void testSave() throws Exception {
        StudentsService studentsService=new StudentsService();
        studentsService.Save();
    }

    public void testStudentUpdate(){
        StudentsService studentsService=new StudentsService();
        studentsService.Update();
    }

    public void testStudentGet(){
        StudentsService studentsService=new StudentsService();
        studentsService.get();
    }

    public void testStudentGetAll(){
        StudentsService studentsService=new StudentsService();
        studentsService.getAll();
    }
}