package com.company;

public class Main {
    public static int Factorial(int a){
        int s=1;
        for(int i=1;i<a+1;i=i+1){
            s=s*i;
        }
        return s;
    }

    public static void main(String[] args) {
       int [] mass={2,34,5,62,3};
        int summa =0;
        for(int num:mass){
            summa=summa+num;
        }
        System.out.println(summa);
        for(String str : args){
            System.out.println("Argument="+str);
        }
        for(double i=1;i<11;i++){
            System.out.printf("%f%n",1/i);
        }
        int[]  masss;
        int k=0;
        masss= new int[10];
        for(int i=0;i<10;i++) {
            masss[i] = (int)(Math.random()*1000);
            System.out.println(masss[i]);
        }
        System.out.println("Sort");
        for(int i=0;i<9;i++){
            for(int j=i+1;j<10;j=j+1){
                if(masss[i]>masss[j]){
                    k=masss[i];
                    masss[i]=masss[j];
                    masss[j]=k;
                }
            }
        }
        for(int i=0;i<10;i++) {
            System.out.println(masss[i]);
        }

        int a=5;
        System.out.println(Factorial(a));

    }
}