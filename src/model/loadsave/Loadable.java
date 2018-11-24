package model.loadsave;


import exceptions.TooManyTaskException;

import java.io.IOException;
import java.util.ArrayList;

public interface Loadable {
    void load() throws IOException, TooManyTaskException;

    ArrayList<String> splitOnComma(String line);

    String getATask(int i);
}
