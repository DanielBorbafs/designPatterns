public class SaleBanner extends Banner {
    public SaleBanner() {
        this.setLayout("Horizontal");
        this.setColor("Vermelho");
        this.setMessage("Super descontos");
    }

    @Override
    void display() {
        System.out.println("Modelo do Banner de Vendas " + getLayout() + ", color: " + getColor() + ", message: " + getMessage());
    }
}
