package com.example;

import org.json.JSONObject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.json.JSONArray;
import org.json.JSONException;

public class MainApp {

    public JSONObject doSomething() {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("key", "value");
        System.out.println(jsonObject.toString());
        return jsonObject;
    }
}
