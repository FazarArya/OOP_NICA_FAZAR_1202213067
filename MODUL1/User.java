package MODUL1;

import java.util.Scanner;

public class User {

    System.out.println("Selamat Datang di Restoran EAD");
    System.out.println("Silahkan Register Terlebih Dahulu");
    System.out.println("=====================================");

    String Name;
    Int NoHP;

    public void setName(String Name) {
        this.Name = Name;
    }
    public void setNoHP(Int NoHP) {
        this.NoHP = NoHP;
    }

    public void register();
    System.out.println("Registrasi Berhasil Dilakukan");
    System.out.print("Nama : " + Name);
    System.out.print("No Handphone : "+ NoHP);
    
    

    // TODO Create Attribute of User; Name and Phone Number then Create Setter

    // TODO Create Method to Register User and Display User's Name and Phone Number and success message


}
