package com.dkraemerwork.singleton;
import java.io.BufferedWriter;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.Collections;

public class Logger {

    public static Logger logger;

    private Logger(){

    }

    public static Logger getInstance(){
        if (null == logger){
            logger = new Logger();
        }
        return logger;
    }

    public void log(String output) throws IOException {
        Files.write(Paths.get("src/com/dkraemerwork/singleton/test.txt"), Collections.singletonList(output),
                StandardCharsets.UTF_8);
    }
}
