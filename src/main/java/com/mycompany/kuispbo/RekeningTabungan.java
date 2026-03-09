/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.kuispbo;

/**
 *
 * @author ASUS
 */
public class RekeningTabungan extends Rekening implements Aktivitas {
    private int saldo;

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    @Override
    public void tampilkanPemilik(String nama) {
        this.namaPemilik = nama;
        System.out.println("Pemilik Rekening Tabungan: " + this.namaPemilik);
    }

    @Override
    public void tarikTunai(int nominal) throws InvalidNominal {
        if (nominal < 0) {
            throw new InvalidNominal("Gagal: Nominal penarikan bernilai minus!");
        }
        if (getSaldo() - nominal < 0) {
            throw new InvalidNominal("Gagal: Saldo tidak mencukupi untuk penarikan!");
        }

        System.out.println("Saldo awal \t\t: Rp " + getSaldo());
        System.out.println("Nominal penarikan \t: Rp " + nominal);
        setSaldo(getSaldo() - nominal);
        System.out.println("Saldo akhir \t\t: Rp " + getSaldo());
        System.out.println("----------------------------------------");
    }

    @Override
    public void setorTunai(int nominal) throws InvalidNominal {
        if (nominal < 0) {
            throw new InvalidNominal("Gagal: Nominal penyetoran bernilai minus!");
        }

        System.out.println("Saldo awal \t\t: Rp " + getSaldo());
        System.out.println("Nominal penyetoran \t: Rp " + nominal);
        setSaldo(getSaldo() + nominal);
        System.out.println("Saldo akhir \t\t: Rp " + getSaldo());
        System.out.println("----------------------------------------");
    }
}