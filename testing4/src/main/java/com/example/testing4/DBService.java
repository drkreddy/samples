package com.example.testing4;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DBService {
    List<String> stringList = new ArrayList<String>(){
        {
            add("abc");
            add("def");
            add("ghi");
        }
    };
}
