public class SistemaConsultaMedica {
    public static void main(String[] args) {
        ConsultaFactory factoryPresencial = new ConsultaPresencialFactory();
        Paciente pacientePresencial = factoryPresencial.criarPaciente();
        Medico medicoPresencial = factoryPresencial.criarMedico();
        RecursoMedico recursoPresencial = factoryPresencial.criarRecursoMedico();

        pacientePresencial.registrar();
        medicoPresencial.atender();
        recursoPresencial.reservar();

        System.out.println();

        ConsultaFactory factoryOnline = new ConsultaOnlineFactory();
        Paciente pacienteOnline = factoryOnline.criarPaciente();
        Medico medicoOnline = factoryOnline.criarMedico();
        RecursoMedico recursoOnline = factoryOnline.criarRecursoMedico();

        pacienteOnline.registrar();
        medicoOnline.atender();
        recursoOnline.reservar();
    }
}
