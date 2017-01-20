package com.robustest.plugin;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import com.intellij.openapi.ui.Messages;
import org.json.simple.JSONObject;
import org.json.simple.JSONArray;
import org.json.simple.parser.ParseException;
import org.json.simple.parser.JSONParser;


public class NewReturn{

    // http://localhost:8080/RESTfulExample/json/product/get
    public static void main(String[] args) {

        try {

            URL url = new URL("http://mobile.robustest.com/api/1/device");
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            conn.setRequestProperty("Accept", "application/json");

            if (conn.getResponseCode() != 200) {
                throw new RuntimeException("Failed : HTTP error code : "
                        + conn.getResponseCode());
            }

            BufferedReader br = new BufferedReader(new InputStreamReader(
                    (
                            conn.getInputStream()))
            );

            String output;
            System.out.println("Output from Server .... \n");
            while ((output = br.readLine()) != null) {
                JSONParser parser = new JSONParser();
                Object toatl;
               // String str = "{\"available\": [{\"available\": \"Yes\", \"supportAutomation\": \"Yes\", \"gmsversion\": \"4.1.2\", \"name\": \"LG Optimus L7 P700\", \"reservedForProject\": [], \"os\": \"android\", \"supportManual\": \"Yes\", \"supportHub\": \"Yes\"}, {\"available\": \"Yes\", \"supportAutomation\": \"Yes\", \"gmsversion\": \"4.2.2\", \"name\": \"HTC One X\", \"reservedForProject\": [], \"os\": \"android\", \"supportManual\": \"Yes\", \"supportHub\": \"Yes\"}, {\"available\": \"Yes\", \"supportAutomation\": \"No\", \"gmsversion\": \"4.4.4\", \"name\": \"Sony Xperia E3 Dual\", \"reservedForProject\": [], \"os\": \"android\", \"supportManual\": \"No\", \"supportHub\": \"No\"}, {\"available\": \"Yes\", \"supportAutomation\": \"Yes\", \"gmsversion\": \"4.3\", \"name\": \"HTC Desire 516 dual sim\", \"reservedForProject\": [], \"os\": \"android\", \"supportManual\": \"Yes\", \"supportHub\": \"Yes\"}, {\"available\": \"Yes\", \"supportAutomation\": \"Yes\", \"gmsversion\": \"5.1.1\", \"name\": \"Nexus 4\", \"reservedForProject\": [], \"os\": \"android\", \"supportManual\": \"Yes\", \"supportHub\": \"Yes\"}, {\"available\": \"Yes\", \"supportAutomation\": \"Yes\", \"gmsversion\": \"6.0.1\", \"name\": \"Nexus 5\", \"reservedForProject\": [], \"os\": \"android\", \"supportManual\": \"Yes\", \"supportHub\": \"Yes\"}, {\"available\": \"Yes\", \"supportAutomation\": \"Yes\", \"gmsversion\": \"5.1\", \"name\": \"XT1033\", \"reservedForProject\": [], \"os\": \"android\", \"supportManual\": \"Yes\", \"supportHub\": \"Yes\"}, {\"available\": \"Yes\", \"supportAutomation\": \"Yes\", \"gmsversion\": \"4.4.2\", \"name\": \"HTC One mini\", \"reservedForProject\": [], \"os\": \"android\", \"supportManual\": \"Yes\", \"supportHub\": \"Yes\"}, {\"available\": \"Yes\", \"supportAutomation\": \"Yes\", \"gmsversion\": \"4.4.2\", \"name\": \"Lenovo A328\", \"reservedForProject\": [\"Promoters App\"], \"os\": \"android\", \"supportManual\": \"Yes\", \"supportHub\": \"Yes\"}, {\"available\": \"Yes\", \"supportAutomation\": \"Yes\", \"gmsversion\": \"4.4.2\", \"name\": \"Venue 8 3830\", \"reservedForProject\": [], \"os\": \"android\", \"supportManual\": \"Yes\", \"supportHub\": \"Yes\"}, {\"available\": \"Yes\", \"supportAutomation\": \"Yes\", \"gmsversion\": \"4.1.1\", \"name\": \"HTC Desire X\", \"reservedForProject\": [], \"os\": \"android\", \"supportManual\": \"Yes\", \"supportHub\": \"Yes\"}], \"busy\": [], \"totalOffline\": 6, \"offline\": [{\"available\": \"No\", \"supportAutomation\": \"Yes\", \"gmsversion\": \"4.4.4\", \"name\": \"HM NOTE 1LTE\", \"reservedForProject\": [], \"os\": \"android\", \"supportManual\": \"Yes\", \"supportHub\": \"Yes\"}, {\"available\": \"No\", \"supportAutomation\": \"Yes\", \"gmsversion\": \"4.4.4\", \"name\": \"Samsung Galaxy Core Prime\", \"reservedForProject\": [], \"os\": \"android\", \"supportManual\": \"Yes\", \"supportHub\": \"Yes\"}, {\"available\": \"No\", \"supportAutomation\": \"Yes\", \"gmsversion\": \"5.0.2\", \"name\": \"Samsung Galaxy Grand Prime\", \"reservedForProject\": [], \"os\": \"android\", \"supportManual\": \"Yes\", \"supportHub\": \"Yes\"}, {\"available\": \"No\", \"supportAutomation\": \"Yes\", \"gmsversion\": \"6.0.1\", \"name\": \"Micromax AQ4501\", \"reservedForProject\": [], \"os\": \"android\", \"supportManual\": \"Yes\", \"supportHub\": \"Yes\"}, {\"available\": \"No\", \"supportAutomation\": \"Yes\", \"gmsversion\": \"4.1.2\", \"name\": \"LG-P880\", \"reservedForProject\": [], \"os\": \"android\", \"supportManual\": \"Yes\", \"supportHub\": \"Yes\"}, {\"available\": \"No\", \"supportAutomation\": \"Yes\", \"gmsversion\": \"4.4.2\", \"name\": \"Asus Zenfone 5 A500CG\", \"reservedForProject\": [], \"os\": \"android\", \"supportManual\": \"Yes\", \"supportHub\": \"Yes\"}], \"total\": 17, \"totalBusy\": 0, \"totalAvailable\": 11}";
                toatl = parser.parse(output);
              //  Messages.showMessageDialog("Succesfully extraced data", "MESSAGE", Messages.getInformationIcon());
                //JSONObject obj2 = (JSONObject)toatl;
                // JSONArray toatl1 = (JSONArray)toatl;
                JSONArray ert= (JSONArray) ((JSONObject) toatl).get("available");
                int k;
                System.out.println("Total number of devices are "+((JSONObject) toatl).get("total"));
                System.out.println("Total number of Available Devices are :- "+((JSONObject) toatl).get("totalAvailable"));
                if(0 < ert.size()) {
                    System.out.println("Its stats are:-");
                }
                for(k=0;k<ert.size();k++)
                {
                    JSONObject obr=(JSONObject) ert.get(k);
                    System.out.println("Name of the device:- " + obr.get("name"));
                    System.out.println("Is it Availabe:- " +obr.get("available"));
                    System.out.println("Is it ssupportAutomation:- "+obr.get("supportAutomation"));
                    System.out.println("Gmsversion:- "+obr.get("gmsversion"));
                    System.out.println("Support Manual:- "+obr.get("supportManual"));
                    System.out.println("OS:- "+obr.get("os"));
                    System.out.println("reserved for project:- "+obr.get("reservedForProject"));
                    System.out.println("-------------------------------------------------------------------------------");
                }
                System.out.println("Total number of Busy Devices are :- "+((JSONObject) toatl).get("totalBusy"));
                JSONArray ert1= (JSONArray) ((JSONObject) toatl).get("busy");
                if(0 < ert1.size()) {
                    System.out.println("Its stats are:-");
                }
                for(k=0;k<ert1.size();k++)
                {
                    JSONObject obr=(JSONObject) ert1.get(k);
                    System.out.println("Name of the device:- " + obr.get("name"));
                    System.out.println("Is it Availabe:- " +obr.get("available"));
                    System.out.println("Is it ssupportAutomation:- "+obr.get("supportAutomation"));
                    System.out.println("Gmsversion:- "+obr.get("gmsversion"));
                    System.out.println("Support Manual:- "+obr.get("supportManual"));
                    System.out.println("OS:- "+obr.get("os"));
                    System.out.println("reserved for project:- "+obr.get("reservedForProject"));
                    System.out.println("-------------------------------------------------------------------------------");
                }
                System.out.println("Total number of Offline Devices are :- "+((JSONObject) toatl).get("totalOffline"));

                JSONArray ert2= (JSONArray) ((JSONObject) toatl).get("offline");
                if(0 < ert2.size()) {
                    System.out.println("Its stats are:-");
                }
                for(k=0;k<ert2.size();k++)
                {
                    JSONObject obr=(JSONObject) ert2.get(k);
                    System.out.println("Name of the device:- " + obr.get("name"));
                    System.out.println("Is it Availabe:- " +obr.get("available"));
                    System.out.println("Is it ssupportAutomation:- "+obr.get("supportAutomation"));
                    System.out.println("Gmsversion:- "+obr.get("gmsversion"));
                    System.out.println("Support Manual:- "+obr.get("supportManual"));
                    System.out.println("OS:- "+obr.get("os"));
                    System.out.println("reserved for project:- "+obr.get("reservedForProject"));
                    System.out.println("-------------------------------------------------------------------------------");
                }
            }

            conn.disconnect();

        } catch (MalformedURLException e) {

            e.printStackTrace();

        } catch (IOException e) {

            e.printStackTrace();

        } catch (ParseException e) {
            e.printStackTrace();
        }

    }

}