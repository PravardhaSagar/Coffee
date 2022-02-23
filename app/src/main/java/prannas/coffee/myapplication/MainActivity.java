package prannas.coffee.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    String[][] cred = new String[10][2];
    int x = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button Login = (Button) findViewById(R.id.button);
        EditText Username = (EditText) findViewById((R.id.username));
        EditText Password = (EditText) findViewById((R.id.password));
        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Toast.makeText(getApplicationContext(), "Clicked", Toast.LENGTH_SHORT).show();

                String[][] cred={{"vic", "pre"}, {"aru", "pra"}, {"pra", "aru"}, {"google", "android"}};
                String s,j;
                s=Username.getText().toString();
                j=Password.getText().toString();
                Toast.makeText(getApplicationContext(), "Successful", Toast.LENGTH_SHORT).show();
                int c=0;
                //this
                //is
                //just
                //for branch
                for(int i=0;i<4;i++)
                {
                    if(cred[i][0].equals(s) && cred[i][1].equals(j)){
                        Toast.makeText(getApplicationContext(), "Successful", Toast.LENGTH_SHORT).show();
                        c=1;
                        break;
                    }
                }
                if(c==0){
                    Toast.makeText(getApplicationContext(), "Unsucessfull", Toast.LENGTH_LONG).show();
                }

            }
        });
    }

}