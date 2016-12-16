package harsh.com.task_2;

import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class Task2 extends AppCompatActivity implements View.OnClickListener {
    private Button button;
    private TextView editText;
    int i=2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_task2);

        button = (Button) findViewById(R.id.button);
        editText= (TextView) findViewById(R.id.editText);

        button.setOnClickListener(this);

    }

    private void changeText(){
        String s = "Hello World!";
        String s2 = "Goodbye World!";
        i++;
        if(i%2==0){
            editText.setText(s);
        }
        else{
            editText.setText(s2);
        }
    }

    @Override
    public void onClick(View v) {
        changeText();
    }
}

