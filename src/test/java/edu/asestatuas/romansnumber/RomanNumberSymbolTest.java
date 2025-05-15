package edu.asestatuas.romansnumber;

import org.junit.jupiter.api.Test;

import edu.asestatuas.romansnumber.RomanNumberSymbol;

import static edu.asestatuas.romansnumber.RomanNumberSymbol.*;
import static org.junit.jupiter.api.Assertions.*;

public class RomanNumberSymbolTest {

    private RomanNumberSymbol roma;

    @Test
    public void RomanNumberSymbolTest() {
        roma = RomanNumberSymbol.I;
        assertEquals(I, roma);
    }
}
