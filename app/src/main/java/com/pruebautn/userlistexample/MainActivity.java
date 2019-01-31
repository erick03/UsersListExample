package com.pruebautn.userlistexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.pruebautn.userlistexample.entities.User;
import com.pruebautn.userlistexample.webservice.RestClient;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onResume() {
        super.onResume();
        downloadInformation();
    }

    private void downloadInformation() {
        RestClient.getsInstance().getService().getUsersGithub().enqueue(getUserCallback());
    }

    private Callback<List<User>> getUserCallback(){
        return  new Callback<List<User>>() {
            @Override
            public void onResponse(Call<List<User>> call, Response<List<User>> response) {
                Log.v("AA", "Working");
            }

            @Override
            public void onFailure(Call<List<User>> call, Throwable t) {
                Log.v("AA", "Error");
            }
        };
    }

    private void fillAdapter() {

    }

}
