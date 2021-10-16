package retro;


import com.javacambodia.retrofit2.wp.BasicPostVO;
import com.javacambodia.retrofit2.wp.Post;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface PostServiceInterface {

    @GET("v2/posts")
    public Call<List<BasicPostVO>> getAllPost();

    @GET("v2/posts/{id}")
    public Call<Post> getPost(@Path("id") int postId);
}
