import java.awt.*;
import javax.swing.*;  //for JFrame, BoxLayout, JLabel, JTextField, JButton

public class Pokemon 
{
  public static final int NORMAL = 0;
  public static final int GRASS = 1;
  public static final int FIRE = 2;
  public static final int WATER = 3;
  public static final int PSYCHIC = 4;
 
  public static final int NULL = 99;
  
  // 0      1       2        3        4       5
  //[HP, Attack, Defense, Sp. Atk, Sp. Def, Speed]
  
  private String name;
  private int[] stats;
  private int type1;
  private int type2;
  private Move[] moves;
  private Image frontSprite;
  private Image backSprite;
  private boolean isFainted;
  private int currentHealth;
  
  public Pokemon(String pokemonName, Move[] pokemonMoves, int[] pokemonStats, 
                      int pokemonType1, int pokemonType2, Image pokemonFrontSprite, Image pokemonBackSprite, boolean isFainted)
  {
    name = pokemonName;
    stats = pokemonStats;
    type1 = pokemonType1;
    type2 = pokemonType2;
    moves = pokemonMoves;
    frontSprite = pokemonFrontSprite;
    backSprite = pokemonBackSprite;
    isFainted = false;
    currentHealth =  stats[0];
  }
  
  public String getName()
  {
    return name;
  }
  
  public int getHP()
  {
    return stats[0];
  }
  
  public int getCurrentHealth()
  {
    return currentHealth;
  }
  
  public void setCurrentHealth(int newHealth)
  {
    currentHealth = newHealth;
  }
    
  
  public int getAttack()
  {
    return stats[1];
  }
  
  public int getDefense()
  {
    return stats[2];
  }
  
  public int getSpAtk()
  {
    return stats[3];
  }
  
  public int getSpDef()
  {
    return stats[4];
  }
  
  public int getSpeed()
  {
    return stats[5];
  }
  
  public void setHP(int hp)
  {
    stats[0] = hp;
  }
  
  public void setAttack(int attack)
  {
    stats[1] = attack;
  }
  
  public void setDefense(int defense)
  {
    stats[2] = defense;
  }
  
  public void setSpAtk(int spAtk)
  {
    stats[3] = spAtk;
  }
  
  public void setSpDef(int spDef)
  {
    stats[4] = spDef;
  }
  
  public void setSpeed(int speed)
  {
    stats[5] = speed;
  }
  
  public int getType1()
  {
    return type1;
  }
  
  public int getType2()
  {
    return type2;
  }
  
  public Move getMove1()
  {
    return moves[0];
  }
  
  public Move getMove2()
  {
    return moves[1];
  }
  
  public Move getMove3()
  {
    return moves[2];
  }
  
  public Move getMove4()
  {
    return moves[3];
  }
  
  public void setMove1(Move move1)
  {
    moves[0] = move1;
  }
  
  public void setMove2(Move move2)
  {
    moves[1] = move2;
  }  
  
  public void setMove3(Move move3)
  {
    moves[2] = move3;
  } 
  
  public void setMove4(Move move4)
  {
    moves[3] = move4;
  }  
  
  public Image getFrontSprite()
  {
    return frontSprite;
  }
  
  public Image getBackSprite()
  {
    return backSprite;
  }
  
  public boolean isFainted()
  {
    return isFainted;
  }
  
  public void fainted()
  {
    isFainted = true;
  }
  
