package core;

import model.*;

public class ModelFactory
{
  private Model model;

  public Model getModel()
  {
    if(model == null){
      model = new ModelManager();
    }
    return model;
  }
}
