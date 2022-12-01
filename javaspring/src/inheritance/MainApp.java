//hanya untuk main method/menjalankan aplikasi saja
package inheritance;

import java.util.Scanner;

import inheritance.subClass.Kubus;
import inheritance.subClass.PrismaSegitiga;
import inheritance.superClass.Persegi;
import inheritance.superClass.Segitiga;

public class MainApp {
    //  Instance object scanner
    static Scanner in = new Scanner(System.in); //memakai scnner disini dan ditambah static krn agar bisa dibaca global, stsic krn main methodnya static juga jadi harus sama. dan bisa memangil nama obj dr scannernya
    // membuat variabel untuk dipakai di switchcese
    static String pilihMenu, pilihSubMenu, state;

    public void menuApp(){
      System.out.println("=== PROGRAM HITUNG BANGUN RUANG DAN DATAR ===");  
      System.out.println("1. Bangun Datar");
      System.out.println("2. Bangun Ruang");
      System.out.println("Tuliskan Pilihan Anda: ");
      pilihMenu = in.nextLine();
      System.out.println();
    }

    public void SubMenuBangunDatar(){
        System.out.println("=== BANGUN DATAR ===");
        System.out.println("1. Persegi");
        System.out.println("2. Segitiga");
        System.out.println("Tuliskan Pilihan Anda: ");
        pilihSubMenu = in.nextLine();
        System.out.println();
    }

    public void SubMenuBangunRuang(){
        System.out.println("=== BANGUN RUANG ===");
        System.out.println("1. Kubus ");
        System.out.println("2. Prisma Segitiga");
        System.out.println("Tuliskan Pilihan Anda: ");
        pilihSubMenu = in.nextLine();
        System.out.println();
    }

   public static void main(String[] args) {
    // Instance obj main
    MainApp main = new MainApp();
    Persegi persegi = new Persegi(); // instance obj nya pindah kesini
    Segitiga segitiga = new Segitiga();
    Kubus kubus =new Kubus();
    PrismaSegitiga ps = new PrismaSegitiga();





    do {
        main.menuApp();
        // tambahkan switch di dlam switch untuk menampilkan menu dilama menu
        switch (pilihMenu) { // key di isi dr inputan menuApp, dg membuat variabel
            case "1":
                main.SubMenuBangunDatar();

                switch (pilihSubMenu) {
                    case "1":
                        // Instance object
                        // Class obj = new Class()/constracter dr classnya/ data yg mau di instance obj nya
                        //dari parentnya terlebh dulu
                        //contrructor adalah jika ada data yang mau di set/ diinstance obj nya bisa langsung set datanya di contructor tanpa membuat setter
                    persegi.getTitle(); //Override
                    System.out.print("Input sisi persegi: ");
                    int sisi = Integer.valueOf(in.nextLine());
                    persegi.setSisi(sisi);
                    System.out.println("Sisi Persegi: " + persegi.getSisi());
                    System.out.println("Keliling Persegi: " + persegi.getKeliling());
                    System.out.println("Luas Persegi: " + persegi.getLuas()); //Overload
                    // System.out.println("Luas Persegi: " + persegi.getLuas(10)); //Overload . dikasih komen krn sudah ada scanner yg bisa memasuki nilai dr terminal
                        break;
                    case"2":
                    // krn tdk memakai setter maka di konstrak ulang 
                    segitiga.getTittle();

                    // Input data/variabel
                    System.out.print("Input sisi segitiga: ");
                    int sisiSegitiga = Integer.valueOf(in.nextLine());
                    System.out.print("Input tinggi segitiga: "); 
                    int tinggiSegitiga = Integer.valueOf(in.nextLine());

                    // Set atribut
                    segitiga = new Segitiga(sisiSegitiga, tinggiSegitiga);
                    System.out.println("sisi segitiga: " + segitiga.getSisi());
                    System.out.println("tinggi segitiga: " + segitiga.getTinggi());
                    System.out.println("keliling segitiga: " + segitiga.getKeliling());
                    System.out.println("luas segitiga: " + segitiga.getLuas());
                    break;
                   
                    default:
                    System.out.println("Pilihan tidak tersedia!");
                        break;
                }
                break; // break fungsinya kalo stiap cese nya selesai mka akan keluar/out, tdk masuk/lanjut ke cese selanjutnya.

            case "2":
                main.SubMenuBangunRuang();

                switch (pilihSubMenu) {
                    case "1":
                        //instance dari kubus
                        //akan memiliki method yg sama degn persegi. ini yg dsebut dgn inheritance/pewarisan meskipun kubus belum memiliki atributbdan method krn udah meng extedns dr persegi(parentnya)maka secara otomatis bisa langsung mendapatkan/mengakses method yang ada di persegi(parent classnya)
                        kubus.getTitle(); // Override
                        System.out.print("Input sisi kubus: ");
                        int sisi = Integer.valueOf(in.nextLine());
                        kubus.setSisi(sisi);
                        System.out.println("Sisi Persegi: " + kubus.getSisi() );
                        System.out.println("Keliling Persegi: " + kubus.getKeliling());
                        System.out.println("Luas Persegi: " + kubus.getLuas()); //Overload
                        System.out.println("Volume Kubus: " + kubus.getVolume()); //Overload
                        break;
                    case "2" :
                    ps.getTittle();
                
                    //  Input data . 
                    // tdk usah pakai int krn atribut yg sama dgn segitiga atau pewarisan/ sudah ada. pakai int jika blom ada.
                    System.out.print("Input sisi segitiga: ");
                    int sisiSegitiga = Integer.valueOf(in.nextLine());
                    System.out.print("Input tinggi segitiga: "); 
                    int tinggiSegitiga = Integer.valueOf(in.nextLine());
                    System.out.print("Input tinggi prisma: "); 
                    int tinggiPrisma = Integer.valueOf(in.nextLine());
                
                    //  Set atribut
                    ps = new PrismaSegitiga(sisiSegitiga, tinggiSegitiga, tinggiPrisma);
                    System.out.println("sisi segitiga: " + ps.getSisi());
                    System.out.println("tinggi segitiga: " + ps.getTinggi());
                    System.out.println("tinggi prisma segitiga: " + ps.getTinggiPrisma());
                    System.out.println("keliling segitiga: " + ps.getKeliling());
                    System.out.println("luas segitiga: " + ps.getLuas());
                    System.out.println("Volume prisma segitiga: " + ps.getVolume());
                    break;
                    default:
                        System.out.println("Pilihan tidak tersedia!");
                        break;
                }
                break;    
        
            default:
                System.out.println("Pilihan tidak tersedia!");
                break;
        }
        System.out.println("Ingin melanjutkan aplikasi ? (y/n): ");
        state = in.nextLine();
    } while (state.equalsIgnoreCase("y")); // untuk men stop while
    System.out.println("\n === TERIMA KASIH === \n"); // \n untuk enter
    // Instance object scanner. 
    // scannr =librarynya dr java agar bisa meng-inputkan di dlm terminal kita 
    // Scanner in = new Scanner(System.in); = pindah ke atas di bawah mainAppnya agar bisa dibaca global
// in.close();
   } 
}
