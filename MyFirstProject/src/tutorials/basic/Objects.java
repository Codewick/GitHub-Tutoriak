package tutorials.basic;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Objects {
    public static void main(String[] args) {
    	//create a window
		JFrame window = new JFrame(); // creating a window variable that holds jFrame objects and creating a new jframe to assign to our variable
		
		window.setTitle("My Window");		//calling methods on our jframe object to configure it
		window.setSize(800, 600);
		window.setVisible(true);
		
        JLabel label = new JLabel();// label variable holds jlabel object
        label.setText("My Label");//calling settext method on our jlabel object to set its text properly
        
        window.add(label);//calling add method of our jframe object to add our label to the window
        
        String s = "hi";
        System.out.println(s);
	}
}
