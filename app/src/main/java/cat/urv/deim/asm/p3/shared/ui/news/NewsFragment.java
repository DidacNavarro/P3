package cat.urv.deim.asm.p3.shared.ui.news;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import cat.urv.deim.asm.p2.common.R;


public class NewsFragment extends Fragment {

    private NewsDetailActivity mViewModel;

    public static void newInstance() {
    }


    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.news_fragment, container, false);

    }




}
