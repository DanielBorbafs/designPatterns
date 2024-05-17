class ConsultaOnlineFactory implements ConsultaFactory {
    @Override
    public Paciente criarPaciente() {
        return new PacienteOnline();
    }

    @Override
    public Medico criarMedico() {
        return new MedicoOnline();
    }

    @Override
    public RecursoMedico criarRecursoMedico() {
        return new SalaVirtual();
    }
}
