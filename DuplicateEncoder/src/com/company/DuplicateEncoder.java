package com.company;

import java.util.HashMap;

/**
 * Created by ousma on 4/26/2017.
 */
public class DuplicateEncoder {

    public static String encode(String word){
        String output = "";
        word = word.toLowerCase();
        HashMap<Character, Integer> map = new HashMap<>();
        String[] stringCharsArray = word.split("");
        for(String ch : stringCharsArray){
            Character character = ch.charAt(0);
            if(map.containsKey(character)){
                int freq = map.get(character);
                map.put(character, ++freq);
            }else {
                map.put(character, 1);
            }
        }

        for(String ch : stringCharsArray){
            if(map.containsKey(ch.charAt(0)) && map.get(ch.charAt(0)) > 1) {
                output += ")";
            }else output += "(";
        }
        return output;
    }

    public static void main(String[] args) {
        System.out.println(DuplicateEncoder.encode("Prespecialized"));
    }
}
