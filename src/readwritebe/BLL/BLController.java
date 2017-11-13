/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package readwritebe.BLL;

import java.util.ArrayList;
import java.util.List;
import readwritebe.BE.Prisoner;
import readwritebe.DAL.DataReader;

/**
 *
 * @author sebok
 */
public class BLController
{
    private DataReader dr = new DataReader();
    
    public List<Prisoner> prepareData()
    {
        List<Prisoner> prisoners = new ArrayList<>();
        List<String> data = dr.readData();
        data.remove(0);
        
        for (String dataLine : data)
        {
            String[] line = dataLine.split(",");
            Prisoner p = new Prisoner(line[0], line[1], line[2], line[3], Integer.parseInt(line[4]));
            prisoners.add(p);
        }
        
        return prisoners;
    }
}
