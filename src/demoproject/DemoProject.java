
package demoproject;
import java.awt.*;

import java.applet.Applet;


public class DemoProject extends Applet implements Runnable {
TextField txtfname,txtpass;

public void init()
{
    Label name=new Label("Name");
    Label pass=new Label("Password");
    txtfname=new TextField(20);
    txtpass=new TextField(20);
    add(name);
    add(txtfname);
    
}
    public static void main(String[] args) {
        DemoProject d=new DemoProject();
        d.init();
        // TODO code application logic here
    }

    @Override
    public void run() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
