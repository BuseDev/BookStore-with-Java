/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package obj_finall_project;

import java.io.File;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author lenovo
 */
public class Print {
    public void Print(ArrayList list) throws IOException{
        File file=new File("C:\\\\Folder\\\\List.json");
        FileWriter fw=new FileWriter(file);
        try (BufferedWriter bw = new BufferedWriter(fw)) {
            if(!file.exists()){
                file.createNewFile();
            }
            for(int i=0;i<list.size();i++){
                bw.write((String) list.get(i));
                bw.newLine();
            }
        }
    }
}
