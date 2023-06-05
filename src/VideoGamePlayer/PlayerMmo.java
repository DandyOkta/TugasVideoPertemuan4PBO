/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VideoGamePlayer;

/**
 *
 * @author acer
 */
public class PlayerMmo extends Player {
    int experience;
    
    void setExperience(int expe){
        experience=getExp()+expe;
    }

    int getexperience(){
        return experience;
    }
        
    //Override
    @Override
    void setMengalahkan(int slime) {
        super.setMengalahkan(slime); 
        Exp=2*getExp();
    }
    
    @Override
    int getExp(){
        return Exp;
    }
}
