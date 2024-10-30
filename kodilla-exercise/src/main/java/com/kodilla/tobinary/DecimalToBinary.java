package com.kodilla.tobinary;

public class DecimalToBinary {
    public static String decimalToBinary(int num) {

        String binary = "";

        if(num<0){
            num=-num;
            do{
                if(num%2==0){
                    binary = "0"+binary;
                } else {
                    binary = "1"+binary;
                }
                num = num/2;
            }while(num>0);
            String minusBinary = "";
            for(int i=0;i<binary.length();i++){
                if(binary.charAt(i)=='0'){
                    minusBinary = minusBinary+'1';
                } else {
                    minusBinary = minusBinary+'0';
                }
            }
            return '1'+minusBinary;

        }else {
            do{
                if(num%2==0){
                    binary = "0"+binary;
                } else {
                    binary = "1"+binary;
                }
                num = num/2;
            }while(num>0);
            return binary;

        }


    }
}
