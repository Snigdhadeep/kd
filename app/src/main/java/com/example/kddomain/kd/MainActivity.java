package com.example.kddomain.kd;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView textView;
    EditText editText;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.test_image);
      /* textView=(TextView)findViewById(R.id.tv_ppp);
       editText=(EditText)findViewById(R.id.et_ooo);
       button=(Button)findViewById(R.id.bt_save);
       button.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Toast.makeText(MainActivity.this, "save new entry", Toast.LENGTH_SHORT).show();
           }
       });
*/

       }
}
