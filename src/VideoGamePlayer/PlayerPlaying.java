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
public class PlayerPlaying {
    public static void main(String[] args) {
        
        //parameter Dikosongkan
        PlayerMmo playerone = new PlayerMmo();
        
        System.out.println("Player 1");
        playerone.setNama("Misbah");
        playerone.setJob("Healer");
        playerone.setLevel(11);
        playerone.setExp(500);
        System.out.println("Nama  :"+playerone.getNama());
        System.out.println("Job   :"+playerone.getJob());
        System.out.println("Level :"+playerone.getLevel());
        
        //set nilai mutator class Player
        playerone.setMengalahkan(30);
        
        //Set nilai mutator class PlayerMmo
        playerone.setExperience(10);
        
        //Memanggil hasil return dari accesor
        System.out.println("exp yang didapatkan : "+playerone.getExp());
        System.out.println("exp bonus : "+playerone.getexperience());
        playerone.info("");
        System.out.println("=================================");
        
        //Parameter Dikosongkan
        PlayerMmo playertwo = new PlayerMmo();
        
        System.out.println("Player 2");
        playertwo.setNama("Mamanklek");
        playertwo.setJob("Tanker");
        playertwo.setLevel(19);
        playertwo.setExp(902);
        System.out.println("Nama  :"+playertwo.getNama());
        System.out.println("Job   :"+playertwo.getJob());
        System.out.println("Level :"+playertwo.getLevel());
        
        //set nilai mutator class Player
        playertwo.setMengalahkan(30);
        
        //Set nilai mutator class PlayerMmo
        playertwo.setExperience(10);
        
        //Memanggil hasil return dari accesor
        System.out.println("exp yang didapatkan : "+playertwo.getExp());
        
        //Memanggil nilai mutator
        System.out.println("exp bonus : "+playertwo.getexperience());
        playertwo.info("");
    }
}
