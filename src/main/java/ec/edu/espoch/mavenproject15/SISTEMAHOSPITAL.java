package ec.edu.espoch.mavenproject15;

import java.util.List;

public class SISTEMAHOSPITAL {
    public List<PACIENTE> pacientes;
    public List<MEDICO> medicos;
    public List<CITA> citas;
    public List<LABORATORIO> examenes;
    
        public PACIENTE obtenerPaciente(int idPaciente) {

        for (PACIENTE paciente : pacientes) {
            if (paciente != null && paciente.idpaciente == idPaciente) {
                return paciente;
            }
        }
        return null;
    }

    public MEDICO obtenerMedico(int idMedico) {

        for (MEDICO medico : medicos) {
            if (medico != null && medico.idmedico == idMedico) {
                return medico;
            }
        }
        return null;
    }

    public void registrarTransaccion(String transaccion) {
    }
}
