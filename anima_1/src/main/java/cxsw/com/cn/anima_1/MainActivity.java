package cxsw.com.cn.anima_1;

import android.graphics.drawable.AnimationDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void startFrame(View view) {

        ImageView imageView = (ImageView) this.findViewById(R.id.image);

        AnimationDrawable animationDrawable = (AnimationDrawable) imageView.getBackground();

        animationDrawable.start();
    }

    public void start(View view) {
        ImageView imageView = (ImageView) this.findViewById(R.id.image1);
        Animation animation = AnimationUtils.loadAnimation(this, R.anim.animdemo);
        imageView.startAnimation(animation);
    }
}
