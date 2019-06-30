package fragment;

import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.tablayoutexample.R;

public class ThirdFragment extends Fragment {

    @Override
    //protected void onCreate(Bundle savedInstanceState) {
     public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third_fragment);
    }

    private void setContentView(int activity_third_fragment) {
    }

    public View OnCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        return inflater.inflate(R.layout.activity_third_fragment,container,false);
    }
}
