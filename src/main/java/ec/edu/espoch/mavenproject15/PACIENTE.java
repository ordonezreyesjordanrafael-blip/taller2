
package ec.edu.espoch.mavenproject15;

public class PACIENTE {
        public int idpaciente;
    public String nombrepaciente;
    public int fechanacimiento;
    public String historialmedico;
    public String salud;
    public String alergia;
    public boolean seguroactivo;

    public void registrarse() {}

    public boolean alergias(String medicamento) {
        return alergia.contains(medicamento);}

    public void estado(String nuevoEstado) {}
}