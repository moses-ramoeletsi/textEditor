package com.example.texteditor;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {
  private TextView textViewId;
  private TextInputEditText inputTextId;
  private Button addTextButton;

  @Override
  protected void onCreate (Bundle savedInstanceState) {
    super.onCreate (savedInstanceState);
    setContentView (R.layout.activity_main);

    textViewId = findViewById (R.id.textViewId);
    inputTextId = findViewById (R.id.inputTextId);
    addTextButton = findViewById (R.id.addTextbutton);

    addTextButton.setOnClickListener (new View.OnClickListener () {
      @Override
      public void onClick (View v) {
        String newText = inputTextId.getText().toString().trim();
        if (!newText.isEmpty()) {
          textViewId.setText(newText);
          inputTextId.setText(""); // Clear the EditText after updating TextView
        } else {
          Toast.makeText(MainActivity.this, "Please enter text", Toast.LENGTH_SHORT).show();
        }
      }
    });
  }
}