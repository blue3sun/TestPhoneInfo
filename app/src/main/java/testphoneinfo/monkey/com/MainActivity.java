package testphoneinfo.monkey.com;

import android.graphics.Point;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.DisplayMetrics;
import android.view.Display;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView mTvPhoneInfo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        getScreenInfo();
    }

    private void getScreenInfo() {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        Display display = getWindowManager().getDefaultDisplay();

        display.getMetrics(displayMetrics);
        int widthPixels = displayMetrics.widthPixels;
        int heightPixels = displayMetrics.heightPixels;
        float scaledDensity = displayMetrics.scaledDensity;
        float density = displayMetrics.density;
        mTvPhoneInfo.setText("widthPixels:"+widthPixels+"\n"
                +"heightPixels:"+heightPixels+"\n"
                +"density:"+density+"\n"
                +"scaledDensity:"+scaledDensity);

        Point point =new Point();
        display.getSize(point);
        int x = point.x;
        int y = point.y;

        mTvPhoneInfo.append("\n\npoint.x:"+point.x+"\n"
                            +"point.y:"+point.y);
    }

    private void initView() {
        mTvPhoneInfo = (TextView)findViewById(R.id.tv_phone_info);
    }


}
