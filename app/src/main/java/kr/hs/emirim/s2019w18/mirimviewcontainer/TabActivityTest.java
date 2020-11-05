package kr.hs.emirim.s2019w18.mirimviewcontainer;

import android.app.TabActivity;
import android.os.Bundle;
import android.widget.TabHost;

public class TabActivityTest extends android.app.TabActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tab);
        TabHost tabHost=getTabHost();

        TabHost.TabSpec tabSpecOne=tabHost.newTabSpec("ONE").setIndicator("하나");
        tabSpecOne.setContent(R.id.linear_one);
        tabHost.addTab(tabSpecOne);

        TabHost.TabSpec tabSpecTwo=tabHost.newTabSpec("TWO").setIndicator("둘");
        tabSpecTwo.setContent(R.id.linear_two);
        tabHost.addTab(tabSpecTwo);

        TabHost.TabSpec tabSpecThree=tabHost.newTabSpec("THREE").setIndicator("셋");
        tabSpecThree.setContent(R.id.linear_three);
        tabHost.addTab(tabSpecThree);

        tabHost.setCurrentTab(0);
    }
}
