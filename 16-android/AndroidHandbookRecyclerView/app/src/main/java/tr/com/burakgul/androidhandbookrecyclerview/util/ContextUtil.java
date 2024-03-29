package tr.com.burakgul.androidhandbookrecyclerview.util;

import android.content.Context;
import android.content.Intent;

import androidx.viewbinding.ViewBinding;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class ContextUtil {
    public static Context getContextFromBinding(ViewBinding viewBinding){
        return viewBinding.getRoot().getContext();
    }

    public static void  startActivityFromBinding(ViewBinding binding, Intent intent){
        getContextFromBinding(binding).startActivity(intent);
    }
}
