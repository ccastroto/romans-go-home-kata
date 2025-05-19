package edu.asestatuas.romansnumber;

public enum RomanNumberSymbolResta {

    IV(4), IX(9), XL(40), XC(90), CD(400), CM(900);

    private int numero;

    RomanNumberSymbolResta(int numero) {
        this.numero = numero;
    }

    public  int getNumber() {
        return this.numero;
    }


}
