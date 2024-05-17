
import java.util.HashMap;
import java.util.Map;

public class BannerManager {
    private Map<String, Banner> bannerMap = new HashMap<>();

    public BannerManager() {
        loadBanners();
    }

    private void loadBanners() {
        SaleBanner saleBanner = new SaleBanner();
        EventBanner eventBanner = new EventBanner();

        bannerMap.put("Sale", saleBanner);
        bannerMap.put("Event", eventBanner);
    }

    public Banner getBanner(String type) {
        Banner cachedBanner = bannerMap.get(type);
        return (Banner) cachedBanner.clone();
    }
}
