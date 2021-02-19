/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reloj;
import javax.swing.ImageIcon;
/**
 *
 * @author 
 *         Johan Leon-160003717
 */

public class Nodo {
    private String img;
    private String Nombre;
    private int numero;
    private Nodo sgte;

    public void Nodo() {
        this.numero = 0;
        this.sgte = null;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }
    

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Nodo getSgte() {
        return sgte;
    }

    public void setSgte(Nodo sgte) {
        this.sgte = sgte;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

   
    
    
}
