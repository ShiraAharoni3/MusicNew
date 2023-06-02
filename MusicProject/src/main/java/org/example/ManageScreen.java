package org.example;
import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class ManageScreen extends JFrame
{
    int x = 10 ;
    int y = 20 ;

    private JComboBox<String> yearsComboBox;

    public ManageScreen()
    {
            this.setSize(Utils.WIDTH, Utils.HEIGHT);
            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            this.setResizable(false);
            this.setLocationRelativeTo(null);
            this.setVisible(true);
            JLabel survivedLabel = new JLabel("Passenger Class: ");
            survivedLabel.setBounds(3, y, Utils.LABEL_WIDTH, Utils.LABEL_HEIGHT);
            //this.add(survivedLabel);
            this.yearsComboBox = new JComboBox<>(Utils.PASSENGER_CLASS_OPTIONS);
            this.yearsComboBox.setBounds(x + Utils.FIRST_LINE_MARGIN_FROM_LEFT ,  y,Utils.LABEL_WIDTH, Utils.LABEL_HEIGHT);
            this.add(this.yearsComboBox);
            this.yearsComboBox.addActionListener((e) ->
            {

            });
            /*this.yearsComboBox.addActionListener((e) -> {
            String ClassNumber = this.yearsComboBox.getItemAt(this.yearsComboBox.getSelectedIndex());
            /*if (ClassNumber.equals(Constants.PASSENGER_CLASS_OPTIONS[1])) {
                this.PassengerClassNumber = 1;
            } else if (ClassNumber.equals(Constants.PASSENGER_CLASS_OPTIONS[2])) {
                this.PassengerClassNumber = 2;
            } else if (ClassNumber.equals(Constants.PASSENGER_CLASS_OPTIONS[3])) {
                this.PassengerClassNumber = 3;
            } else if (ClassNumber.equals(Constants.PASSENGER_CLASS_OPTIONS[0])) {
                this.PassengerClassNumber = 0;
            }
            System.out.println((this.PassengerClassNumber));
        });*/
        }

 }


