class ConsultaPresencialFactory implements ConsultaFactory {
    @Override
    public Paciente criarPaciente() {
        return new PacientePresencial();
    }

    @Override
    public Medico criarMedico() {
        return new MedicoPresencial();
    }

    @Override
    public RecursoMedico criarRecursoMedico() {
        return new SalaExames();
    }
}
