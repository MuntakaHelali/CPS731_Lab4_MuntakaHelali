package com.example.carrecyclerapp;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class Adapter extends RecyclerView.Adapter<CarViewHolder>{

    private Context cContext;
    private List<CarData> carList;

    public Adapter(Context cContext, List<CarData> carList) {
        this.cContext = cContext;
        this.carList = carList;
    }

    @NonNull
    @Override
    public CarViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View carView = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.recycler_item,viewGroup,false);
        return new CarViewHolder(carView);
    }

    @Override
    public void onBindViewHolder(@NonNull final CarViewHolder carViewHolder, int i) {
        carViewHolder.carTitle.setText(carList.get(i).getCarName());
        carViewHolder.carDescription.setText(carList.get(i).getCarDescription());
        carViewHolder.imageView.setImageResource(carList.get(i).getCarImage());
        carViewHolder.carInformation.setText(carList.get(i).getCarInformation());

        carViewHolder.carCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(cContext, CarInformation.class);
                intent.putExtra("Image",carList.get(carViewHolder.getAdapterPosition()).getCarImage());
                intent.putExtra("Information",carList.get(carViewHolder.getAdapterPosition()).getCarInformation());
                cContext.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return carList.size();
    }
}

class CarViewHolder extends RecyclerView.ViewHolder {

    ImageView imageView;
    TextView carTitle, carDescription, carInformation;
    CardView carCardView;

    public CarViewHolder(View itemView) {
        super(itemView);

        imageView = itemView.findViewById(R.id.imageViewImage);
        carTitle = itemView.findViewById(R.id.textViewTitle);
        carDescription = itemView.findViewById(R.id.textViewDescription);
        carInformation = itemView.findViewById(R.id.tvInformation);
        carCardView = itemView.findViewById(R.id.CardView);
    }
}