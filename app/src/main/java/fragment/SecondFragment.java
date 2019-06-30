package fragment;

import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.tablayoutexample.R;

public class SecondFragment extends Fragment {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_fragment);
    }

    private void setContentView(int activity_second_fragment) {
    }

    public View OnCreateView(LayoutInflater inflater , ViewGroup container, Bundle savedInstanceState){
        return inflater.inflate(R.layout.activity_second_fragment,container,false);
    }
}
