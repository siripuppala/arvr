package com.kmit.arvr;

public class RecyclerModel {

        private String id;
        private String name;
        private String dept;

        public  RecyclerModel(){


        }

        public RecyclerModel(String id, String name, String dept) {
            this.id = id;
            this.name = name;
            this.dept = dept;
        }

        public String getId() {
            return id;
        }

        public String getName() {
            return name;
        }

        public String getDept() {
            return dept;
        }
    }
