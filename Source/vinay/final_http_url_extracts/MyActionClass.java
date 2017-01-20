package com.robustest.plugin;

import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.actionSystem.PlatformDataKeys;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.ui.Messages;
import org.apache.commons.validator.routines.UrlValidator;
import org.apache.commons.validator.routines.*;

import javax.swing.*;

import static com.robustest.plugin.NewReturn.*;

/**
 * Created by krishnav1 on 02-09-2016.
 */
public class MyActionClass extends AnAction {

    public MyActionClass() {
        // Set the menu item name.
        super("Text _Boxes");
        // Set the menu item name, description and icon.
        // super("Text _Boxes","Item description",IconLoader.getIcon("/Mypackage/icon.png"));
    }

    public void actionPerformed(AnActionEvent event) {
        int flag = 0;
        UrlValidator defaultValidator = new UrlValidator();
        while (flag == 0) {
            JTextField username = new JTextField();
            JTextField password = new JPasswordField();
            JTextField URL = new JTextField();
            Object[] message = {
                    "Username:", username,
                    "Password:", password,
                    "URL:", URL
            };
    /*   Project project = event.getData(PlatformDataKeys.PROJECT);
        String txt= Messages.showMultilineInputDialog(project, message, "Input your name", Messages.getQuestionIcon());
      /*  String txt1= Messages.showInputDialog(project, "Which class are you studying?", "Input your class", Messages.getQuestionIcon());
        Messages.showMessageDialog(project, "Hello, " + txt + "!\n I am glad to see you." + "You are studying in "+ txt1 + "class", "Information", Messages.getInformationIcon());
    */

            int option = JOptionPane.showConfirmDialog(null, message, "Login", JOptionPane.OK_CANCEL_OPTION);
            if (option == JOptionPane.OK_OPTION) {

                if (username.getText().length()!=0 && password.getText().length()!=0) {
                    if (!defaultValidator.isValid(URL.getText())) {
                        Messages.showMessageDialog("Invalid URL entered", "ERROR", Messages.getWarningIcon());
                        flag=1;
                    }
                    Messages.showMessageDialog("Succesfully Entered User name and Password", "MESSAGE", Messages.getInformationIcon());
                    System.out.println("Printing in console hyyhy");
                    flag = 1;
                }
            }
            else
                {
                Messages.showMessageDialog("Please reenter Password", "ERROR", Messages.getInformationIcon());
            }

        }
        String[]a = new String[2];
        a[0]="1";
        main(a);
    }
}