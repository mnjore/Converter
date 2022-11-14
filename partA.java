import java.util.Random;

public class partA {

    public static void main(String[] args) {

        DecConvert dim = new DecConvert();

        for (int i = 0; i < 30; i++){
         dim.Bin(i);
         dim.Hex(i);

        }
    }
}

class DecConvert {
    int num;
    String binary, hexa;

    //Function to convert to Binary
    void Bin(int a) {
        num = a;

        binary = Integer.toBinaryString(num);
        System.out.println("Binary Value is: " + binary);
    }

    //Function to convert to Hexadecimal
    void Hex(int a) {
        hexa = Integer.toHexString(num);
        System.out.println("HexaDecimal Value is: " + hexa);
    }
}

