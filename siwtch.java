import javax.swing.*;
import java.lang.*;
public class siwtch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int H,B,tw,tf;
		H=Integer.parseInt(JOptionPane.showInputDialog("Ingresa la altura:"));
		B=Integer.parseInt(JOptionPane.showInputDialog("Ingresa el ancho:"));
		tw=Integer.parseInt(JOptionPane.showInputDialog("Ingresa espesor del alma:"));
		tf=Integer.parseInt(JOptionPane.showInputDialog("Ingresa espesor del ala:"));
		
		double rz=H/B;
		int i;
		if (rz<1) {
			i=1;
		}
		else {
				i=2;
			}
		switch (i) {
		case 1:
			System.out.println("Aumenta la altura.");
		case 2:
			System.out.println("Dimension correcta.");
			
		
		}
	}

}
