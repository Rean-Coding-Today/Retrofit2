package com.javacambodia.retrofit2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import com.javacambodia.retrofit2.adapter.PostsAdapter;
import com.javacambodia.retrofit2.wp.BasicPostVO;

import java.util.List;

import retro.ApiUtil;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    private final String TAG = MainActivity.class.getSimpleName();

    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = (RecyclerView) findViewById(R.id.recycler_id);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setHasFixedSize(true);



        ApiUtil.getServiceClass().getAllPost().enqueue(new Callback<List<BasicPostVO>>() {
            @Override
            public void onResponse(Call<List<BasicPostVO>> call, Response<List<BasicPostVO>> response) {
                if(response.isSuccessful()){
                    List<BasicPostVO> postList = response.body();
                    Log.d(TAG, "Returned count " + postList.size());
                    PostsAdapter adapter = new PostsAdapter(getApplicationContext(), postList);
                    recyclerView.setAdapter(adapter);
                }
            }

            @Override
            public void onFailure(Call<List<BasicPostVO>> call, Throwable t) {
                //showErrorMessage();
                Log.d(TAG, "error loading from API");
            }
        });
    }
}
