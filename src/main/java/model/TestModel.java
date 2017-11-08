package model;

import jdbc.Annotation.Table;

/**
 * Created by easom on 2017/10/30.
 */
@Table(pk="id")
public class TestModel {

        private String name;
        private int id;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }


}
