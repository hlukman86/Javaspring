package inheritance.subClass;

import inheritance.superClass.Persegi;

//key word untuk bisa mewarisi suatu parent classs kpd cild classnya = tambahkan kata kunci extends di ikuti class parentnya. setelah menambahkan extends bisa mengunakan atribut yang ada dikelas parentnya
public class Kubus extends Persegi { //ini tipe class
    //method untuk mengitung volume
    //haus menyertakan super untuk mengambil dr parentnya
    //super merupakan obj yg mewakili kclass dr parentnya
    //super untuk mengambil artibut dr parentnya
    //super representasi dari class yg ada diparentnya
    //super.getSisi memakai get krn bersipat private dr parentnya
    public int getVolume(){
        return super.getSisi() * super.getSisi() * super.getSisi();
    }
    // di java aakn mencari getPersegi jika ada di classnya sendiri/kubus maka ini yg akan di ambil jika tdk ada maka akan mencari getPersegi di parentya.(mencari dr chilnya lebih dulu klo tdk ada mka mencari ke parentnya)
    // ini disebut Override Method dr Parent yg dibuat di class childnya 

    public void getTitle(){
        System.out.println("==== KUBUS ===");
    }
}
