package kingja.superindicator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.kingja.superindicator.SuperIndicator;

import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        SuperIndicator superIndicator = (SuperIndicator) findViewById(R.id.superIndicator);
        superIndicator.setTabs(Arrays.asList("快速充电", "连续充电", "涓流充电", "完成充电"));
        superIndicator.setProgress(2);
    }
}
