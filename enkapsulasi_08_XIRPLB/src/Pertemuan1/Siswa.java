/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pertemuan1;

/**
 *
 * @author Atila Davin
 */
public class Siswa {
    
    private String nama;
    private int nilai = 0;
    private String kelas;
    
    public String getnama (){
        return nama;
    }
    public void setNama (String nama){
        this.nama =nama;
    }
    public int getnilai (){
        return nilai;
    }
    public void setnilai (int nilai){
        this.nilai = nilai;
    }
    public String getKelas (){
        return kelas;
    }
    public void setKelas (String kelas){
        this.kelas =kelas;
    }
    public void getALL (){
        System.out.println("Nama  : " + nama);
        System.out.println("Nilai  : " + nilai);
        System.out.println("Kelas  : " + kelas);

    }
}
