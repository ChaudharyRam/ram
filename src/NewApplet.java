/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
 
import java.applet.Applet;
import java.awt.Button;
import java.awt.Label;
import java.awt.TextField;

/**
 *
 * @author Surja
 */
public class NewApplet extends Applet {

    /**
     * Initialization method that will be called after the applet is loaded into
     * the browser.
     */
    TextField txtfname,txtpass;
    Button btnSubmit,btnCancel;
    public void init() {
        Label name=new Label("Name",Label.LEFT);
    Label pass=new Label("Password");
    txtfname=new TextField(20);
    txtpass=new TextField(20);
    txtpass.setEchoChar('?');
    btnSubmit=new Button("SUBMIT");
    btnCancel=new Button("Cancel");
    
    
    
    
    add(name);
    add(txtfname);
    add(pass);
    add(txtpass);
    add(btnSubmit);
    add(btnCancel);
   
        // TODO start asynchronous download of heavy resources
    }

    // TODO overwrite start(), stop() and destroy() methods
}
