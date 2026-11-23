/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author elias
 */
public class Paciente {
    private String Nombredelpaciente;
    private String Apellidodelpaciente;
    private int DNIdelpaciente;
    private int Telefonodelpaciente;
    private int Fechadenacimiento;

    public Paciente(String Nombredelpaciente, String Apellidodelpaciennte, int DNIdelpaciente, int Telefonodelpaciente, int Fechadenacimiento) {
        this.Nombredelpaciente = Nombredelpaciente;
        this.Apellidodelpaciente = Apellidodelpaciennte;
        this.DNIdelpaciente = DNIdelpaciente;
        this.Telefonodelpaciente = Telefonodelpaciente;
        this.Fechadenacimiento = Fechadenacimiento;
    }

    public String getNombredelpaciente() {
        return Nombredelpaciente;
    }

    public void setNombredelpaciente(String Nombredelpaciente) {
        this.Nombredelpaciente = Nombredelpaciente;
    }

    public String getApellidodelpaciennte() {
        return Apellidodelpaciente;
    }

    public void setApellidodelpaciennte(String Apellidodelpaciennte) {
        this.Apellidodelpaciente = Apellidodelpaciennte;
    }

    public int getDNIdelpaciente() {
        return DNIdelpaciente;
    }

    public void setDNIdelpaciente(int DNIdelpaciente) {
        this.DNIdelpaciente = DNIdelpaciente;
    }

    public int getTelefonodelpaciente() {
        return Telefonodelpaciente;
    }

    public void setTelefonodelpaciente(int Telefonodelpaciente) {
        this.Telefonodelpaciente = Telefonodelpaciente;
    }

    public int getFechadenacimiento() {
        return Fechadenacimiento;
    }

    public void setFechadenacimiento(int Fechadenacimiento) {
        this.Fechadenacimiento = Fechadenacimiento;
    }

    
    public void mostrardatos(){
        
        System.out.println("=======DATOS DEL PACIENTE=======");
        System.out.println("Nombre del paciente: " + Nombredelpaciente);
        System.out.println("Apellido de paciente: " + Apellidodelpaciente);
        System.out.println("DNI del paciente; " + DNIdelpaciente);
        System.out.println("Fecha de nacimiento: " + Fechadenacimiento);
        System.out.println("Telefono del paiente: " + Telefonodelpaciente);
        
    }
}
