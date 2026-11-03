/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author mikim
 */
public class HondaCivic extends Automovil {

    // Constructor
    public HondaCivic() {
        super(); // Llama al constructor de AutoMovil
        System.out.println("Constructor de HondaCivic");
    }

    // Sobrescritura de métodos
    @Override
    public void acelerar() {
        System.out.println("El Honda Civic acelera de forma deportiva.");
    }

    @Override
    public void frenar() {
        System.out.println("El Honda Civic usa sistema ABS para frenar.");
    }
}
