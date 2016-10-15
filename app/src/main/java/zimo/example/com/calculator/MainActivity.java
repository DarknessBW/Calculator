package zimo.example.com.calculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
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


    }

    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        switch (id) {
            case R.id.calculator:
                Toast.makeText(this, "这个就是计算器！", Toast.LENGTH_SHORT).show();
                break;
            case R.id.transformLength:
                Intent intent = new Intent(MainActivity.this, TransformateLength.class);
                startActivity(intent);
                break;
            case R.id.transformBase:
                Intent intent2 = new Intent(MainActivity.this, TransformateBase.class);
                startActivity(intent2);
                break;
        }


        return super.onOptionsItemSelected(item);
    }
}