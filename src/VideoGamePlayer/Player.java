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
public class Player {
    //Enkapsulasi 
    private String Nama, Job;
    
    //Diganti menjadi protected karena digunakan dalam class PlayerMmo
    protected Integer Level, Exp;
    
    //Konstruktor dihapus

    
    //Mutator
    void setMengalahkan(int slime) {
        Exp = Exp + slime;
    }
    
    void setNama(String namaPlayer) {
        this.Nama = namaPlayer;
    }

    public void setJob(String Job) {
        this.Job = Job;
    }

    public void setLevel(Integer Level) {
        this.Level = Level;
    }

    public void setExp(Integer Exp) {
        this.Exp = Exp;
    }
    
    
    
    //Accesor
    int getExp(){
        return Exp;
    }
    
    public String getNama(){
        return Nama;
    }
    
    public String getJob(){
        return Job;
    }
    
    public Integer getLevel(){
        return Level;
    }
    
    //Overloading
    void info(String Job){
        System.out.println("Kamu Mendapatkan 1 Skill poin");
    }
    
    void info(int Job){
        System.out.println("Kamu Mendapatkan 1 Skill poin");
    }
}
