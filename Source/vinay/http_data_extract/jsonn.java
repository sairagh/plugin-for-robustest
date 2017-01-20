//package com.robustest.plugin;

import org.json.simple.JSONObject;
import org.json.simple.JSONArray;
import org.json.simple.parser.ParseException;
import org.json.simple.parser.JSONParser;
/**
 * Created by krishnav1 on 29-09-2016.
 */
public class jsonn{
   // private static Object toatl;

    public static void main(String[] args){
        JSONParser parser = new JSONParser();
        String s = "{\"available\": [{\"available\": \"Yes\", \"supportAutomation\": \"Yes\", \"gmsversion\": \"4.1.2\", \"name\": \"LG Optimus L7 P700\", \"reservedForProject\": [], \"os\": \"android\", \"supportManual\": \"Yes\", \"supportHub\": \"Yes\"}, {\"available\": \"Yes\", \"supportAutomation\": \"Yes\", \"gmsversion\": \"4.2.2\", \"name\": \"HTC One X\", \"reservedForProject\": [], \"os\": \"android\", \"supportManual\": \"Yes\", \"supportHub\": \"Yes\"}, {\"available\": \"Yes\", \"supportAutomation\": \"No\", \"gmsversion\": \"4.4.4\", \"name\": \"Sony Xperia E3 Dual\", \"reservedForProject\": [], \"os\": \"android\", \"supportManual\": \"No\", \"supportHub\": \"No\"}, {\"available\": \"Yes\", \"supportAutomation\": \"Yes\", \"gmsversion\": \"4.3\", \"name\": \"HTC Desire 516 dual sim\", \"reservedForProject\": [], \"os\": \"android\", \"supportManual\": \"Yes\", \"supportHub\": \"Yes\"}, {\"available\": \"Yes\", \"supportAutomation\": \"Yes\", \"gmsversion\": \"5.1.1\", \"name\": \"Nexus 4\", \"reservedForProject\": [], \"os\": \"android\", \"supportManual\": \"Yes\", \"supportHub\": \"Yes\"}, {\"available\": \"Yes\", \"supportAutomation\": \"Yes\", \"gmsversion\": \"6.0.1\", \"name\": \"Nexus 5\", \"reservedForProject\": [], \"os\": \"android\", \"supportManual\": \"Yes\", \"supportHub\": \"Yes\"}, {\"available\": \"Yes\", \"supportAutomation\": \"Yes\", \"gmsversion\": \"5.1\", \"name\": \"XT1033\", \"reservedForProject\": [], \"os\": \"android\", \"supportManual\": \"Yes\", \"supportHub\": \"Yes\"}, {\"available\": \"Yes\", \"supportAutomation\": \"Yes\", \"gmsversion\": \"4.4.2\", \"name\": \"HTC One mini\", \"reservedForProject\": [], \"os\": \"android\", \"supportManual\": \"Yes\", \"supportHub\": \"Yes\"}, {\"available\": \"Yes\", \"supportAutomation\": \"Yes\", \"gmsversion\": \"4.4.2\", \"name\": \"Lenovo A328\", \"reservedForProject\": [\"Promoters App\"], \"os\": \"android\", \"supportManual\": \"Yes\", \"supportHub\": \"Yes\"}, {\"available\": \"Yes\", \"supportAutomation\": \"Yes\", \"gmsversion\": \"4.4.2\", \"name\": \"Venue 8 3830\", \"reservedForProject\": [], \"os\": \"android\", \"supportManual\": \"Yes\", \"supportHub\": \"Yes\"}, {\"available\": \"Yes\", \"supportAutomation\": \"Yes\", \"gmsversion\": \"4.1.1\", \"name\": \"HTC Desire X\", \"reservedForProject\": [], \"os\": \"android\", \"supportManual\": \"Yes\", \"supportHub\": \"Yes\"}], \"busy\": [], \"totalOffline\": 6, \"offline\": [{\"available\": \"No\", \"supportAutomation\": \"Yes\", \"gmsversion\": \"4.4.4\", \"name\": \"HM NOTE 1LTE\", \"reservedForProject\": [], \"os\": \"android\", \"supportManual\": \"Yes\", \"supportHub\": \"Yes\"}, {\"available\": \"No\", \"supportAutomation\": \"Yes\", \"gmsversion\": \"4.4.4\", \"name\": \"Samsung Galaxy Core Prime\", \"reservedForProject\": [], \"os\": \"android\", \"supportManual\": \"Yes\", \"supportHub\": \"Yes\"}, {\"available\": \"No\", \"supportAutomation\": \"Yes\", \"gmsversion\": \"5.0.2\", \"name\": \"Samsung Galaxy Grand Prime\", \"reservedForProject\": [], \"os\": \"android\", \"supportManual\": \"Yes\", \"supportHub\": \"Yes\"}, {\"available\": \"No\", \"supportAutomation\": \"Yes\", \"gmsversion\": \"6.0.1\", \"name\": \"Micromax AQ4501\", \"reservedForProject\": [], \"os\": \"android\", \"supportManual\": \"Yes\", \"supportHub\": \"Yes\"}, {\"available\": \"No\", \"supportAutomation\": \"Yes\", \"gmsversion\": \"4.1.2\", \"name\": \"LG-P880\", \"reservedForProject\": [], \"os\": \"android\", \"supportManual\": \"Yes\", \"supportHub\": \"Yes\"}, {\"available\": \"No\", \"supportAutomation\": \"Yes\", \"gmsversion\": \"4.4.2\", \"name\": \"Asus Zenfone 5 A500CG\", \"reservedForProject\": [], \"os\": \"android\", \"supportManual\": \"Yes\", \"supportHub\": \"Yes\"}], \"total\": 17, \"totalBusy\": 0, \"totalAvailable\": 11}";

        try {
            Object toatl = parser.parse(s);
            toatl = parser.parse(s);
            //JSONObject obj2 = (JSONObject)toatl;
           // JSONArray toatl1 = (JSONArray)toatl; JSONArray ert= (JSONArray) ((JSONObject) toatl).get("available");
            int k;
            JSONArray ert= (JSONArray) ((JSONObject) toatl).get("available");
            for(k=0;k<ert.size();k++)
            {
                JSONObject obr=(JSONObject) ert.get(k);
                System.out.println(obr.get("name"));
                System.out.println(obr.get("available"));
                System.out.println(obr.get("supportAutomation"));
                System.out.println(obr.get("gmsversion"));
                System.out.println(obr.get("supportManual"));
                System.out.println(obr.get("os"));
                System.out.println(obr.get("reservedForProject"));
                System.out.println("\n");
            }
            JSONArray erte= (JSONArray) ((JSONObject) toatl).get("available");
            System.out.println(erte.size());
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
