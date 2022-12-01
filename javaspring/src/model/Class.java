package model;

public class Class {
    public static void main(String[] args) {
        BiodataEntity biodataEntity = new BiodataEntity();
        biodataEntity.setFullName("ini budi");
        biodataEntity.setNik("12345");

        // cetak data 
        System.out.println(biodataEntity.getFullName());
        System.out.println(biodataEntity.getNik());
      
    }
}
