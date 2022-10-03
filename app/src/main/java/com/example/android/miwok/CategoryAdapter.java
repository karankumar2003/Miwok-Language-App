package com.example.android.miwok;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class CategoryAdapter extends FragmentStateAdapter{

    public String[] tabTitles = {"Numbers","Family Members","Colors","Phrases"};


    public CategoryAdapter(FragmentManager fm,Lifecycle lifecycle){
        super(fm,lifecycle);
    }

    public CategoryAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    public CategoryAdapter(@NonNull Fragment fragment) {
        super(fragment);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        if(position == 0){
            return new NumbersFragment();
        }else if (position == 1){
            return new FamilyFragment();
        }else if (position == 2){
            return new ColorsFragment();
        }else{
            return new PhrasesFragment();
        }
    }

    @Override
    public int getItemCount() {
        return 4;
    }

    public CharSequence getPageTitle(int position){
        return tabTitles[position];
    }
}
