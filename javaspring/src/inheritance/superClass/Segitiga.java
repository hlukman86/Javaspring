package inheritance.superClass;

public class Segitiga {  // segitiga sama sisi jadi sisinya hanya 1
    //  Atribut
    private int sisi;
    private int tinggi;

    // Constructor
    public Segitiga(){
    }
    public Segitiga(int sisi, int tinggi){
        this.sisi = sisi;
        this.tinggi = tinggi;
    }

     //  Method Getter
    public int getSisi() {
        return sisi;
    }
    public int getTinggi() {
        return tinggi;
    }
    public int getKeliling(){
        return this.sisi + this.sisi + this.sisi;
    }
    public int getLuas(){
        return this.sisi * this.tinggi / 2;
    }

    public void getTittle(){
        System.out.println("=== SEGITIGA ===");
    }

   
    
}
