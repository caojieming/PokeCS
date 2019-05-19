public class Move
{
  private static final int NORMAL = 0;
  private static final int GRASS = 1;
  private static final int FIRE = 2;
  private static final int WATER = 3;
  private static final int PSYCHIC = 4;
  private static final int GROUND = 5;
  
  private static final int PHYSICAL = 0;
  private static final int SPECIAL = 1;
  private static final int SELFSTATUS = 2;
  private static final int OPPSTATUS = 3;
  
  private String name;
  private int pp;
  private double acc;
  private int power;
  private int type;
  private int cat;
  
  //Physical == 0
  //Special == 1
  //Status == 2
  
  public Move(String moveName, int pPoints, int moveCat, int moveType, int movePower, double accuracy)
  {
    name = moveName;
    pp = pPoints;
    type = moveType;
    acc = accuracy;
    power = movePower;
    cat = moveCat;
  }
  
  public int getType()
  {
    return type;
  }
  
  public void setType(int moveType)
  {
    type = moveType;
  }
  
  public void setName(String str)
  {
    name = str;
  }
  
  public String getName()
  {
    return name;
  }
  
  public int getPower()
  {
    return power;
  }
  
  public void setPower(int movePower)
  {
    power = movePower;
  }
  
  public void setPowerPoints(int x)
  {
    if (x <= 56)
      pp = x;
    else
      System.out.println("Power points is maxed out");
  }
  
  public int getPowerPoints()
  {
    return pp;
  }
  
  public void setCat(int x)
  {
    cat = x;
  }
  
  public int getCat()
  {
    return cat;
  }
  
  public double getAcc()
  {
    return acc;
  }
  
  public void setAcc(double x)
  {
    acc = x;
  }
  
  
  
  /*
  Normal = 0
  Grass = 1
  Fire = 2
  Water = 3
  */
  
  // Move name, pp, move category, move type, move power, accuaracy 
  public static Move moveList(String moveName)
  {
    if(moveName.equals("Flamethrower"))
    {
      return new Move("Flamethrower", 15, SPECIAL, FIRE, 90, 1.0);
    }
    else if(moveName.equals("Scald"))
    {
      return new Move("Scald", 15, SPECIAL, WATER, 80, 1.0);
    }
    else if(moveName.equals("LeafBlade"))
    {
      return new Move("LeafBlade", 15, PHYSICAL, GRASS, 90, 1.0);
    }
    else if(moveName.equals("Strength"))
    {
      return new Move("Strength", 15, PHYSICAL, NORMAL, 80, 1.0);
    }
    else if(moveName.equals("HydroPump"))
    {
      return new Move("HydroPump", 5, SPECIAL, WATER, 110, 0.8);
    }
    else if(moveName.equals("—"))
    {
      return new Move("—", 0, 0, 0, 0 , 0);
    }
    else if(moveName.equals("Tackle"))
    {
      return new Move("Tackle", 35, PHYSICAL, NORMAL, 40, 1.0);
    }
    else if(moveName.equals("Splash"))
    {
      return new Move ("Splash", 40, SELFSTATUS, NORMAL, 0, 0);
    }
    else if(moveName.equals("Earthquake"))
    {
      return new Move ("Earthquake", 10, PHYSICAL, GROUND, 100, 1.0);
    }
    else if(moveName.equals("Psychic"))
    {
       return new Move ("Psychic", 10, SPECIAL, PSYCHIC, 90, 1.0);
    }
    else
    {
      throw new RuntimeException("Invalid move: "+ moveName + "!");
    }
  }
  
  
}