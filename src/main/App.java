package main;
import detailPelajar.Mahasiswa;
import java.util.ArrayList;
import java.util.Scanner;

public class App{
    public static void main(String[] args){
        int students, age;
        String nim, name, gender, study;
        Scanner myObj = new Scanner(System.in);
        ArrayList<Mahasiswa> details = new ArrayList<Mahasiswa>();
        System.out.print("Jumlah Mahasiswa: ");
        students = myObj.nextInt();
        for(int i = 0; i < students; i++){
            System.out.println("Data mahasiswa ke-" + (i+1));
            System.out.print("NIM: ");
            nim = myObj.next();
            System.out.print("Nama: ");
            name = myObj.next();
            System.out.print("Jenis Kelamin: ");
            gender = myObj.next();
            System.out.print("Jurusan: ");
            study = myObj.next();
            System.out.print("Umur: ");
            age = myObj.nextInt();
            details.add(new Mahasiswa(nim, name, gender, study, age));
        }
        for (Mahasiswa detail : details) {
            System.out.println(detail.getNim() +" " + detail.getNama() + " " + detail.getKelamin() +" "+ detail.getJurusan() + " "+ detail.getUmur());
        }

//        info.printData();
//        info.setNim("087711");
//        info.setJurusan("Elektro");
//        info.setUmur(25);
//        info.printData();
    }
}