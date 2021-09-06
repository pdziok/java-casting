package me.pdziok.casting;

public class Casting {

    public int floatToInt(float input) {
        return (int) input;
    }

    public int doubleToInt(double input){
        return (int) input;
    }

    public float intToFloat(int input){
        return (float) input;
    }

    public double intToDouble(int input){
        return (double) input;
    }

    public float doubleToFloat(double input){
        return (float) input;
    }

    public String intToString(int input){
        return String.valueOf(input);
    }

    public String intToString2(int input){
        StringBuilder builder = new StringBuilder();
        builder.append(input);
        return builder.toString();
    }

    public int stringToInt(String input){
        return Integer.parseInt(input);
    }
}
