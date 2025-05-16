package edu.asestatuas.romansnumber;

import edu.asestatuas.romansnumber.RomanToDecimal;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RomanNumber {

    private String numeroRomano;
    private final String patron = "(IV|IX|XL|XC|CD|CM)|([IVXLCDM])";
    Pattern pattern = Pattern.compile(patron);

    RomanNumber(String numeroRomano) {
        this.numeroRomano =  numeroRomano;
    }

    public String getNumeroRomano() {
        return this.numeroRomano;
    }

    public short toDecimal(){
        short value = 0;
        Matcher matcher = pattern.matcher(this.numeroRomano);
        while (matcher.find()){
            value = (short)(matcher.group(patron).length());
        }
        return value;
    }

    public String toString(){
        return this.numeroRomano;
    }
}
