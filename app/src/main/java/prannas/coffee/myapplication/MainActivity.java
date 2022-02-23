package prannas.coffee.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    List<String[]> Cred= new ArrayList<String[]>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button Login=(Button)findViewById(R.id.button);
        EditText Username=(EditText)findViewById((R.id.username));
        EditText Password=(EditText)findViewById((R.id.password));
        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String[] s=new String[2];
                s[0]=Username.getText().toString();
                s[1]=Password.getText().toString();
                Cred.add(s);
            }
        });
    }

}