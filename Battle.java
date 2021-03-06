public class Battle
{
  /*
  private Pokemon p1;
  private Pokemon p2;
  
  public Battle(Pokemon pl1, Pokemon pl2)
  {
    p1 = pl1;
    p2 = pl2;
  }
  */
  
  public static int ePokePreBattle;
  public static int ePokePostBattle;
  
  public static void semiRound(Pokemon poke, Pokemon ePoke, Move move)//will have 2 semiRounds per round (for each move)
  {
    int pokeMoveCat = move.getCat();//edit the move class so that it seperates type and category, did this
    double accCheck = Math.random();
    
    int crit = (int)(Math.random() * 16);
    if(crit == 0)
    {
      crit = 3;
    }
    else
    {
      crit = 1;
    }
    
    double stab = 1.0;
    if(poke.getType1() == move.getType() || poke.getType2() == move.getType())
    {
      stab = 1.5;
    }
    
    if(accCheck < move.getAcc())
    {
      if(pokeMoveCat == 0)
      {
        double pokeAttack = poke.getAttack();
        double ePokeDefense = ePoke.getDefense();
        ePokePreBattle = ePoke.getCurrentHealth();
        ePoke.setCurrentHealth((int)(ePoke.getCurrentHealth() - ((((22)*(move.getPower())*(pokeAttack/ePokeDefense)/50)+2)
                                                        *(crit*typeBoost(move,ePoke)*stab))));
        ePokePostBattle = ePoke.getCurrentHealth();
      }
      else if(pokeMoveCat == 1)
      {
        double pokeSpAtk = poke.getSpAtk();
        double ePokeSpDef = ePoke.getSpDef();
        ePokePreBattle = ePoke.getCurrentHealth();
        ePoke.setCurrentHealth((int)(ePoke.getCurrentHealth() - ((((22)*(move.getPower())*(pokeSpAtk/ePokeSpDef)/50)+2)
                                                        *(crit*typeBoost(move,ePoke)*stab))));
        ePokePostBattle = ePoke.getCurrentHealth();
      }
      else if(pokeMoveCat == 2)
      {
        
      }
      else
      {
        
      }
    }
    
  }
  
  
  
  /*
  Normal = 0
  Grass = 1
  Fire = 2
  Water = 3
  */
  public static double typeBoost(Move moveX, Pokemon ePoke)//move damage boost against pokemon
  {
    int move = moveX.getType();
    int ePokeType1 = ePoke.getType1();
    int ePokeType2 = ePoke.getType2();
    if(move == 1 && ePokeType1 == 3 || move == 1 && ePokeType2 == 3)//grass move boost
    {
      return 2.0;
    }
    else if(move == 1 && ePokeType1 == 2 || move == 1 && ePokeType2 == 2)//grass move weakness
    {
      return 0.5;
    }
    else if(move == 2 && ePokeType1 == 1 || move == 2 && ePokeType2 == 1)//fire move boost
    {
      return 2.0;
    }
    else if(move == 2 && ePokeType1 == 3 || move == 2 && ePokeType2 == 3)//fire move weakness
    {
      return 0.5;
    }
    else if(move == 3 && ePokeType1 == 2 || move == 3 && ePokeType2 == 2)//water move boost
    {
      return 2.0;
    }
    else if(move == 3 && ePokeType1 == 1 || move == 3 && ePokeType2 == 1)//water move weakness
    {
      return 0.5;
    }
    else
    {
      return 1;
    }
  }
  
  
  
}