package com.example.divyamjoshi.gameofthrone;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Dell on 10-09-2017.
 */

public class HouseAdapter extends RecyclerView.Adapter<HouseAdapter.ViewHolder> {
    private static final String LOG_TAG = HouseAdapter.class.getSimpleName();
    private ArrayList<House> android;
    public Context context;

    public HouseAdapter(Context getcontext,ArrayList<House> android) {
        this.android = android;
        this.context = getcontext;
    }
    @Override
    public HouseAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.house_list, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(HouseAdapter.ViewHolder holder, int position) {
       // holder.house_image.set(android.get(position).getimage());
        holder.housename.setText(android.get(position).getName());

    }
    @Override
    public int getItemCount() {
        return android.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        private TextView housename;
      //  private  ImageView  house_image;
        public ViewHolder(View view) {
            super(view);

            //house_image = (ImageView)view.findViewById(R.id.house_image);
            housename = (TextView)view.findViewById(R.id.house_name);


        }
    }
}
