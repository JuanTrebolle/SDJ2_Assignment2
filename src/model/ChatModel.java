package model;

import utility.PropertyChangeSubject;

import java.util.ArrayList;

public interface ChatModel extends PropertyChangeSubject
{
 String getUserName();
 String getMessage();
 String toString();
 void setMessage(String message);
}
