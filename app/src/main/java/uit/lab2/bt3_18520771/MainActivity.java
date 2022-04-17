package uit.lab2.bt3_18520771;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    String operation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        View.OnClickListener buttonListener;
        Button btn0,btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btnPlus,btnMinus,btnMulti,btnDivide,btnBy,btnC;
        Integer lastvalue = 0,currentvalue;
        EditText result = (EditText) findViewById(R.id.editText);

        btn0 = findViewById(R.id.btn0);
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        btn6 = findViewById(R.id.btn6);
        btn7 = findViewById(R.id.btn7);
        btn8 = findViewById(R.id.btn8);
        btn9 = findViewById(R.id.btn9);
        btnPlus = findViewById(R.id.btnPlus);
        btnMinus = findViewById(R.id.btnMinus);
        btnMulti = findViewById(R.id.btnMulti);
        btnDivide = findViewById(R.id.btnDivide);
        btnBy = findViewById(R.id.btnBy);
        btnC = findViewById(R.id.btnC);

        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operation = result.getText().toString();
                result.setText(operation + "0");
            }
        });

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operation = result.getText().toString();
                result.setText(operation + "1");
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operation = result.getText().toString();
                result.setText(operation + "2");
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operation = result.getText().toString();
                result.setText(operation + "3");
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operation = result.getText().toString();
                result.setText(operation + "4");
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operation = result.getText().toString();
                result.setText(operation + "5");
            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operation = result.getText().toString();
                result.setText(operation + "6");
            }
        });

        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operation = result.getText().toString();
                result.setText(operation + "7");
            }
        });

        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operation = result.getText().toString();
                result.setText(operation + "8");
            }
        });

        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operation = result.getText().toString();
                result.setText(operation + "9");
            }
        });

        btnPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operation = result.getText().toString();
                result.setText(operation + "+");
            }
        });
        btnMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operation = result.getText().toString();
                result.setText(operation + "-");
            }
        });
        btnMulti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operation = result.getText().toString();
                result.setText(operation + "*");
            }
        });
        btnDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operation = result.getText().toString();
                result.setText(operation + "/");
            }
        });
        btnBy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operation = result.getText().toString();
                result.setText(operation + "=");
            }
        });
        btnC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operation = result.getText().toString();
                result.setText(operation + "C");
            }
        });
    }

    public void setValue(EditText a, String b){
        String last = a.getText().toString();
        if (!last.equals("0")){
            last +=b;
            b=last;
        }
        a.setText(b);
    }

    public void resetValue(){
        EditText result = (EditText) findViewById(R.id.editText);
        result.setText("0");
    }

    public Integer process(Integer a, Integer b) {
        EditText result = (EditText) findViewById(R.id.editText);
        Integer presult = 0;
        if (operation == "plus") {
            presult = a+b;
            result.setText(presult.toString());
        }
        if (operation == "sub") {
            presult = a-b;
            result.setText(presult.toString());
        }
        if (operation == "mult") {
            presult = a*b;
            result.setText(presult.toString());
        }
        if (operation == "divi") {
            presult = a/b;
            result.setText(presult.toString());
        }
        return presult;
    }

}
