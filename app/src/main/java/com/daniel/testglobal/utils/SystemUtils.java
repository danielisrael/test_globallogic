package com.daniel.testglobal.utils;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import android.util.Log;

public class SystemUtils {

    public static void replaceFragment(FragmentActivity activity,
                                       final int container,
                                       final String fragmentName,
                                       final boolean addToBackStack,
                                       final Bundle b,
                                       Fragment currentFragment) {

        FragmentManager fragmentManager = activity.getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        if (b != null)
            currentFragment.setArguments(b);

        //if the fragment is already there
        if (fragmentManager.findFragmentByTag(fragmentName) != null) {
            Log.e("SystemUtils", fragmentName + " fragment is already there");
            //fragmentTransaction.remove(fragmentManager.findFragmentByTag(fragmentName));
            fragmentTransaction.replace(container, currentFragment, fragmentName);
        } else {
            Log.e("SystemUtils", fragmentName + " new fragment");
            fragmentTransaction.add(container, currentFragment, fragmentName);
        }

        if (addToBackStack)
            fragmentTransaction.addToBackStack(null);

        fragmentTransaction.commitAllowingStateLoss();
    }

}
