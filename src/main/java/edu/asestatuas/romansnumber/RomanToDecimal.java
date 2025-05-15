package edu.asestatuas.romansnumber;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class RomanToDecimal {

    private String decimal;
    private final String patron = "(IV|IX|XL|XC|CD|CM)|([IVXLCDM])";
    Pattern pattern = Pattern.compile(patron);

    RomanToDecimal(String decimal) {
        this.decimal = decimal;
    }

    public void Breaker(){
        Matcher matcher = pattern.matcher(this.decimal);
        while (matcher.find()){
            System.out.println("Numero encontrado: " + matcher.group());
        }
    }


}
