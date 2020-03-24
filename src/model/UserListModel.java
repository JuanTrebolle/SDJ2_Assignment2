package model;

import utility.PropertyChangeSubject;

import java.util.ArrayList;

public interface UserListModel extends PropertyChangeSubject
{
  void addUser(User user);
  void removeUser(User user);
  ArrayList<User> getUserList();
}
