public class PrototypePatternDemo {
    public static void main(String[] args) {
        BannerManager bannerManager = new BannerManager();

        Banner clonedSaleBanner = bannerManager.getBanner("Sale");
        clonedSaleBanner.setMessage("Super Oferta 50% de desconto!");
        clonedSaleBanner.display();

        Banner clonedEventBanner = bannerManager.getBanner("Event");
        clonedEventBanner.setMessage("Nao perca o proximo evento");
        clonedEventBanner.display();
    }
}
