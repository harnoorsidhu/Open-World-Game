package As4.lkj.gf;





/**
 * Write a description of class Achivement here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.*;
public class Achievements implements Observer
{
    private ArrayList<Item> item;
   private Character Char;
   private boolean health=true;
   private boolean magic=true;
    private boolean pizza=true;
    private boolean hamWeapon=true;
   public Achievements(Character Char) {
        this.Char = Char;
        item = new ArrayList<Item>();
        Char.registerObserver(this);
    }
    public void update() {
        if(Char.getItem()!=null){
          boolean ans=check();
          item.add(Char.getItem());
        
        if(ans){}
        else{ 
        display();}
        }
        else{}
        if(Char.getHealth()==10){
            display();
        }
    
}
    public boolean check(){
        
         boolean repeat = false;
        for( int i =0; i<item.size();i++){
            
            if(item.get(i).getDescription().equals(Char.getItem().getDescription())){
             repeat=true;
             
            }
        }
        return repeat;
    }
    public void display() {
        
        if(Char.getItem() instanceof Magic&&magic==true){
            magic=false;
        System.out.println("** Achievement unlocked:  Abracadabra! **");}
          else if(Char.getItem().getDescription().equals("Pizza")&&pizza==true){
              pizza=false;
        System.out.println("** Achievement unlocked:  'Za bomb! ***");}
     
          if(Char.getHealth()==10&&health==true){
               health =false;System.out.println("** Achievement unlocked:  Hearty! ***");
          }
          if(Char.getHam() instanceof Weapon&&hamWeapon==true){
              System.out.println("Hammer Time");
              hamWeapon=false;
            }
    }
    
}
