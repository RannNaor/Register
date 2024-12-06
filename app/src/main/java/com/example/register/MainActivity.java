package com.example.register;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.orproject.R;

public class MainActivity extends AppCompatActivity {

    TextView fName,password,email;

    EditText EfName,Epassword,Eemail;
    Button b1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        EfName=(EditText)findViewById(R.id.EfName);
        Epassword=(EditText)findViewById(R.id.Epassword);
        Eemail=(EditText)findViewById(R.id.Eemail);

        fName=(TextView)findViewById(R.id.fName);
        password = (TextView) findViewById(R.id.textView2);
        email = (TextView)findViewById(R.id.textView3);
        b1=(Button) findViewById(R.id.button);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                fName.setText(EfName.getText().toString());
                password.setText(password.getText().toString());
                email.setText(email.getText().toString());
            }
        });
    }
}