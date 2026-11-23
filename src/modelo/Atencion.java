/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author elias
 */
public class Atencion {
    private int id_atencion;
    private Cita cita;
    private String diagnóstico;
    private String observaciones;
    private String indicaciones;

    public Atencion(int id_atencion, Cita cita, String diagnóstico, String observaciones, String indicaciones) {
        this.id_atencion = id_atencion;
        this.cita = cita;
        this.diagnóstico = diagnóstico;
        this.observaciones = observaciones;
        this.indicaciones = indicaciones;
    }

    public int getId_atencion() {
        return id_atencion;
    }

    public void setId_atencion(int id_atencion) {
        this.id_atencion = id_atencion;
    }

    public Cita getCita() {
        return cita;
    }

    public void setCita(Cita cita) {
        this.cita = cita;
    }

    public String getDiagnóstico() {
        return diagnóstico;
    }

    public void setDiagnóstico(String diagnóstico) {
        this.diagnóstico = diagnóstico;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public String getIndicaciones() {
        return indicaciones;
    }

    public void setIndicaciones(String indicaciones) {
        this.indicaciones = indicaciones;
    }
}
