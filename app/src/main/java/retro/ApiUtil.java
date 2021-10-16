package retro;

public class ApiUtil {

    private static final String BASE_URL = "https://ask.osify.com/wp-json/wp/";

    private static final String WOO_URL = "https://lom-or.com/wp-json/wc/";

    public static PostServiceInterface getPostService(){
        return RetrofitAPI.getRetrofit(BASE_URL).create(PostServiceInterface.class);
    }

    public static WooServiceInterface getWooService() {
        return RetrofitAPI.getRetrofit(WOO_URL).create(WooServiceInterface.class);
    }
}
