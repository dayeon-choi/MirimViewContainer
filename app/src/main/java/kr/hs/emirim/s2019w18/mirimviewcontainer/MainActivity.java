package kr.hs.emirim.s2019w18.mirimviewcontainer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ViewFlipper;

public class MainActivity extends AppCompatActivity {
    ViewFlipper flipper;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flipper_auto);
        flipper=findViewById(R.id.flipper);
        Button btnPrev=findViewById(R.id.btn_start);
        Button btnNext=findViewById(R.id.btn_stop);
        btnPrev.setOnClickListener(btnListener);
        btnNext.setOnClickListener(btnListener);
        flipper.setOnTouchListener(touchListener);
    }

    float downX,upX;
    View.OnTouchListener touchListener = new View.OnTouchListener(){
        @Override
        public boolean onTouch(View view, MotionEvent e) {
            if(e.getAction()==MotionEvent.ACTION_DOWN){//오른쪽에서 왼쪽으로 터치
                downX=e.getX();

            }else if(e.getAction()==MotionEvent.ACTION_UP){//눌르고 떼기
                upX=e.getX();

                if(downX>upX){
                    flipper.showNext();
                }else if(downX<upX){
                    flipper.showPrevious();
                }
            }


            return false;
        }
    };

    View.OnClickListener btnListener=new View.OnClickListener(){
        @Override
        public void onClick(View view) {
            switch(view.getId()){
                case R.id.btn_start:
                    flipper.setFlipInterval(1000);
                    flipper.startFlipping();
//                    flipper.showPrevious();
                    break;
                case R.id.btn_stop:
                    flipper.stopFlipping();
//                    flipper.showNext();
                    break;
            }
        }
    };
}