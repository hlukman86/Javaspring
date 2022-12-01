// package Catatan;

// public class Catatan {
    
// }

//  Persegi sbagi parentnya
// MainApp untuk menjalankan aplikasinya/javanya . cara pemanggilannya dr obj.methodnya
// Extends untuk mewarisi dr parentnya biasnya ada di childnya
// sout primtln = memakai enter
// sout print = tdk  pake enter/tanpa ngasih new line nya/langsung sejajar
//  java dibaca baris berbaris jadi tes logiknya mudah dibaca



// inherintace = pewarisan
// Polymorphisme = banyak bentuk  =akan ada methon dgn nama yg sama dn constructor lebih dari satu
// jeisnya terbagi jadi dua overload dan override
// Overload = ada di dalam class yg sama, memungkinkan membuat method dg nama yg sama didlm satu class tapi dgn syarat memiliki parameter yang berbeda.
// Override = method yg sama tapi ada di dlm dua class yg berbeda. kasusnya paling bnyak sering terjadi di inheritance, bisa mengambil method yg sama dr class parentnya

                /* perbedann memakai NextInt dan NextLine
                System.out.print("Input sisi segitiga: ");
                    // int sisiSegitiga = Integer.valueOf(in.nextLine());
                    int sisiSegitiga = in.nextInt();
                    in.nextLine();
                    System.out.println("input sisi segitiga: ");
                    String test = in.nextLine(); */

// bisa mengamnbil method dr parentnya atau method di override dr classnya atau super classnya
// getter untyk membantu membyat atribut di main nya
// static punya nya kelas kalo non static punya nya object dan harus buatkan obj nya terlebih dlu
// static pemanggilan dr methodnya
// non static ranahnya atau lingkupnya punya nya si obj. jd klo mau mengambil method yg non static harus dibuatkan obj nya terlebih dulu.
// static ranah/tingkatannya siklas megaksesnya dr nama classnya
/*contoh static
    jika di superclassnya public static int getLuas(int sisi){
    return sisi * sisi;
    dan untuk pemangilan dimainnya : 
    System.out println("Luas Persegi: " + Persegi.getLuas(langsung memanggil method dr kelasnya)(sisi:100));
} */
//  kesimpulan = jika method hanya 1 bisa memakai static saja tapi jika method lebih dari satu lebih baik memakai objek(non static).
// jika ingi membuat kondisi do while atau lainnya maka scanner yg berada di bawah main method dipindahkan ke atas tepatnya dibawab mainApp  nya. agar bbisa dibaca globall
//  ""(petik 2) untuk string, '' (petik 1) untuk integer

//                                              T   U   G   A   S 
// Abstraction pada Java adalah Proses untuk menyembunyikan detail implementasi dan hanya sisi fungsionalitas (gambaran umum) saja yang ditampilkan. Abstraction di java terbagi menjadi dua yaitu class abstract dan interface. Berikut penjelasan dari masing-masingnya :

                                        /*  A. Class Abstract

                                        - Class yang masih bersifat umum/general (perlu didefinisikan ulang)
                                        - Menggunakan keyword abstract di classnya
                                        - Method di dalam classnya boleh abstract ataupun tidak
                                        - Hanya class dan method yang boleh abstract, variable tidak boleh
                                        - Method yang tipenya abstract wajib didefinisikan ulang oleh class anaknya (override)
                                        - Tidak dapat di buat object secara */

//  bagaimana penulisan untuk membuatu method pada java: 
                                        /*  public void setSisi(int sisi){
                                                this.sisi = sisi;
                                            }
                                            public int getSisi(){
                                                return this.sisi;*/

//  bagaimana perintah untuk memangggil method pada java:
                                            /*Persegi persegi = new Persegi();
                                            System.out.println("Sisi Persegi: " + persegi.getSisi());*/


//  apa yang kamu ketahui dengan konsep oop?
                                                /*Object-Oriented Programming atau OOP adalah suatu metode programming yang berorientasi pada objek */

//  Atribbut pada objek sering disebut juga dengan?
                                                /* Attribute merupakan karakteristik dari suatu class. Attribut ini berupa suatu variable yang terletak tepat di dalam class. sedangka atribut pd objek adalah atribut yg menempel pada objek ,Atribut data dapat didefinisikan sebagai karakteristik atau sifat yang melekat dari sebuah objek data. Misalnya objek mahasiswa memiliki atribut seperti nama, nomor induk mahasiswa, tanggal lahir, alamat, hobi, dll.*/
// Apa perbedaan objeck dengan class?
                                                /* class merupakan sebuah blueprint/konsep tentang bagaimana sebuah object tersebut nanti jadinya. Dan object sendiri adalah bentuk concrete/instance dari class dan bisa lebih dari satu dan dengan property yang bisa berbeda-beda.
                                                CLASS adalah semacam kerangka / struktur / konsep / prototype, sedangkan Object adalah Variasi Modelnya*/
