package com.robustest.plugin;
import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.VPos;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.Region;
import javafx.scene.paint.Color;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;
import javafx.stage.Stage;
import com.intellij.openapi.ui.Messages;

import static javafx.application.Application.*;
//import static com.robustest.plugin.WebViewSample.*;


/**
 * Created by saisriragh on 9/28/2016.
 */
public class WebViewSample extends Application{
       private Scene scene;
    //public static String parameters;
    public static String arguments;
    @Override public void start(Stage stage) {
        // create the scene
        stage.setTitle("Web View");

        //System.out.println(getParameters());
       // System.out.println(arguments);
       // parameters = getParameters().getNamed().toString();
        scene = new Scene(new Browser(),750,500, Color.web("#666970"));
        stage.setScene(scene);
scene.getStylesheets().add("com/robustest/plugin/BrowserToolbar.css");
     //  scene.getStylesheets().add("com/robustest/plugin/style.css");
      //scene.getStylesheets().add(getClass().getResource("com/robustest/plugin/BrowserToolbar.css").toExternalForm());
        stage.show();
    }
    public static void main(String[] args){

        //String st="sairagh";
        //String[] result = st.split("(?!^)");
        // System.out.println(result[0]);

        arguments = args[0];
        Messages.showMessageDialog("entered before launch " + args[0], "warning", Messages.getWarningIcon());
        Application.launch(WebViewSample.class,args);
        //Messages.showMessageDialog("after before launch ", "warning", Messages.getWarningIcon());
    }



}
class Browser extends Region {

    final WebView browser = new WebView();
    final WebEngine webEngine = browser.getEngine();

    public Browser() {
        //apply the styles
        getStyleClass().add("browser");
        // load the web page
        //System.out.println(WebViewSample.arguments);
        webEngine.load(WebViewSample.arguments);
        //webEngine.load("http://www.google.com");
        //add the web view to thscene
        getChildren().add(browser);

    }
    private Node createSpacer() {
        Region spacer = new Region();
        HBox.setHgrow(spacer, Priority.ALWAYS);
        return spacer;
    }

    @Override protected void layoutChildren() {
        double w = getWidth();
        double h = getHeight();
        layoutInArea(browser,0,0,w,h,0, HPos.CENTER, VPos.CENTER);
    }

    @Override protected double computePrefWidth(double height) {
        return 750;
    }

    @Override protected double computePrefHeight(double width) {
        return 500;
    }
}
