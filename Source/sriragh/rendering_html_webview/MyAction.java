package com.robustest.plugin;
//package com.robustest.plugin.WebViewSample;
import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.actionSystem.PlatformDataKeys;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.ui.Messages;
import org.apache.commons.validator.routines.UrlValidator;

import static com.robustest.plugin.WebViewSample.main;
//import WebViewSample;


/**
 * Created by saisriragh on 9/3/2016.
 */
public class MyAction extends AnAction {
        // If you register the action from Java code, this constructor is used to set the menu item name
        // (optionally, you can specify the menu description and an icon to display next to the menu item).        // You can omit this constructor when registering the action in the plugin.xml file.
        public MyAction() {
            // Set the menu item name.
            super("Text _Boxes");
            // Set the menu item name, description and icon.
            // super("Text _Boxes","Item description",IconLoader.getIcon("/Mypackage/icon.png"));
        }

        public void actionPerformed(AnActionEvent event) {
            Project project = event.getData(PlatformDataKeys.PROJECT);
            String txt= Messages.showInputDialog(project, "Please enter the remote url to connect?", "Input your vnc server url", Messages.getQuestionIcon());
                   //System.out.println("Count is: " + txt);
            int a=txt.length();
            int flag;
            flag=0;

            while(a==0)
            {
                     Messages.showMessageDialog(project, "No url is entered Please reenter it ", "warning", Messages.getWarningIcon());
                    txt= Messages.showInputDialog(project, "Please enter the remote url to connect?", "Input your vnc server url", Messages.getQuestionIcon());
                    a=txt.length();
            }
            UrlValidator defaultValidator = new UrlValidator(); // default schemes
            if (defaultValidator.isValid(txt)) {
                Messages.showMessageDialog(project, "you will be redirected to remote url", "Information", Messages.getInformationIcon());
                flag=1;
            }
            else
            {
                Messages.showMessageDialog(project, "invalid url is entered ", "warning", Messages.getWarningIcon());
            }
            String[] arr=new String[1];
            arr[0]=txt;

            if(flag==1)
            {
                main(arr);

            }

        }






}
