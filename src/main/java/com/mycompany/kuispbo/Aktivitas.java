/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.kuispbo;

/**
 *
 * @author ASUS
 */
public interface Aktivitas {
    void tarikTunai(int nominal) throws InvalidNominal;
    void setorTunai(int nominal) throws InvalidNominal;
}