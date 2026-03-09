package com.mycompany.kuispbo; 

public class Main {
    public static void main(String[] args) {
        try {
            // === 1. AKTIVITAS REKENING TABUNGAN ===
            System.out.println("=== AKTIVITAS REKENING TABUNGAN ===");
            RekeningTabungan tabungan = new RekeningTabungan();
            tabungan.tampilkanPemilik("Andi");
            
            // Set saldo awal 500.000
            tabungan.setSaldo(500000); 
            
            // Setor 200.000 (Saldo jadi 700.000)
            tabungan.setorTunai(200000);
            
            // Tarik 150.000 (Saldo jadi 550.000)
            tabungan.tarikTunai(150000);
            
            System.out.println(); // Memberikan jarak baris (enter)

            // === 2. AKTIVITAS REKENING PINJAMAN ===
            System.out.println("=== AKTIVITAS REKENING PINJAMAN ===");
            RekeningPinjaman pinjaman = new RekeningPinjaman();
            pinjaman.tampilkanPemilik("Budi");
            
            // Set saldo awal 1.000.000
            pinjaman.setSaldo(1000000); 
            
            // Setor 500.000 (Saldo jadi 1.500.000)
            pinjaman.setorTunai(500000);
            
            // Tarik 2.000.000 (INI AKAN GAGAL KARENA SALDO HANYA 1.500.000)
            // Di sinilah program akan "dilempar" (throw) ke catch di bawah
            pinjaman.tarikTunai(2000000); 

        } catch (InvalidNominal e) {
            // Menangkap dan mencetak pesan error dari class InvalidNominal
            System.out.println("PESAN ERROR: " + e.getMessage());
        }
    }
}