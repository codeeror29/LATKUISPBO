/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.kuispbo;

/**
 *
 * @author ASUS
 */
public class InvalidNominal extends Exception {
    
    // 1. Constructor tanpa parameter
    public InvalidNominal() {
        super();
    }

    // 2. Constructor dengan parameter String message
    public InvalidNominal(String message) {
        super(message);
    }

    // 3. Constructor dengan parameter Throwable cause
    public InvalidNominal(Throwable cause) {
        super(cause);
    }
}