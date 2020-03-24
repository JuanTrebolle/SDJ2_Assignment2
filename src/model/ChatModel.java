package model;

import utility.PropertyChangeSubject;

import java.util.ArrayList;

public interface ChatModel extends PropertyChangeSubject
{
 String getUserName();
 String getMessage();
 String toString();
 void setUserName(String name);
 void setMessage(String message);
}
