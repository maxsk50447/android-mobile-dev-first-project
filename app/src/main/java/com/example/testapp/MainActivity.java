package com.example.testapp;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onSayAnythingButtonClicked(View view) {
        TextView textView = (TextView) findViewById(R.id.textView);
        EditText editText = (EditText) findViewById(R.id.editText);
        ImageView imageView = (ImageView) findViewById(R.id.imageView);
        String msg = editText.getText().toString();
        textView.setText(msg);
        editText.onEditorAction(EditorInfo.IME_ACTION_DONE);
        imageView.setVisibility(View.VISIBLE);
    }
}
