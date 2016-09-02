package zimo.example.com.calculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    Stack<String> operatorStack = new Stack<>();
    Stack<Double> numberStack = new Stack<>();
    TextView textViewClear;
    TextView textViewShow;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //
        textViewClear = (TextView)findViewById(R.id.textViewClear);
        textViewShow = (TextView)findViewById(R.id.textViewShow);

        //定义按钮
        Button buttonOne = (Button)findViewById(R.id.buttonOne);
        Button buttonTwo = (Button)findViewById(R.id.buttonTwo);
        Button buttonThree = (Button)findViewById(R.id.buttonThree);
        Button buttonFour = (Button)findViewById(R.id.buttonFour);
        Button buttonFive = (Button)findViewById(R.id.buttonFive);
        Button buttonSix = (Button)findViewById(R.id.buttonSix);
        Button buttonSeven = (Button)findViewById(R.id.buttonSeven);
        Button buttonEight = (Button)findViewById(R.id.buttonEight);
        Button buttonNine = (Button)findViewById(R.id.buttonNine);
        Button buttonZero = (Button)findViewById(R.id.buttonZero);
        Button buttonEqual = (Button)findViewById(R.id.buttonEqual);
        Button buttonDot = (Button)findViewById(R.id.buttonDot);
        Button buttonSin = (Button)findViewById(R.id.buttonSin);
        Button buttonCos = (Button)findViewById(R.id.buttonCos);
        Button buttonAdd = (Button)findViewById(R.id.buttonAdd);
        Button buttonSubtraction = (Button)findViewById(R.id.buttonSubtraction);
        Button buttonMultiplication = (Button)findViewById(R.id.buttonMultiplication);
        Button buttonDivision = (Button)findViewById(R.id.buttonDivision);
        Button buttonSquare = (Button)findViewById(R.id.buttonSquare);
        Button buttonTan = (Button)findViewById(R.id.buttonTan);
        Button buttonLeftBracket = (Button)findViewById(R.id.buttonLeftBracket);
        Button buttonRightBracket = (Button)findViewById(R.id.buttonRightBracket);
        Button buttonClear = (Button)findViewById(R.id.buttonClear);
        Button buttonBackspace = (Button)findViewById(R.id.buttonBackspace);

        //注册监听器
        buttonBackspace.setOnClickListener(this);
        buttonTan.setOnClickListener(this);
        buttonLeftBracket.setOnClickListener(this);
        buttonRightBracket.setOnClickListener(this);
        buttonAdd.setOnClickListener(this);
        buttonClear.setOnClickListener(this);
        buttonCos.setOnClickListener(this);
        buttonDot.setOnClickListener(this);
        buttonEight.setOnClickListener(this);
        buttonEqual.setOnClickListener(this);
        buttonFive.setOnClickListener(this);
        buttonFour.setOnClickListener(this);
        buttonMultiplication.setOnClickListener(this);
        buttonNine.setOnClickListener(this);
        buttonOne.setOnClickListener(this);
        buttonDivision.setOnClickListener(this);
        buttonSeven.setOnClickListener(this);
        buttonSin.setOnClickListener(this);
        buttonSquare.setOnClickListener(this);
        buttonSubtraction.setOnClickListener(this);
        buttonSix.setOnClickListener(this);
        buttonThree.setOnClickListener(this);
        buttonTwo.setOnClickListener(this);
        buttonZero.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        double number = 0;
        int numbers[] = {
                R.id.buttonOne,
                R.id.buttonTwo,
                R.id.buttonThree,
                R.id.buttonFour,
                R.id.buttonFive,
                R.id.buttonSix,
                R.id.buttonSeven,
                R.id.buttonEight,
                R.id.buttonNine,
                R.id.buttonZero,
        };
        int operators[] = {
                R.id.buttonAdd,
                R.id.buttonSubtraction,
                R.id.buttonMultiplication,
                R.id.buttonDivision,
                R.id.buttonSin,
                R.id.buttonCos,
                R.id.buttonTan,
                R.id.buttonSquare,
                R.id.buttonLeftBracket,
                R.id.buttonRightBracket,
        };
        List numberList = Arrays.asList(numbers);
        List operatorsList = Arrays.asList(operators);

        if (){
//            Toast.makeText(MainActivity.this,"1",Toast.LENGTH_LONG).show();
            String show = textViewShow.getText().toString();
            Toast.makeText(MainActivity.this,show,Toast.LENGTH_LONG).show();
            if (show.equals("0")){
                textViewShow.setText(show);
                number = Integer.parseInt(((Button)findViewById(v.getId())).getText().toString());
                textViewShow.setText(((Button)findViewById(v.getId())).getText());
            }else {
                if (!show.contains(".")){
                    show += textViewShow.getText();
                    textViewShow.setText(show);
                    int length = show.length();
                    for (int i = 0;i<length;i++){
                        number += Integer.parseInt(String.valueOf(show.charAt(i)))*10*(length-1);
                    }

                }else {

                }
            }
        }else if (operatorsList.contains(v.getId())) {

        }else if (v.getId() == R.id.buttonDot){

        }else if (v.getId() == R.id.buttonBackspace){

        }else if (v.getId() == R.id.buttonClear) {

        }else if (v.getId() == R.id.buttonEqual){

        }
    }
}
