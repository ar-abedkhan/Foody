package com.abedkhan.foody.Fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.abedkhan.foody.Adapter.AllFoodAdapter;
import com.abedkhan.foody.Adapter.CetagoryAdapter;
import com.abedkhan.foody.Adapter.PopularFoodAdapter;
import com.abedkhan.foody.Model.AllFoodModel;
import com.abedkhan.foody.Model.CetegoryModel;
import com.abedkhan.foody.R;
import com.abedkhan.foody.databinding.FragmentHomeBinding;
import com.denzcoskun.imageslider.constants.ScaleTypes;
import com.denzcoskun.imageslider.models.SlideModel;

import java.util.ArrayList;
import java.util.List;

public class HomeFragment extends Fragment {

    public HomeFragment() {
        // Required empty public constructor
    }
FragmentHomeBinding binding;
List<CetegoryModel>cetegoryModelList;
List<AllFoodModel>allFoodModelList;
    ArrayList<SlideModel> imageList;





    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
      binding=FragmentHomeBinding.inflate(getLayoutInflater(),container,false);


      slider();

cetegoryModelList=new ArrayList<>();
allFoodModelList=new ArrayList<>();

cetegoryModelList.add(new CetegoryModel("Biriyani",R.drawable.biriyani));
cetegoryModelList.add(new CetegoryModel("Pizza",R.drawable.pizza));
cetegoryModelList.add(new CetegoryModel("Burger",R.drawable.burger));
cetegoryModelList.add(new CetegoryModel("Snack",R.drawable.snack));
cetegoryModelList.add(new CetegoryModel("Deesert",R.drawable.dessert));
cetegoryModelList.add(new CetegoryModel("Noodles",R.drawable.noodles));
cetegoryModelList.add(new CetegoryModel("Coffee",R.drawable.coffee));
cetegoryModelList.add(new CetegoryModel("Kebab",R.drawable.kebab));
cetegoryModelList.add(new CetegoryModel("Fish",R.drawable.fish));
cetegoryModelList.add(new CetegoryModel("Rice",R.drawable.rice));


        CetagoryAdapter cetagoryAdapter=new CetagoryAdapter(cetegoryModelList,getContext());
binding.cetagoryRecycler.setAdapter(cetagoryAdapter);



        allFoodModelList.add(new AllFoodModel("Rice","Red cili resturent","16.9",R.drawable.rice));
        allFoodModelList.add(new AllFoodModel("Biriyani","Afgan Resturent","19.9",R.drawable.biriyani));
        allFoodModelList.add(new AllFoodModel("Pizza","Hundi Resturent","$66.9",R.drawable.pizza));
        allFoodModelList.add(new AllFoodModel("Burger","7 Start Restura","86.9",R.drawable.burger));
        allFoodModelList.add(new AllFoodModel("Deesert","Sultan Dine","86.9",R.drawable.dessert));
        allFoodModelList.add(new AllFoodModel("Snaks","Red cili resturent","86.9",R.drawable.snack));

        AllFoodAdapter adapter=new AllFoodAdapter(allFoodModelList,getContext());
        binding.allfoodRecycler.setAdapter(adapter);




        allFoodModelList.add(new AllFoodModel("Rice","Red cili resturent","$16.9",R.drawable.rice));
        allFoodModelList.add(new AllFoodModel("Biriyani","Afgan Resturent","$19.9",R.drawable.biriyani));
        allFoodModelList.add(new AllFoodModel("Pizza","Hundi Resturent","$66.9",R.drawable.pizza));
        allFoodModelList.add(new AllFoodModel("Burger","7 Start Restura","$86.9",R.drawable.burger));
        allFoodModelList.add(new AllFoodModel("Deesert","Sultan Dine","$86.9",R.drawable.dessert));
        allFoodModelList.add(new AllFoodModel("Snaks","Red cili resturent","$86.9",R.drawable.snack));

        PopularFoodAdapter popularFoodAdapter=new PopularFoodAdapter(allFoodModelList,getContext());
        binding.popularRecycler.setAdapter(popularFoodAdapter);





        return binding.getRoot();
    }



    private void slider() {
        imageList = new ArrayList<>();
        imageList.add(new SlideModel(R.drawable.pizza,ScaleTypes.CENTER_CROP));
        imageList.add(new SlideModel(R.drawable.burger,ScaleTypes.CENTER_CROP));
        imageList.add(new SlideModel(R.drawable.noodles, ScaleTypes.CENTER_CROP));
        imageList.add(new SlideModel(R.drawable.snack, ScaleTypes.CENTER_CROP));
        imageList.add(new SlideModel(R.drawable.dessert,ScaleTypes.CENTER_CROP));
        imageList.add(new SlideModel(R.drawable.biriyani, ScaleTypes.CENTER_CROP));
        imageList.add(new SlideModel(R.drawable.coffee, ScaleTypes.CENTER_CROP));
        imageList.add(new SlideModel(R.drawable.fish, ScaleTypes.CENTER_CROP));
        imageList.add(new SlideModel(R.drawable.rice,ScaleTypes.CENTER_CROP));
        imageList.add(new SlideModel(R.drawable.kebab,ScaleTypes.CENTER_CROP));

        binding.imgSlider.setImageList(imageList);
    }
}