  public static Pokemon pokemonList(String pokName)
  {
    if (pokName.equals("Furret"))
    {
      Pokemon furret;
      Move[] furretMoves = new Move[4];
      int[] furretStats = new int[6];
      furretStats[0] = 192;
      furretStats[1] = 140;
      furretStats[2] = 127;
      furretStats[3] = 106;
      furretStats[4] = 117;
      furretStats[5] = 156;
  
      furret = new Pokemon("Furret", furretMoves, furretStats, NORMAL, NULL, new ImageIcon(Pokemon.class.getResource("Furretfront.gif")).getImage(), 
                           new ImageIcon(Pokemon.class.getResource("Furretback.gif")).getImage(), false);
      
      return furret;
      
    }
    else if (pokName.equals("Charizard"))
    {
      Pokemon charizard;
      Move[] charizardMoves = new Move[4];
      charizardMoves[0] = Move.moveList("Flamethrower");
      charizardMoves[1] = Move.moveList("—");
      charizardMoves[2] = Move.moveList("—");
      charizardMoves[3] = Move.moveList("—");
      int[] charizardStats = new int[6];
      charizardStats[0] = 185;
      charizardStats[1] = 149;
      charizardStats[2] = 143;
      charizardStats[3] = 177;
      charizardStats[4] = 150;
      charizardStats[5] = 167;
  
      charizard = new Pokemon("Charizard", charizardMoves, charizardStats, FIRE, NULL, new ImageIcon(Pokemon.class.getResource("Charizardfront.gif")).getImage(), 
                           new ImageIcon(Pokemon.class.getResource("Charizardback.gif")).getImage(), false);
      
      return charizard;      
    }
    else if(pokName.equals("Sceptile"))
    {
      Pokemon sceptile;
      Move[] sceptileMoves = new Move[4];
      sceptileMoves[0] = Move.moveList("LeafBlade");
      sceptileMoves[1] = Move.moveList("—");
      sceptileMoves[2] = Move.moveList("—");
      sceptileMoves[3] = Move.moveList("—");
      int[] sceptileStats = new int[6];
      sceptileStats[0] = 177;
      sceptileStats[1] = 150;
      sceptileStats[2] = 128;
      sceptileStats[3] = 172;
      sceptileStats[4] = 150;
      sceptileStats[5] = 189;
      
      sceptile = new Pokemon("Sceptile", sceptileMoves, sceptileStats, GRASS, NULL, new ImageIcon(Pokemon.class.getResource("Sceptilefront.gif")).getImage(),
                             new ImageIcon(Pokemon.class.getResource("Sceptileback.gif")).getImage(), false);
      return sceptile;
    }
    else if(pokName.equals("Blastoise"))
    {
      Pokemon blastoise;
      Move[] blastoiseMoves = new Move[4];
      int[] blastoiseStats = new int[6];
      blastoiseStats[0] = 186;
      blastoiseStats[1] = 148;
      blastoiseStats[2] = 167;
      blastoiseStats[3] = 150;
      blastoiseStats[4] = 172;
      blastoiseStats[5] = 143;
      
      blastoise = new Pokemon("Blastoise", blastoiseMoves, blastoiseStats, WATER, NULL, new ImageIcon(Pokemon.class.getResource("Blastoisefront.gif")).getImage(),
                              new ImageIcon(Pokemon.class.getResource("Blastoiseback.gif")).getImage(), false);
      return blastoise;
    }
    else if(pokName.equals("Snorlax"))
    {
      Pokemon snorlax;
      Move[] snorlaxMoves = new Move[4];
      int[] snorlaxStats = new int[6];
      snorlaxStats[0] = 267;
      snorlaxStats[1] = 178;
      snorlaxStats[2] = 128;
      snorlaxStats[3] = 128;
      snorlaxStats[4] = 178;
      snorlaxStats[5] = 90;
      
      snorlax = new Pokemon("Snorlax", snorlaxMoves, snorlaxStats, NORMAL, NULL, new ImageIcon(Pokemon.class.getResource("Snorlaxfront.gif")).getImage(), 
                            new ImageIcon(Pokemon.class.getResource("Snorlaxback.gif")).getImage(), false);
      return snorlax;
    }
    else if(pokName.equals("Rapidash"))
    {
      Pokemon rapidash;
      Move[] rapidashMoves = new Move[4];
      int[] rapidashStats = new int[6];
      rapidashStats[0] = 172;
      rapidashStats[1] = 167;
      rapidashStats[2] = 134;
      rapidashStats[3] = 145;
      rapidashStats[4] = 145;
      rapidashStats[5] = 172;
      
      rapidash = new Pokemon("Rapidash", rapidashMoves, rapidashStats, FIRE, NULL, new ImageIcon(Pokemon.class.getResource("Rapidashfront.gif")).getImage(),
                             new ImageIcon(Pokemon.class.getResource("Rapidashback.gif")).getImage(), false);
      return rapidash;
    }
    else if(pokName.equals("Meganium"))
    {
      Pokemon meganium;
      Move[] meganiumMoves = new Move[4];
      int[] meganiumStats = new int[6];
      meganiumStats[0] = 187;
      meganiumStats[1] = 147;
      meganiumStats[2] = 167;
      meganiumStats[3] = 148;
      meganiumStats[4] = 167;
      meganiumStats[5] = 145;
      
      meganium = new Pokemon("Meganium", meganiumMoves, meganiumStats, GRASS, NULL, new ImageIcon(Pokemon.class.getResource("Meganiumfront.gif")).getImage(),
                             new ImageIcon(Pokemon.class.getResource("Meganiumback.gif")).getImage(), false);
      return meganium;
    }
    else if(pokName.equals("Espeon"))
    {
      Pokemon espeon;
      Move[] espeonMoves = new Move[4];
      int[] espeonStats = new int[6];
      espeonStats[0] = 172;
      espeonStats[1] = 128;
      espeonStats[2] = 123;
      espeonStats[3] = 200;
      espeonStats[4] = 161;
      espeonStats[5] = 178;
      
      espeon = new Pokemon("Espeon", espeonMoves, espeonStats, PSYCHIC, NULL, new ImageIcon(Pokemon.class.getResource("Espeonfront.gif")).getImage(),
                           new ImageIcon(Pokemon.class.getResource("Espeonback.gif")).getImage(), false);
      return espeon;
    }
    else if(pokName.equals("Magikarp"))
    {
      Pokemon magikarp;
      Move[] magikarpMoves = new Move[4];
      magikarpMoves[0] = Move.moveList("Splash");
      magikarpMoves[1] = Move.moveList("Tackle");
      magikarpMoves[2] = Move.moveList("—");
      magikarpMoves[3] = Move.moveList("—");
      int[] magikarpStats = new int[6];
      magikarpStats[0] = 244;
      magikarpStats[1] = 130;
      magikarpStats[2] = 229;
      magikarpStats[3] = 141;
      magikarpStats[4] = 152;
      magikarpStats[5] = 284;
      
      magikarp = new Pokemon("Magikarp", magikarpMoves, magikarpStats, WATER, NULL, new ImageIcon(Pokemon.class.getResource("Magikarpfront.gif")).getImage(),
                             new ImageIcon(Pokemon.class.getResource("Magikarpback.gif")).getImage(), false);
      return magikarp;
    }
    else if(pokName.equals("Gyrados"))
    {
      Pokemon gyrados;
      Move[] gyradosMoves = new Move[4];
      gyradosMoves[0] = Move.moveList("HydroPump");
      gyradosMoves[1] = Move.moveList("—");
      gyradosMoves[2] = Move.moveList("—");
      gyradosMoves[3] = Move.moveList("—");
      int[] gyradosStats = new int[6];
      gyradosStats[0] = 202;
      gyradosStats[1] = 194;
      gyradosStats[2] = 144;
      gyradosStats[3] = 123;
      gyradosStats[4] = 167;
      gyradosStats[5] = 146;
      
      gyrados = new Pokemon("Gyrados", gyradosMoves, gyradosStats, WATER, NULL, new ImageIcon(Pokemon.class.getResource("Gyradosfront.gif")).getImage(),
                            new ImageIcon(Pokemon.class.getResource("Gyradosback.gif")).getImage(), false);
      return gyrados;
                       
    }
    else
    {
      throw new RuntimeException("Invalid Pokemon Name: "+ pokName + "!");

    }
  }
    
}