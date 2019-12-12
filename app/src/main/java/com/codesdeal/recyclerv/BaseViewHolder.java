package com.codesdeal.recyclerv;

import android.content.Intent;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class BaseViewHolder extends RecyclerView.ViewHolder
{
    TextView nameText;

    public BaseViewHolder(@NonNull View itemView)
    {
        super(itemView);

        findView();

    }

    private void findView()
    {
        nameText = (TextView)itemView.findViewById(R.id.ctID);

    }
}
