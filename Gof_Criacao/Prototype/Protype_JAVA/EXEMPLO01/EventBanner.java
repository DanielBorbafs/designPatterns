public class EventBanner extends Banner {
    public EventBanner() {
        this.setLayout("Vertical");
        this.setColor("Azul");
        this.setMessage("Participe do nosso evento");
    }

    @Override
    void display() {
        System.out.println("Modelo do Banner de Eventos " + getLayout() + ", color: " + getColor() + ", message: " + getMessage());
    }
}
