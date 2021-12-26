package As4.lkj.gf;



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author harno
 */

    public class FoodAdapter extends Weapon {
    private Food item ;
    public FoodAdapter(Food f){
         
        this.item=f;
        
    }
    public String getDescription(){
       return item.getDescription();
    }
    public int damage(){
        if(item instanceof Pizza){
            Pizza f = (Pizza) item;
       
         return f.energy()-1;}
        else if(item instanceof Ham){
            Ham f = (Ham) item;
       
        return f.energy()-1;}
        else if(item instanceof Bread){
            Bread f = (Bread) item;
        
         return f.energy()-1;}
        
         return 0;
    }
    public int durability(){
        return 0;
    }
}

