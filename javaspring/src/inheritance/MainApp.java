//hanya untuk main method/menjalankan aplikasi saja
package inheritance;

public class MainApp {
   public static void main(String[] args) {
    // Instance object
    // Class obj = new Class()/constracter dr classnya/ data yg mau di instance obj nya
    //dari parentnya terlebh dulu
    //contrructor adalah jika ada data yang mau di set/ diinstance obj nya bisa langsung set datanya di contructor tanpa membuat setter
    Persegi persegi = new Persegi();
    persegi.getTitle(); //Override
    persegi.setSisi(8);
    System.out.println("Sisi Persegi: " + persegi.getSisi());
    System.out.println("Keliling Persegi: " + persegi.getKeliling());
    System.out.println("Luas Persegi: " + persegi.getLuas()); //Overload
    System.out.println("Luas Persegi: " + persegi.getLuas(10)); //Overload

    System.out.println();

    //instance dari kubus
    //akan memiliki method yg sama degn persegi. ini yg dsebut dgn inheritance/pewarisan meskipun kubus belum memiliki atributbdan method krn udah meng extedns dr persegi(parentnya)maka secara otomatis bisa langsung mendapatkan/mengakses method yang ada di persegi(parent classnya)
    Kubus kubus =new Kubus();
    kubus.getTitle(); // Override
    kubus.setSisi(5);
    System.out.println("Sisi Persegi: " + kubus.getSisi() );
    System.out.println("Keliling Persegi: " + kubus.getKeliling());
    System.out.println("Luas Persegi: " + kubus.getLuas()); //Overload
    System.out.println("Volume Kubus: " + kubus.getVolume()); //Overload
   } 
}
