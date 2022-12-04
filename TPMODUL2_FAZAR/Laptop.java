
public class Laptop extends Perangkat{
    protected boolean webcam;

    public Laptop(String drive, int ram, float processor, boolean webcam){
        super(drive, ram, processor);
        this.webcam = webcam;

    }

    @Override
    public void inform(){
        if (this.webcam == true){
            System.out.printf("Laptop ini memiliki drive tipe %s dengan ram sebesar %d GB dan processor secepat %.2f Ghz. Selain itu laptop ini juga memiliki webcam %n", drive, ram, processor);
        } else {
            System.out.printf("Laptop ini memiliki drive tipe %s dengan ram sebesar %d GB dan processor secepat %.2f Ghz. Selain itu laptop ini juga tidak memiliki webcam %n", drive, ram, processor);
        }
    }
    public void bukaGame(String nama_game){
        System.out.printf("Laptop berhasil membuka game %s %n", nama_game);
    }
    public void kirimemail(String email){
        System.out.printf("Laptop berhasil mengirim email ke %s %n", email);
    }
    public void kirimemail(String email1, String email2){
        System.out.printf("Laptop berhasil mengirim Email ke %s dan ke %s %n", email1, email2);    
    }
}