package Controller;

import model.RocketLauncher;
import view.CMDInput;
import view.Printer;
import view.ResultsFormatter;

import java.io.IOException;

public class Controller {

    public void runProgram() throws IOException {
        runView();
    }

    private void runView() throws IOException {
        Printer printer = new Printer();
        CMDInput cmdInput = new CMDInput();
        ResultsFormatter resultsFormatter = new ResultsFormatter();

        printer.print("Enter a Rocket Motor A, B, C, or D");
        String selection = cmdInput.inputViaCMD();
        float apogee = runModel(selection);

        String resultString = resultsFormatter.format(selection,apogee);
        printer.print(resultString);
    }

    private float runModel(String selection) throws IOException {
        RocketLauncher rocketLauncher = new RocketLauncher(selection);
        return rocketLauncher.launch();
    }
}
