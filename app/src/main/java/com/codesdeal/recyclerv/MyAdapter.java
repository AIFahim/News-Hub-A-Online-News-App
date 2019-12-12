package com.codesdeal.recyclerv;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import static android.media.CamcorderProfile.get;

public class MyAdapter extends RecyclerView.Adapter<BaseViewHolder>
{
    ArrayList<String> cityNames;
    Context context;

    public MyAdapter(Context context, ArrayList<String> cityNames)
    {
        this.context=context;
        this.cityNames=cityNames;
    }

    @NonNull
    @Override
    public BaseViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType)
    {
        View view = LayoutInflater.from(context).inflate(R.layout.rowlayout, parent, false);
        BaseViewHolder baseViewHolder = new BaseViewHolder(view);

        return baseViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull BaseViewHolder holder, final int position)
    {
        holder.nameText.setText(cityNames.get(position));
        holder.itemView.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
//                if(cityNames.get(position) == "Prothom-Alo")
//                {
                    //Toast.makeText(context, ""+cityNames.get(position), Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(context, ProthomaloActivity.class);
                    intent.putExtra("name",cityNames.get(position));
                    context.startActivity(intent);
                //}
            }
        });

    }

    @Override
    public int getItemCount()
    {
        return cityNames.size();
    }
}
