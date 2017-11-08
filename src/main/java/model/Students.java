package model;

import jdbc.Annotation.Table;

/**
 * Created by easom on 2017/10/21.
 */
@Table(pk="id")
public class Students {
    private Integer id;
    private String name;
    private String telephone;
    public String test;

    public String getTest() {
        return test;
    }

    public void setTest(String test) {
        this.test = test;
    }

    public Integer getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    @Override
    public String toString() {
        return "Students{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", telephone='" + telephone + '\'' +
                ", test='" + test + '\'' +
                '}';
    }
}
