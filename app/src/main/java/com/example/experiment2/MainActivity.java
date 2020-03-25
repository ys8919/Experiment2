package com.example.experiment2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.apache.commons.jexl3.*;
public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private static final String TAG = "MainActivity";
    JexlEngine jexlEngine = new JexlBuilder().create();
    JexlExpression jexlExpression ;
    Object evaluate;

    protected Button Btn0;
    protected Button Btn1;
    protected Button Btn2;
    protected Button Btn3;
    protected Button Btn4;
    protected Button Btn5;
    protected Button Btn6;
    protected Button Btn7;
    protected Button Btn8;
    protected Button Btn9;
    protected Button BtnAdd;
    protected Button BtnSub;
    protected Button BtnMul;
    protected Button BtnDiv;
    protected Button BtnBackspace;
    protected Button BtnEmpty;
    protected Button BtnEqual;
    protected Button BtnPer;
    protected Button BtnPoint;
    protected TextView textView;
    protected TextView textView1;

    boolean clear_flag=false;//清空

    String SafeInfo,SafeInfo1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);



        Btn0=findViewById(R.id.button0);
        Btn1=findViewById(R.id.button1);
        Btn2=findViewById(R.id.button2);
        Btn3=findViewById(R.id.button3);
        Btn4=findViewById(R.id.button4);
        Btn5=findViewById(R.id.button5);
        Btn6=findViewById(R.id.button6);
        Btn7=findViewById(R.id.button7);
        Btn8=findViewById(R.id.button8);
        Btn9=findViewById(R.id.button9);
        BtnAdd=findViewById(R.id.buttonAdd);
        BtnSub=findViewById(R.id.buttonSub);
        BtnMul=findViewById(R.id.buttonMul);
        BtnDiv=findViewById(R.id.buttonDiv);
        BtnBackspace=findViewById(R.id.buttonBackspace);
        BtnEmpty=findViewById(R.id.buttonEmpty);
        BtnEqual=findViewById(R.id.buttonEqual);
        BtnPer=findViewById(R.id.buttonPer);
        BtnPoint=findViewById(R.id.buttonPoint);
        textView=findViewById(R.id.textView);
        textView1=findViewById(R.id.textView1);

        textView.setTextSize(TypedValue.COMPLEX_UNIT_SP,40);

        textView1.setTextSize(TypedValue.COMPLEX_UNIT_SP,30);

        Btn0.setOnClickListener(this);
        Btn1.setOnClickListener(this);
        Btn2.setOnClickListener(this);
        Btn3.setOnClickListener(this);
        Btn4.setOnClickListener(this);
        Btn5.setOnClickListener(this);
        Btn6.setOnClickListener(this);
        Btn7.setOnClickListener(this);
        Btn8.setOnClickListener(this);
        Btn9.setOnClickListener(this);
        BtnAdd.setOnClickListener(this);
        BtnSub.setOnClickListener(this);
        BtnMul.setOnClickListener(this);
        BtnDiv.setOnClickListener(this);
        BtnBackspace.setOnClickListener(this);
        BtnEmpty.setOnClickListener(this);
        BtnEqual.setOnClickListener(this);
        BtnPer.setOnClickListener(this);
        BtnPoint.setOnClickListener(this);

       /* if(savedInstanceState!=null){
            Log.d(TAG, "onCreate: savedInstanceState一次");
            SafeInfo=savedInstanceState.getString("SafeInfo");
            SafeInfo1=savedInstanceState.getString("SafeInfo1");
            textView.setText(SafeInfo);
            textView1.setText(SafeInfo1);
        }*/
    }

    public void onRestoreInstanceState(Bundle savedInstanceState){
        super.onRestoreInstanceState(savedInstanceState);
        Log.d(TAG, "onRestoreInstanceState: savedInstanceState一次");
        SafeInfo=savedInstanceState.getString("SafeInfo");
        SafeInfo1=savedInstanceState.getString("SafeInfo1");
        textView.setText(SafeInfo);
        textView1.setText(SafeInfo1);
    }

    @Override
    public void onSaveInstanceState(Bundle savedInstanceState) {
        SafeInfo=textView.getText().toString();
        SafeInfo1=textView1.getText().toString();
        Log.d(TAG, "onSaveInstanceState: savedInstanceState一次");
        savedInstanceState.putString("SafeInfo",SafeInfo);
        savedInstanceState.putString("SafeInfo1",SafeInfo1);
        super.onSaveInstanceState(savedInstanceState);
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()) {
            case R.id.button0:
                if (clear_flag == true) {
                    textView1.setText(textView1.getText().toString() + textView.getText().toString());
                    textView.setText("0");
                    clear_flag = false;
                } else if (textView.getText().toString().equals("0")) {
                    textView.setText("0");
                } else {
                    textView.setText(textView.getText().toString() + "0");
                }


                break;
            case R.id.button1:
                if (clear_flag == true) {
                    textView1.setText(textView1.getText().toString() + textView.getText().toString());
                    textView.setText("1");
                    clear_flag = false;
                } else if (textView.getText().toString().equals("0")) {
                    textView.setText("1");
                } else {
                    textView.setText(textView.getText().toString() + "1");
                }
                break;
            case R.id.button2:
                if (clear_flag == true) {
                    textView1.setText(textView1.getText().toString() + textView.getText().toString());
                    textView.setText("2");
                    clear_flag = false;
                } else if (textView.getText().toString().equals("0")) {
                    textView.setText("2");
                } else {
                    textView.setText(textView.getText().toString() + "2");
                }
                break;
            case R.id.button3:
                if (clear_flag == true) {
                    textView1.setText(textView1.getText().toString() + textView.getText().toString());
                    textView.setText("3");
                    clear_flag = false;
                } else if (textView.getText().toString().equals("0")) {
                    textView.setText("3");
                } else {
                    textView.setText(textView.getText().toString() + "3");
                }
                break;
            case R.id.button4:
                if (clear_flag == true) {
                    textView1.setText(textView1.getText().toString() + textView.getText().toString());
                    textView.setText("4");
                    clear_flag = false;
                } else if (textView.getText().toString().equals("0")) {
                    textView.setText("4");
                } else {
                    textView.setText(textView.getText().toString() + "4");
                }
                break;
            case R.id.button5:
                if (clear_flag == true) {
                    textView1.setText(textView1.getText().toString() + textView.getText().toString());
                    textView.setText("5");
                    clear_flag = false;
                } else if (textView.getText().toString().equals("0")) {
                    textView.setText("5");
                } else {
                    textView.setText(textView.getText().toString() + "5");
                }
                break;
            case R.id.button6:
                if (clear_flag == true) {
                    textView1.setText(textView1.getText().toString() + textView.getText().toString());
                    textView.setText("6");
                    clear_flag = false;
                } else if (textView.getText().toString().equals("0")) {
                    textView.setText("6");
                } else {
                    textView.setText(textView.getText().toString() + "6");
                }
                break;
            case R.id.button7:
                if (clear_flag == true) {
                    textView1.setText(textView1.getText().toString() + textView.getText().toString());
                    textView.setText("7");
                    clear_flag = false;
                } else if (textView.getText().toString().equals("0")) {
                    textView.setText("7");
                } else {
                    textView.setText(textView.getText().toString() + "7");
                }
                break;
            case R.id.button8:
                if (clear_flag == true) {
                    textView1.setText(textView1.getText().toString() + textView.getText().toString());
                    textView.setText("8");
                    clear_flag = false;
                } else if (textView.getText().toString().equals("0")) {
                    textView.setText("8");
                } else {
                    textView.setText(textView.getText().toString() + "8");
                }
                break;
            case R.id.button9:
                if (clear_flag == true) {
                    textView1.setText(textView1.getText().toString() + textView.getText().toString());
                    textView.setText("9");
                    clear_flag = false;
                } else if (textView.getText().toString().equals("0")) {
                    textView.setText("9");
                } else {
                    textView.setText(textView.getText().toString() + "9");
                }
                break;
            case R.id.buttonAdd:
                if (clear_flag == true) {
                    textView1.setText(textView1.getText().toString() + "=" + textView.getText().toString().replace("=", ""));
                    textView.setText(textView.getText().toString().replace("=","") + "+");
                    clear_flag = false;
                } else if (!textView.getText().toString().equals("")) {
                    textView.setText(textView.getText().toString() + "+");
                }
                break;
            case R.id.buttonBackspace:
                String text = textView.getText().toString();
                if(!text.equals("")) {
                    textView.setText(text.substring(0, text.length() - 1));
                }
                break;
            case R.id.buttonDiv:
                if (clear_flag == true) {
                    textView1.setText(textView1.getText().toString() + "=" + textView.getText().toString().replace("=", ""));
                    textView.setText(textView.getText().toString().replace("=","") + "÷");
                    clear_flag = false;
                } else if (!textView.getText().toString().equals("")) {
                    textView.setText(textView.getText().toString() + "÷");
                }

                break;
            case R.id.buttonEmpty:
                textView.setText("");
                textView1.setText("");
                break;
            case R.id.buttonEqual:      //等于
                if (!textView.getText().toString().equals("")) {
                    // Log.d(TAG, "onClick: textView.getText()"+textView.getText().toString());
                    textView1.setText(textView.getText().toString().replace("=", ""));
                    // textView.setText("");
                    //   Log.d(TAG, "onClick: =  "+textView1.getText().toString());
                    try {
                        getResult();
                    } catch (Exception e) {
                        textView1.setText("");
                        e.printStackTrace();
                    }

                }

                break;
            case R.id.buttonMul:
                if (clear_flag == true) {
                    textView1.setText(textView1.getText().toString() + "=" + textView.getText().toString().replace("=", ""));
                    textView.setText(textView.getText().toString().replace("=","") + "×");
                    clear_flag = false;
                } else if (!textView.getText().toString().equals("")) {
                    textView.setText(textView.getText().toString() + "×");
                }
                break;
            case R.id.buttonPer:
                String pernum = textView.getText().toString();
                if (!pernum.contains("+") && !pernum.contains("-") && !pernum.contains("×") && !pernum.contains("÷") && !pernum.contains("=")&&!pernum.equals("")) {
                    //Log.d(TAG, "onClick: pernum"+pernum);
                    float num = Float.parseFloat(pernum) / 100;
                    textView.setText(Float.toString(num));
                    textView1.setText(pernum + "%");
                } else if (pernum.contains("=")) {
                    Log.d(TAG, "onClick: pernum==" + pernum);
                    float num = Float.parseFloat(pernum.replace("=", "")) / 100;
                    textView.setText(Float.toString(num));
                    textView1.setText(pernum.replace("=", "") + "%");
                }
                break;

            case R.id.buttonPoint:
                if (textView.getText().toString().equals("")) {
                    textView.setText(textView.getText().toString() + "0.");
                } else {
                    textView.setText(textView.getText().toString() + ".");
                }
                break;
            case R.id.buttonSub:
                if (clear_flag == true) {
                    textView1.setText(textView1.getText().toString() + "=" + textView.getText().toString().replace("=", ""));
                    textView.setText(textView.getText().toString().replace("=","") + "-");
                    clear_flag = false;
                } else if (!textView.getText().toString().equals("")) {
                    textView.setText(textView.getText().toString() + "-");
                }

                break;


        }

    }


    private void getResult() throws Exception{
        String exp = textView.getText().toString();
        if(!exp.equals("")) {
           // Log.d(TAG, "getResult: exp:" + exp);
            exp = exp.replace("=", "");
            exp = exp.replace("×", "*");
            if(!exp.contains(".")) {
                exp = exp.replace("÷", ".0/");
            }else{
                exp = exp.replace("÷", "/");
            }
          //  Log.d(TAG, "getResult: exp转码后:" + exp);

                jexlExpression = jexlEngine.createExpression(exp);
                evaluate = jexlExpression.evaluate(null);
                textView.setText("=" + evaluate.toString());
                clear_flag = true;

        }
    }
}

