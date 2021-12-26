package As4.lkj.gf;




/**
 * Write a description of class Food here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Food implements Item
{
   protected String description="Saag naal Roti"; 
   protected int energy =0;
   public String getDescription(){
       return description;
    }
    public int energy(){
       return energy;
    }
   
}
