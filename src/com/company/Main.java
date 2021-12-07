package com.company;

import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        in.useLocale(Locale.ENGLISH);

        double a, b, c;
        double D;

        a = in.nextDouble();
        b = in.nextDouble();
        c = in.nextDouble();

        D = b * b - 4 * a * c;
        if (D > 0) {
            double x1, x2;
            x1 = (-b - Math.sqrt(D)) / (2 * a);
            x2 = (-b + Math.sqrt(D)) / (2 * a);
            System.out.println("x1 = " + x1 + ", x2 = " + x2);
        }
        else if (D == 0) {
            double x;
            x = -b / (2 * a);
            System.out.println("один корень x = " + x);
        }
        else {
            System.out.println("нет корней");
        }}}

