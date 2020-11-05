package kr.hs.emirim.s2019w18.mirimviewcontainer;

import android.app.TabActivity;
import android.os.Bundle;
import android.widget.TabHost;

public class TabActivityTest2 extends TabActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tab_test2);
        TabHost tabHost=getTabHost();

        TabHost.TabSpec tabSpecOne=tabHost.newTabSpec("ONE").setIndicator("하나");
        tabSpecOne.setContent(R.id.linear_one2);
        tabHost.addTab(tabSpecOne);

        TabHost.TabSpec tabSpecTwo=tabHost.newTabSpec("TWO").setIndicator("둘");
        tabSpecTwo.setContent(R.id.linear_two2);
        tabHost.addTab(tabSpecTwo);

        TabHost.TabSpec tabSpecThree=tabHost.newTabSpec("THREE").setIndicator("셋");
        tabSpecThree.setContent(R.id.linear_three2);
        tabHost.addTab(tabSpecThree);

        TabHost.TabSpec tabSpecFour=tabHost.newTabSpec("FOUR").setIndicator("넷");
        tabSpecFour.setContent(R.id.linear_four2);
        tabHost.addTab(tabSpecFour);


        tabHost.setCurrentTab(0);
    }
}
