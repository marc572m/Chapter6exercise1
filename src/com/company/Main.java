package com.company;

public class Main {


    public static void main(String[] args) {
        loop(10);
    }

    public static void loop(int n) {
        int i = n;
        while (i > 1) {
            System.out.println(i);
            if (i % 2 == 0) {
                i = i / 2;
            } else {
                i = i + 1;
            }
        }
    }
}

/*
1:
I:  N:
10  10
5   10
6   10
3   10
4   10
2   10
2:
10
5
6
3
4
2
3:

No

 */