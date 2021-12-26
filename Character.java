package As4.lkj.gf;




/**
 * Write a description of class Character here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.*;
public class Character
{
    private Weapon sword;
    private int health;
    private Item item;
    private Weapon HamWeapon;
    private ArrayList<Observer> observers;
    
    public Character(){
        observers = new ArrayList<Observer>();
        health=1;
        sword=null;
    }
    
    public void registerObserver(Observer o){
        observers.add(o);}
    
    public void removeObserver(Observer o ){
        int i = observers.indexOf(o);
        if(i>=0){
            observers.remove(i);
        }
    }
     public void notifyObservers() {
        for (int i = 0; i < observers.size(); i++) {
            Observer observer = (Observer)observers.get(i);
            observer.update();
        }
    }
    public void updateSword(Weapon s){
        
          
          sword=s;
          if(s instanceof WeaponDecorator){
          item= s;  }
          notifyObservers();
        }
         
    
    public Weapon getSword(){
        
    return sword;

        
 
    }
    public void eatFood(Food f){
        item=(Item) f;
        
        if(f instanceof Pizza){
            Pizza food = (Pizza) f;
        if(food.energy()+health<=10){
         health=food.energy()+health;}
        }
        else if(f instanceof Ham){
            Ham food = (Ham) f;
       
          if(food.energy()+health<=10){
         health=food.energy()+health;}}
        else if(f instanceof Bread){
            Bread food = (Bread) f;
        
          if(food.energy()+health<=10){
         health=food.energy()+health;}}
        
         notifyObservers();
         
        }
    public int getHealth(){
        return health;
    
    }
    public Item getItem(){
        return item;
    }
    public void  updateHamWeapon(Weapon ham){
        HamWeapon=ham;
        item=HamWeapon;
        notifyObservers();
    }
    public Weapon getHam(){
        return HamWeapon;
        
    }
     
}
