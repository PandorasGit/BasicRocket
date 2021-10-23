package model;

import java.util.Locale;

public class SelectionToIndex {
    public int convert(String selection) {
        selection = selection.toUpperCase(Locale.ROOT);
        char selectionChar = selection.charAt(0);
        if(selectionChar>68){
            return 0;
        }
        return selectionChar-65;
    }
}
