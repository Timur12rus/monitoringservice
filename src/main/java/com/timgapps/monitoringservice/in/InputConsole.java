package com.timgapps.monitoringservice.in;

import java.util.Scanner;

public class InputConsole {

    public static String inputText() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
}
