package edu.asestatuas.romansnumber;

public enum RomanNumberSymbol {

    I(1), V(5), X(10), L(50), C(100), D(500), M(1000);


    private int numero;

    RomanNumberSymbol(int numero) {
        this.numero = numero;
    }

    public  int getNumber() {
        return this.numero;
    }

}
