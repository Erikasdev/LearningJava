package com.erikas.mokausi;

public class overloadedMetodukas {
    public static void main(String[] args) {

        calculation(5,6, '*');





    }

    static int calculation(int x, int y, char calc) {
        int z = 0;
        switch(calc){
            case '+':
                z = x + y;
                break;
            case '-':
                z = x - y;
                break;
            case '*':
                z = x * y;
                break;
            case '/':
                z = x / y;
                break;
            default:
                System.out.println("Wrong calculation method chosen");
        }


        System.out.println(z);
        return z;
    }




}
