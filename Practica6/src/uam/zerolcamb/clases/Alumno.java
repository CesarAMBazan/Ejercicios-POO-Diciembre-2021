package uam.zerolcamb.clases;

import java.io.Serializable;

/**
 *
 * @author Zerol
 */

/* Clase Alumno: La clase tiene que ser Serializable para poder escribir en el archivo */
public class Alumno implements Serializable{
    /* Atributos de la clase */
    private int idAlumno;
    private String nombre;
    private String licenciatura;

    /*¨Encapsulamiento */
    public int getIdAlumno() {
        return idAlumno;
    }

    public void setIdAlumno(int idAlumno) {
        this.idAlumno = idAlumno;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLicenciatura() {
        return licenciatura;
    }

    public void setLicenciatura(String licenciatura) {
        this.licenciatura = licenciatura;
    }
    
    /* toString */
    @Override
    public String toString() {
        return "Alumno{" + "idAlumno=" + idAlumno + ", nombre=" + nombre + ", licenciatura=" + licenciatura + '}';
    }
    
    
}
