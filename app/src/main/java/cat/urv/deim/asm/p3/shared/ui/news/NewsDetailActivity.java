package cat.urv.deim.asm.p3.shared.ui.news;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import cat.urv.deim.asm.p2.common.R;

public class NewsDetailActivity extends ViewModel {
    // TODO: Implement the ViewModel
    private MutableLiveData<String> mText;

    public NewsDetailActivity(){
        mText = new MutableLiveData<>();
        mText.setValue(("This is a new fragment"));
    }
    public LiveData<String> getText(){return mText;}
}
