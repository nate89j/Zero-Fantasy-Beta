package paladins.beta;

import java.awt.FlowLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.TitledBorder;

/**
 *
 * @author mtsir
 */
public class WindowsBoxes extends JFrame implements ActionListener {

    private JFrame mainBoard = new JFrame("Zero Fantasy");
    private String[] heroChoices = {"Warrior","Wizard","Hunter"};
    private JComboBox choiceList = new JComboBox(heroChoices);
    private JLabel lblText    = new JLabel();
    private JLabel introLabel;
    
    public WindowsBoxes() {
        super("Zero Fantasy");              //parrent class JFrame
        setLayout(new FlowLayout());
        setSize(300, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        introLabel = new JLabel("Introduction...Story telling.. ");
        introLabel.setToolTipText("Shows up on hover");
        add(introLabel);
        
        
        choiceList.setSelectedIndex(1);             //index starts from 0
        choiceList.addActionListener(this);        //catch whatever the user selects

        add(choiceList);
        add(lblText);
        
    }
  
    @Override
    public void actionPerformed(ActionEvent e) {
      //check if the choise selected is on the list and show the appropriate msg
        if (e.getSource()== choiceList){
            JComboBox cb = (JComboBox) e.getSource();
            String msg = (String) cb.getSelectedItem();
            switch(msg){
                case "Warrior":
                    lblText.setText("You selected the Warrior.");
                    break;
                case "Wizard":
                    lblText.setText("You selected the Wizard.");
                    break;
                case "Hunter":
                    lblText.setText("You selected the Hunter.");
                    break;
                default:
                    lblText.setText("This is an empty choice!");
            }
       
       }     
    }
    
}
