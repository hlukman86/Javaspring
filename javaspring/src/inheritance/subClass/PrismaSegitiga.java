package inheritance.subClass;
import inheritance.superClass.Segitiga;
public class PrismaSegitiga extends Segitiga{
    //  tribut 
    private int tinggiPrisma;

    //  super selain bisa ngambil atribut dr super classnya dan juga bisa berperan sebagi constructornya
    //  Constructor (ingat.. selalu buat 2 constructor yang berparameter dan tidak berparameter)
    public PrismaSegitiga(int sisi, int tinggiAlas, int tinggiPrisma){
        super(sisi, tinggiAlas); // milik segitiga yg diambil dr parentnya/siperclassnya
        this.tinggiPrisma = tinggiPrisma ; // milik prisma sendiri/sub classnya/ chilnya
    }
    public PrismaSegitiga(){
    }
    // tidk memakai gettere krn udah ngeset di awal tinggi prismanya
    //  Method
    public int getVolume(){
        // luas nya = luas alas * tinggi prisma
        return super.getLuas()* this.tinggiPrisma;
    }
    @Override
    public void getTittle() {
        // TODO Auto-generated method stub
        System.out.println("=== PRISMA SEGITIGA ===");
    }
    public int getTinggiPrisma() {
        return tinggiPrisma;
    }

    


}
