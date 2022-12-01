package inheritance.superClass;
// class persegi
//class itu untuk publik dn tanpa modifiier ,protected dan private tdk bisa
// class biasanya public 
public class Persegi { //->parent
    //atribut . dsini sebutkan atribut apa ja yg ada di obj nya dan buat methodnya yg adds diclassnya agar bisa di instance di mainAppnya
    //buat tempat menampung data di dlm  class nya
    private int sisi;

    //constructor = untuk ng set data tanpa setter
    //persegi()=constructor tanpa parameter
    //persegi(int sisi)=contructor dengan parameter mengisi tanpa setter langsung dr constructornya
    //jika ingin membuat contructor degn parameter harus disertain constructor tanpa parameternya/defaultnya agar bisa membuat dgn parameter atau tanpa parameter
    //jika ingin membuat contructor dgn parameternya tanpa menyertkan contructor defaultnya kita bisa membuat obj dgnparamtetr tapi tdk bsa dgn yg tanpa parameter/kosongan.
    // overload contohnya constructor ada dgn parameter atau tanpa parameter
    public Persegi(int sisi){
        this.sisi = sisi; //this disini untuk mempresentasikan hanya untuk class yang ada di sisni/persegi 
    }
    public Persegi(){
    }

    //method = fungsi = fungtion
    public void setSisi(int sisi){
        this.sisi = sisi;
    }
    public int getSisi(){
        return this.sisi;
    }

    public int getKeliling(){
        return 4* this.sisi;
    }

    // Overload method : 2 method / constructor dalam fille yg sama demhgam syarat parameternya dibedakan
    // get Luas dr atributnya
    public int getLuas(){
        return this.sisi*this.sisi;
    }
    // get Luas dr atributnya
    public int getLuas(int sisi){
        return sisi * sisi;
    }
    // Override . dibuat untuk class childnya dan parentnnya 
    public void getTitle(){
        System.out.println("=== PERSEGI ===");
    }
}
