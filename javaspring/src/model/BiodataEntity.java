package model;

public class BiodataEntity {
    private String fullname ;
    private String nik;

    // 2 method setter dan getter diatributnya
    //this = mempresentasikan method yg ada dikelas ini
    // method setter
    public void setFullName(String namaLengkap){
        this.fullname = namaLengkap;
    }
    public void setNik(String nik){
        this.nik = nik;
    }
    // method getter untuk memanggil valuenya/nilai
    public String getFullName(){
        return this.fullname;
    }
    public String getNik(){
        return this.nik;
    }
   
}
