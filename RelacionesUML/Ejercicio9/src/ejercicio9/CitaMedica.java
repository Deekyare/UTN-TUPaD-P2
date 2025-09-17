package ejercicio9;

/**
 *
 * @author Sil
 */
public class CitaMedica {
   private String fecha;
   private String hora;
   
   //Referencia a paciente y profesional - Asociación unidireccional
   private Profesional profesional;
   private Paciente paciente;
   
   //Constructor
    public CitaMedica(String fecha, String hora) {
        this.fecha = fecha;
        this.hora = hora;
    }
   //Setters y Getters

    public String getFecha() {
        return fecha;
    }

    public String getHora() {
        return hora;
    }


    public Profesional getProfesional() {
        return profesional;
    }

    public void setProfesional(Profesional profesional) {
        this.profesional = profesional;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

     @Override
    public String toString() {
        return "Cita Médica [Fecha=" + fecha + ", Hora=" + hora + "]";
    }
}
