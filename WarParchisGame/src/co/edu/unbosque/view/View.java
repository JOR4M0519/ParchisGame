package co.edu.unbosque.view;

import javax.swing.*;

public class View extends JFrame{
	
	public View(){
		
	}
	
	
    public String inputWindows(String info, String title, int messageType) {

        return JOptionPane.showInputDialog(null, info, title, messageType);
    }

    public void exportConsole(String info) {
        System.out.println(info);
    }

    public void exportWindows(String info, String title, int messageType) {
        JOptionPane.showMessageDialog(null, info, title, messageType);
    }

    public boolean validationWindows(String info, String title) {
        int answer = JOptionPane.showConfirmDialog(null, info, title,
                JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (answer == 0) {
            return true;
        } else {
            return false;
        }
    }
}
