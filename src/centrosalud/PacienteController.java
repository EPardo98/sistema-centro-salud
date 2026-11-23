/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package centrosalud;

import java.util.ArrayList;

public class PacienteController {

    // Coleccion para almacenar los pacientes
    private ArrayList<Paciente> pacientes;

    // Contador para generar codigos
    private int siguienteCodigo;

    // Constructor
    public PacienteController() {
        pacientes = new ArrayList<>();
        siguienteCodigo = 1;
    }

    // Registrar paciente
    public Paciente registrarPaciente(String dni, String nombres,
            String apellidos, int edad, String direccion) {

        // Validar campos obligatorios
        if (dni == null || dni.trim().isEmpty()
                || nombres == null || nombres.trim().isEmpty()
                || apellidos == null || apellidos.trim().isEmpty()
                || direccion == null || direccion.trim().isEmpty()) {

            throw new IllegalArgumentException(
                    "Todos los campos son obligatorios."
            );
        }

        dni = dni.trim();

        // Validar formato del DNI
        if (!dni.matches("\\d{8}")) {
            throw new IllegalArgumentException(
                    "El DNI debe contener 8 digitos."
            );
        }

        // Validar edad
        if (edad < 0) {
            throw new IllegalArgumentException(
                    "La edad no puede ser negativa."
            );
        }

        // Evitar DNI duplicados
        if (buscarPorDni(dni) != null) {
            throw new IllegalArgumentException(
                    "El DNI ya se encuentra registrado."
            );
        }

        // Generar codigo automaticamente
        String codigo = String.format("PAC-%03d", siguienteCodigo);

        // Crear objeto Paciente
        Paciente nuevoPaciente = new Paciente(
                codigo,
                dni,
                nombres.trim(),
                apellidos.trim(),
                edad,
                direccion.trim()
        );

        // Almacenar el paciente
        pacientes.add(nuevoPaciente);

        siguienteCodigo++;

        return nuevoPaciente;
    }

    // Buscar paciente por DNI
    public Paciente buscarPorDni(String dni) {

        if (dni == null) {
            return null;
        }

        for (Paciente paciente : pacientes) {

            if (paciente.getDni().equals(dni.trim())) {
                return paciente;
            }
        }

        return null;
    }

    // Obtener todos los pacientes
    public ArrayList<Paciente> obtenerPacientes() {
        return new ArrayList<>(pacientes);
    }
}

