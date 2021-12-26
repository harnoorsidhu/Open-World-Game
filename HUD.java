package As4.lkj.gf;




/**
 * Write a description of class Hud here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class HUD implements Observer
{
   private Weapon weapon;
   private Character Char;
   
   public HUD(Character Char) {
        this.Char = Char;
        Char.registerObserver(this);
    }
    public void update() {
        
        weapon = Char.getSword();
        display();
    }
    public void display() {
        System.out.println("Sword "+"Damage "+weapon.damage()+" Durability "+weapon.durability()+" Health "+Char.getHealth());
        if(Char.getHam() instanceof Weapon){
         System.out.println("HAM "+"Damage "+Char.getHam().damage()+" Durability "+Char.getHam().durability());   
        }
    }
}
