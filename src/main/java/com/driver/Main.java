package com.driver;

public class Main {
    public static class Product{
        public int product(int x, int y) {
            return x*y;
        }
        public int product(int x, int y, int z) {
            return x*y*z;
        }
        public double product(double x, double y) {
            return x*y;
        }
    }
    public static void main(String[] args) {
        int x=1;
        int y=2;
        int z=3;
        double d1=1.1;
        double d2=2.2;

        Product p =new Product();
        //p.product(x,y);
        //p.product(x,y,z);
       // p.product(d1,d2);
        System.out.println(p.product(x,y));
        System.out.println(p.product(x,y,z));
        System.out.println(p.product(d1,d2));
    }
}

