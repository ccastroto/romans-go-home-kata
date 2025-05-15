package edu.asestatuas.romansnumber;

import java.util.List;
import  edu.asestatuas.romansnumber.RomanNumberSymbol;

/*public class RomansGoHome {

    public static void main(String[] args) {

        List.of( "MMMDCCCLXXXVIII", // 3888
                        "MMDCCLXXVII",  // 2777
                        "CDXLIV", // 444
                        "CDXXXIX" // 439
                ).stream()
                .map(RomanNumber::new)
                .forEach(n -> System.out.println(n.toString() + " = " + n.toDecimal()));
    }
}*/

public class RomansGoHome {

    public static void main(String[] args) {
        RomanToDecimal deci = new RomanToDecimal("MMCDXLV");
        deci.Breaker();
    }

}