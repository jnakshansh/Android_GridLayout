package main.jnakshansh.android_gridview;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setLogo(R.mipmap.ic_launcher);
        getSupportActionBar().setDisplayUseLogoEnabled(true);
        LinearLayout one = findViewById(R.id.button1);
        one.setOnClickListener(this);
        LinearLayout two = findViewById(R.id.button2);
        two.setOnClickListener(this);
        LinearLayout three = findViewById(R.id.button3);
        three.setOnClickListener(this);
        LinearLayout four = findViewById(R.id.button4);
        four.setOnClickListener(this);
        LinearLayout five = findViewById(R.id.button5);
        five.setOnClickListener(this);
        LinearLayout six = findViewById(R.id.button6);
        six.setOnClickListener(this);
        LinearLayout seven = findViewById(R.id.button7);
        seven.setOnClickListener(this);
        LinearLayout eight = findViewById(R.id.button8);
        eight.setOnClickListener(this);
    }


    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.button1:
                Intent intent = new Intent(MainActivity.this, next_activity.class);

                //intent.putExtra("title",nameofblogs.blogs[0].getTitle());
                startActivity(intent);
                break;
            case R.id.button2:
                Intent intent2 = new Intent(MainActivity.this, next_activity.class);

                startActivity(intent2);
                break;
            case R.id.button3:
                Intent intent3 = new Intent(MainActivity.this, next_activity.class);

                startActivity(intent3);
                break;
            case R.id.button4:
                Intent intent4 = new Intent(MainActivity.this, next_activity.class);

                startActivity(intent4);
                break;
            case R.id.button5:
                Intent intent5 = new Intent(MainActivity.this, next_activity.class);

                startActivity(intent5);
                break;
            case R.id.button6:
                Intent intent6 = new Intent(MainActivity.this, next_activity.class);

                startActivity(intent6);
                break;
            case R.id.button7:
                Intent intent7 = new Intent(MainActivity.this, next_activity.class);

                startActivity(intent7);
                break;
            case R.id.button8:
                Intent intent8 = new Intent(MainActivity.this, next_activity.class);

                startActivity(intent8);
                break;
            default:
                break;
        }
    }
}
