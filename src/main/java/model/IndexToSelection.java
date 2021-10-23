package model;

import java.util.Locale;

public class IndexToSelection {
    public String convert(int selection) {
        selection = selection + 65;
        if(selection==68){
            return "D";
        }
        if(selection==67){
            return "C";
        }
        if(selection==66){
            return "B";
        }
        return "A";
    }
}
