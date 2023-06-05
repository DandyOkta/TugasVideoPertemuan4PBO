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
        
        //Menggunakan parameter
        Player playerone = new Player();
        
        System.out.println("Player 1");
        playerone.setNama("Misbah");
        playerone.setJob("Healer");
        playerone.setLevel(11);
        playerone.setExp(500);
        System.out.println("Nama  :"+playerone.getNama());
        System.out.println("Job   :"+playerone.getJob());
        System.out.println("Level :"+playerone.getLevel());
        
        //Memanggil nilai mutator
        playerone.setMengalahkan(30);
        
        //Memanggil hasil return dari accesor
        System.out.println("exp yang dibutuhkan untuk levelup : "+playerone.getExp());
        System.out.println("=================================");
        
        //Menggunakan parameter
        Player playertwo = new Player();
        
        System.out.println("Player 2");
        playertwo.setNama("Mamanklek");
        playertwo.setJob("Tanker");
        playertwo.setLevel(19);
        playertwo.setExp(902);
        System.out.println("Nama  :"+playertwo.getNama());
        System.out.println("Job   :"+playertwo.getJob());
        System.out.println("Level :"+playertwo.getLevel());
        
        //Memanggil nilai mutator
        playertwo.setMengalahkan(30);
        
        //Memanggil hasil return dari accesor
        System.out.println("exp yang dibutuhkan untuk levelup : "+playertwo.getExp());
    }
}
