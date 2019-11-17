package com.apple.cheapter;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Signin extends Loginform{
    public Signin(){
        JFrame frame = new JFrame("Signin");

        frame.setSize(500,360);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        JPanel panel = new JPanel();
        frame.add(panel);

        placeComponents(panel);
        frame.setVisible(true);
    }
    private static void placeComponents(JPanel panel){
        panel.setLayout(null);

        JLabel usernameLabel = new JLabel("Username:");
        usernameLabel.setBounds(10,20,80,25);
        panel.add(usernameLabel);
        JTextField usernameText = new JTextField(20);
        usernameText.setBounds(100,20,165,25);
        panel.add(usernameText);

        JLabel usermailLabel = new JLabel("Email:");
        usermailLabel.setBounds(10,50,80,25);
        panel.add(usermailLabel);
        JTextField usermailText = new JTextField(20);
        usermailText.setBounds(100,50,165,25);
        panel.add(usermailText);

        JLabel userpassword = new JLabel("Password:");
        userpassword.setBounds(10,80,80,25);
        panel.add(userpassword);
        JPasswordField userpasswordText = new JPasswordField(20);
        userpasswordText.setBounds(100,80,165,25);
        panel.add(userpasswordText);

        JButton SigninBotton= new JButton("Sign in");
        SigninBotton.setBounds(120,120,80,25);
        panel.add(SigninBotton);


    }
}
