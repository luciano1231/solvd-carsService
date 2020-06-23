package com.solvd.carsService.myBatis.models;

import com.solvd.carsService.carServicesTask.User;

import java.util.List;

public class UserList {
    public class UsersList {
        private Long id;
        private List<User> users;
        public UsersList(Long id,List<User> users) {
            this.id = id;
            this.users = users;
            // TODO Auto-generated constructor stub
        }
        public Long getId() {

            return id;
        }

        public void setId(Long id) {

            this.id = id;
        }

        public List<com.solvd.carsService.carServicesTask.User> getUsers() {

            return users;
        }

        public void setUsers(List<User> users) {

            this.users = users;
        }

    }
}
