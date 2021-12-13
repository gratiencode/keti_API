/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package core.codec.json;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.IOException;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author eroot
 * @param <T> Type of object to convert
 */
public class Converter<T> {
    public static int SYNCED=1;
    public static int NOT_SYNCED=0;

    /**
     *
     * @param <T> the type object that has to be mapped with integer that shows synchronized state
     * @param obj
     * @param clazz
     * @return
     */
    public static <T> HashMap<T,Integer> convertToJson(Set<Map.Entry<T,Integer>> objs,Class<T> clazz) {
        if (objs instanceof Set) {
//            if (clazz.equals(Agencefin.class)) {
//                Writer writer = null;
//                try {
//                    HashMap<Agencefin,Integer> listAg=new HashMap<>();
//                    for(Map.Entry<T,Integer> entry:objs){
//                        Agencefin a=(Agencefin)entry.getKey();
//                        int sync=entry.getValue();
//                        listAg.put(a, sync);
//                    }               
//                    Gson gson = new GsonBuilder().setPrettyPrinting().create();
//                    writer = Files.newBufferedWriter(Paths.get("keti/data/agence.json"));
//                    gson.toJson(listAg, writer);
//                    writer.close();
//                    return (HashMap<T, Integer>) listAg;
//                } catch (IOException ex) {
//                    Logger.getLogger(Converter.class.getName()).log(Level.SEVERE, null, ex);
//                } finally {
//                    try {
//                        writer.close();
//                    } catch (IOException ex) {
//                        Logger.getLogger(Converter.class.getName()).log(Level.SEVERE, null, ex);
//                    }
//                }
//            }
//            else if (obj instanceof Contacts) {
//
//            } else if (obj instanceof Depense) {
//
//            } else if (obj instanceof Marchandise) {
//
//            } else if (obj instanceof Tiers) {
//
//            } else if (obj instanceof Succursale) {
//
//            } else if (obj instanceof Transferer) {
//
//            } else if (obj instanceof User) {
//
//            } else if (obj instanceof Vehicule) {
//
//            } else if (obj instanceof Transporter) {
//
//            } else if (obj instanceof Expedier) {
//
//            }
        }
        return null;
    }
    
    public static <T> List<T> convertToJava(Class<T> clazz) {
        return null;
    }
    

}
