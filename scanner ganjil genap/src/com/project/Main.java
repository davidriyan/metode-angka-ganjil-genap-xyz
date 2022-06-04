package com.project;
import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        int bilangan;
        Scanner scan = new Scanner(System.in);

        System.out.print("MASUKKAN BILANGAN = ");
        bilangan = scan.nextInt();

        if (bilangan >=20 && bilangan % 2 == 0) {
            System.out.println("genap lebih dari 20");
        }
        else if(bilangan >=2 && bilangan <=10 && bilangan %2==0){
            System.out.println("genap kurang dari 10");
        }
        else if(bilangan >=11 && bilangan <=20 && bilangan %2==0){
            System.out.println("genap antara 10-20");
        }
        else {
            System.out.println("ganjil");
        }
    
    }
    }


