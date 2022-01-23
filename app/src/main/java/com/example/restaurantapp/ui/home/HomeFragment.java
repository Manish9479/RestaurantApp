package com.example.restaurantapp.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.restaurantapp.R;
import com.example.restaurantapp.HomehorAdapter;
import com.example.restaurantapp.HomehorModel;

import java.util.ArrayList;
import java.util.List;


public class HomeFragment extends Fragment {

    RecyclerView homeHorizonatalRec;
    ArrayList<HomehorModel> homehorModelList;
    HomehorAdapter homehorAdapter;


    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.fragment_home,container,false);

        homehorModelList = new ArrayList<>();

        homehorModelList.add(new HomehorModel(R.drawable.pizza,"Pizza"));
        homehorModelList.add(new HomehorModel(R.drawable.hamburger,"HmaBurger"));
        homehorModelList.add(new HomehorModel(R.drawable.fried_potatoes,"Fries"));
        homehorModelList.add(new HomehorModel(R.drawable.ice_cream,"Ice Cream"));
        homehorModelList.add(new HomehorModel(R.drawable.sandwich,"Sandwich"));

        homehorAdapter= new HomehorAdapter(getActivity(),homehorModelList);
        homeHorizonatalRec.setAdapter(homehorAdapter);
        homeHorizonatalRec.setLayoutManager(new LinearLayoutManager(getActivity(),RecyclerView.HORIZONTAL,false));
       homeHorizonatalRec.setHasFixedSize(true);
       homeHorizonatalRec.setNestedScrollingEnabled(false);

        return  root;
    }

}