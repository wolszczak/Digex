package brf.main;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

import brf.frango.model.ModelF;
import brf.frango.model.dao.ModelStateDAOF;
import brf.main.controller.ControllerLogin;
import brf.peru.model.dao.ModelStateDAOP;

public class Application {

    public static void main(String[] args) {
        ControllerLogin c = new ControllerLogin();
        c.openWindow();
   }
    
}