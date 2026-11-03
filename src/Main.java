/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author mikim
 */
public class Main {
    public static void main(String[] args) {
       HondaCivic civic = new HondaCivic();

        civic.setMarca("Honda");
        civic.setModelo("Civic");
        civic.setAnio(2024);
        civic.setColor("Negro");

        System.out.println("Marca: " + civic.getMarca());
        System.out.println("Modelo: " + civic.getModelo());
        System.out.println("Año: " + civic.getAnio());
        System.out.println("Color: " + civic.getColor());

        civic.encender();
        civic.acelerar(); // Método sobrescrito
        civic.frenar();   // Método sobrescrito
        civic.apagar();
    }
    
}
