package As4.lkj.gf;




/**
 * Write a description of class Weapon here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public abstract class Weapon implements Item
{
   protected String description="unknown weapons"; 
   public String getDescription(){
       return description;
    }
    public abstract int damage();
    public abstract int durability();
}
