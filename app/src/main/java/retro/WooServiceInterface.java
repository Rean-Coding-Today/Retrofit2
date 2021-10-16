package retro;

import com.javacambodia.retrofit2.wc.BasicProductVO;
import com.javacambodia.retrofit2.wp.BasicPostVO;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface WooServiceInterface {

    @GET("v2/posts")
    public Call<List<BasicPostVO>> getProducts();
}
