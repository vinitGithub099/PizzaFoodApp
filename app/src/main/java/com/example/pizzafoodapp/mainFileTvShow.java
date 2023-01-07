package com.example.pizzafoodapp;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
public class mainFileTvShow  extends AppCompatActivity {

    RecyclerView recyclerView;
    TvShowAdapter tvShowAdapter;
   static ArrayList<TvShow> tvShows;

    public static final String[] TvShows= {"Breaking Bad","Rick and Morty", "FRIENDS","Sherlock","Stranger Things"};
    public static final int[] TvShowImgs = {R.drawable.food1,R.drawable.food2,R.drawable.food3,R.drawable.food1,R.drawable.food3};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_recycle);
//        tvShows = new ArrayList<>();
        for(int i=0;i<TvShows.length;i++)
        {
            TvShow tvShow = new TvShow();

            tvShow.setTvshow(TvShows[i]);
            tvShow.setImgTvshow(TvShowImgs[i]);

            tvShows.add(tvShow);
        }


        tvShowAdapter = new TvShowAdapter(tvShows);

        recyclerView = (RecyclerView)findViewById(R.id.TvShows);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(tvShowAdapter);
    }
}
