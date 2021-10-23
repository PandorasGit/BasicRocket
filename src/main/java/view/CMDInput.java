package view;

import java.util.Scanner;

public class CMDInput {

    public String inputViaCMD(){
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
}
