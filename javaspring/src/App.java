import model.BiodataEntity;

public class App {
    private String firstName = "lukman";
    String lastName ="hakim";
    public static void main(String[] args) {
       //iNnstance objek
       //Class namaObj = new Class();
         App app = new App();
         System.out.println(app.firstName);
         // Instance objek
         BiodataEntity biodataEntity = new BiodataEntity();
         biodataEntity.setFullName(app.firstName + "" + app.lastName);
         System.out.println(biodataEntity.getFullName());
    }
    //1. method yg mengembalikan data -> tipe data dan return
    //2. method void -> tidak mengembalikan data





}
