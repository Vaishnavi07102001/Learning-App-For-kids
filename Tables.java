package com.learnn;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class Tables extends AppCompatActivity {

    EditText editText;
    Button button;
    TextView result;
    int ans = 0;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tables);
        editText = (EditText) findViewById(R.id.editText);
        button = (Button) findViewById(R.id.button14);
        result = (TextView) findViewById(R.id.result);

        //set clickListener on button14
        //button.setOnClickListener(this);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            //On click function
            public void onClick(View v) {
                switch (v.getId()) {

                    case R.id.button14:
                        StringBuffer buffer = new StringBuffer();
                        int res;

                        // get the input number from editText
                        String fs = editText.getText().toString();

                        // convert it to integer
                        int n = Integer.parseInt(fs);

                        // build the logic for table
                        for (int i = 1; i <= 10; i++) {
                            ans = (i * n);
                            buffer.append(n + " X " + i
                                    + " = " + ans + "\n\n");
                        }

                        // set the buffer textview
                        result.setText(buffer);
                        break;
                }
            }

        });
    }
}





