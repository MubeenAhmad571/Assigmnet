package com.mubeen.assigmnetone;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.google.gson.Gson;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         Subject sb=new Subject("Mad",7);

        Student student1=new Student("mubeen",39,sb);
        Gson objectGson=new Gson();
        objectGson.toJson(student1);


         String file="{\n" +
                 "   \"Subject\":{\n" +
                 "     \"Subjeectname\": \"MAd\",\n" +
                 "     \"Credit_Houre\": 39\n" +
                 "   }\n" +
                 "  \"name\":\"mubeen\",\n" +
                 "  \"roolno\":39\n" +
                 "}";
        Student example = new Gson().fromJson(file,Student.class);



    }
}
