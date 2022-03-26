package com.example.calculator0327;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.widget.Button;
import android.widget.TextView;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.navigation.NavigationView;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.appcompat.app.AppCompatActivity;
import com.example.calculator0327.databinding.ActivityMainBinding;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainActivity extends AppCompatActivity {

    private AppBarConfiguration mAppBarConfiguration;
    private ActivityMainBinding binding;
    private Map<String, Button> btnMap = new HashMap<>();
    private TextView input;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        input=findViewById(R.id.inputText);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
    }

    @SuppressLint({"NonConstantResourceId", "SetTextI18n"})
    public void onClick(View view){
        input= findViewById(R.id.inputText);
        String temp="";
        String text = input.getText().toString();
        switch (view.getId()){
            case R.id.btn_0:
                temp="0";
                if (text.equals("0")){
                    input.setText(temp);
                }else {
                    input.setText(text +temp);
                }
                break;
            case R.id.btn_1:
                temp="1";
                if (text.equals("0")){
                    input.setText(temp);
                }else {
                    input.setText(text +temp);
                }
                break;
            case R.id.btn_2:
                temp="2";
                if (text.equals("0")){
                    input.setText(temp);
                }else {
                    input.setText(text +temp);
                }
                break;
            case R.id.btn_3:
                temp="3";
                if (text.equals("0")){
                    input.setText(temp);
                }else {
                    input.setText(text +temp);
                }
                break;
            case R.id.btn_4:
                temp="4";
                if (text.equals("0")){
                    input.setText(temp);
                }else {
                    input.setText(text +temp);
                }
                break;
            case R.id.btn_5:
                temp="5";
                if (text.equals("0")){
                    input.setText(temp);
                }else {
                    input.setText(text +temp);
                }
                break;
            case R.id.btn_6:
                temp="6";
                if (text.equals("0")){
                    input.setText(temp);
                }else {
                    input.setText(text +temp);
                }
                break;
            case R.id.btn_7:
                temp="7";
                if (text.equals("0")){
                    input.setText(temp);
                }else {
                    input.setText(text +temp);
                }
                break;
            case R.id.btn_8:
                temp="8";
                if (text.equals("0")){
                    input.setText(temp);
                }else {
                    input.setText(text +temp);
                }
                break;
            case R.id.btn_9:
                temp="9";
                if (text.equals("0")){
                    input.setText(temp);
                }else {
                    input.setText(text +temp);
                }
                break;
            case R.id.btn_add:
                temp="+";
                if (text.equals("0")){
                    input.setText(temp);
                }else {
                    input.setText(text +temp);
                }
                break;
            case R.id.btn_subtract:
                temp="-";
                if (text.equals("0")){
                    input.setText(temp);
                }else {
                    input.setText(text+temp);
                }
                break;
            case R.id.btn_multi:
                temp="×";
                if (text.equals("0")){
                    input.setText(temp);
                }else {
                    input.setText(text +temp);
                }
                break;
            case R.id.btn_divide:
                temp="÷";
                if (text.equals("0")){
                    input.setText(temp);
                }else {
                    input.setText(text +temp);
                }
                break;
            case R.id.btn_dot:
                temp=".";
                if (text.contains(".")){
                    Log.e("MainActivity","one expression can't contain 2 dots!");
                }else {
                    input.setText(text +temp);
                }
                break;
            case R.id.btn_ac:
                input.setText("0");
                break;
            case R.id.btn_back:
                if (text.length()-1<=0){
                    input.setText("0");
                }else {
                    input.setText(text.substring(0, text.length() - 1));
                }
                break;
            default:
                Log.e("MainActivity","ERROR");
                break;
        }
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onSupportNavigateUp() {
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_content_main);
        return NavigationUI.navigateUp(navController, mAppBarConfiguration)
                || super.onSupportNavigateUp();
    }
}
