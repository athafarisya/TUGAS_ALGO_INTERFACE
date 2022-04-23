package Model;

import Interfaces.contohInterfaces;

public class Perhitungan implements contohInterfaces{
    private int a;
    private int b;
    private int hasil;

    public Perhitungan(int a, int b, int hasil){
        this.a = a;
        this.b = b;
        hasil = 0;
        this.hasil = 0;
        printJudulClass("print judul dalam class Perhitungan");
    }

    private void printJudulClass(String jdl){
        System.out.println(jdl);
    }

    @Override
    public void PrintJudul() {
        // TODO Auto-generated method stub
        System.out.println("Judul menggunakan Interface");
    }

    @Override
    public void HitungTambah() {
        // TODO Auto-generated method stub
        this.hasil = this.a + this.b;
    }

    @Override
    public void HitungKali() {
        // TODO Auto-generated method stub
        this.hasil = this.a * this.b;
        
    }

    public int hsltmbh(int i, int j) {
        return 0;
    }

    public int hslkli(int i, int j) {
        return 0;
    }
}