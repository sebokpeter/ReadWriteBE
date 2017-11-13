/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package readwritebe.DAL;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import readwritebe.BE.Prisoner;

/**
 *
 * @author sebok
 */
public class DataReader
{

    public List<String> readData()
    {
        Path path = Paths.get("prisoners.csv");
        List<String> prisoners = new ArrayList();
        
        try 
        {
            prisoners = Files.readAllLines(path);
            prisoners.remove(0);
        }
        catch (IOException e)
        {
        }
        
        return prisoners;
        
    }
    
}
