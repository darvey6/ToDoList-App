package model.loadsave;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;


public interface Saveable {
    void save() throws FileNotFoundException, UnsupportedEncodingException;

    PrintWriter getWriter(PrintWriter printWriter);
}
