package org.palmdigital.cesarcipher;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
{String result;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onClick(View view)
    {
        int shift;
        String myInput;
        EditText edit_text_input = (EditText) findViewById(R.id.edit_text_input);
        EditText editText_Shift = (EditText) findViewById(R.id.editText_Shift);
        TextView text_view_01 = (TextView) findViewById(R.id.text_view_01);
        String text_inputStr = edit_text_input.getText().toString();
        int shift_inputInt = Integer.parseInt(editText_Shift.getText().toString());
        myInput = text_inputStr;
        result = crypt(myInput, shift_inputInt ,true);
        text_view_01.setText(result);
      if (editText_Shift.isEmpty())
      {
          shift = 0 ;
      }
//        else
//      {
//          shift= Integer.parseInt(editText_Shift);
//      }
    }
    public void decrypt(View view)
    {
        String myInput;
        EditText edit_text_input = (EditText) findViewById(R.id.edit_text_input);
        EditText editText_Shift = (EditText) findViewById(R.id.editText_Shift);
        TextView text_view_01 = (TextView) findViewById(R.id.text_view_01);
        String text_inputStr = edit_text_input.getText().toString();
        int shift_inputInt = Integer.parseInt(editText_Shift.getText().toString());
        myInput = text_inputStr;
        result = crypt(myInput, shift_inputInt ,false);
        text_view_01.setText(result);
        if (edit_text_input == null )
        {
            Toast.makeText(MainActivity.this, "Please a number", Toast.LENGTH_LONG).show();
        }

    }


    public static String crypt(String input, int shift, boolean encrypt)
    {
        int size = 26;
        char[] alphabet = new char[size];
        alphabet[0] = 'A';
        alphabet[1] = 'B';
        alphabet[2] = 'C';
        alphabet[3] = 'D';
        alphabet[4] = 'E';
        alphabet[5] = 'F';
        alphabet[6] = 'G';
        alphabet[7] = 'H';
        alphabet[8] = 'I';
        alphabet[9] = 'J';
        alphabet[10] = 'K';
        alphabet[11] = 'L';
        alphabet[12] = 'M';
        alphabet[13] = 'N';
        alphabet[14] = 'O';
        alphabet[15] = 'P';
        alphabet[16] = 'Q';
        alphabet[17] = 'R';
        alphabet[18] = 'S';
        alphabet[19] = 'T';
        alphabet[20] = 'U';
        alphabet[21] = 'V';
        alphabet[22] = 'W';
        alphabet[23] = 'X';
        alphabet[24] = 'Y';
        alphabet[25] = 'Z';
        int shiftCharIndex;
        int fixedCharIndex;
        String output = "";
        String toUpperCase = input.toUpperCase();
        if (encrypt == true)
        {
            for (int i = 0; i < input.length(); i++)
            {
                for (int j = 0; j < alphabet.length; j++)
                {
                    if (toUpperCase.charAt(i) == alphabet[j])
                    {
                        shiftCharIndex = j + shift;
                        fixedCharIndex = shiftCharIndex % 26;
                        output = output + alphabet[fixedCharIndex];
                    }
                }
                if (input.charAt(i) == ' ')
                {
                    output += " ";
                }

            }

        }
        else
        {

            for (int i = 0; i < input.length(); i++) {
                for (int j = 0; j < alphabet.length; j++) {
                    if (toUpperCase.charAt(i) == alphabet[j]) {
                        shiftCharIndex = j + (26 - shift);
                        fixedCharIndex = shiftCharIndex % 26;
                        output = output + alphabet[fixedCharIndex];
                    }
                }
                if (input.charAt(i) == ' ')
                {
                    output += " ";
                }

            }
        }
        return  output;
    }
}
