package com.example.passwordgenerator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int characterCount = 4;
    private int preCountDownLimit = 4;
    private TextView characterCountLabel;
    private Button increaseCharacterCountButton;
    private Button decreaseCharacterCountButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getSupportActionBar().hide();
        setContentView(R.layout.activity_main);
        characterCountLabel = findViewById(R.id.numberOfCharactersLabel);
        decreaseCharacterCountButton = findViewById(R.id.reduceCharacters);
        increaseCharacterCountButton = findViewById(R.id.increaseCharacters);
        setContentView();
    }

    private void setContentView() {
        characterCountLabel.setText(Integer.toString(characterCount));
    }

    private void setCharacterCountButtonsLabel() {
        if (this.characterCount < preCountDownLimit) {
            this.decreaseCharacterCountButton.setText("-1");
            this.increaseCharacterCountButton.setText("+1");
        } else {
            this.decreaseCharacterCountButton.setText("-2");
            this.increaseCharacterCountButton.setText("+2");
        }
    }

    public void reduceCharacters(View view) {
        if (this.characterCount > 0) {
            if (this.characterCount < preCountDownLimit) {
                this.characterCount -= 1;
            } else {
                this.characterCount -= 2;

            }
            setContentView();
            setCharacterCountButtonsLabel();
        }
    }

    public void addCharacter(View view) {
        if (this.characterCount > 0) {
            if (this.characterCount < preCountDownLimit) {
                this.characterCount += 1;
            } else {
                this.characterCount += 2;
            }
            setContentView();
            setCharacterCountButtonsLabel();
        }
    }
}