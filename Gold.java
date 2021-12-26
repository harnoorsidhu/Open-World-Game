package As4.lkj.gf;




/**
 * Write a description of class Gold here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Gold extends WeaponDecorator
{  
   public Gold(Weapon weapon) {
        this.weapon = weapon;
    }
     public String getDescription() {
        return "Gold "+weapon.getDescription() ;
    }

    public int damage() {
        return 1 + weapon.damage();
    }
     public int durability() {
        return 2 + weapon.durability();
    }
}