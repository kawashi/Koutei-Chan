package jp.ac.chiba_fjb.app.koutei_chan.Activity;

import android.content.Intent;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;

import jp.ac.chiba_fjb.app.koutei_chan.R;

public class TeitleActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teitle);
    }
    public  void onClick(View view){
        Intent intent =new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
