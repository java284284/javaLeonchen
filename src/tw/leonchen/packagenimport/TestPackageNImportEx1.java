package tw.leonchen.packagenimport;

import javax.swing.JButton;
import javax.swing.JFrame;

public class TestPackageNImportEx1 {

	public static void main(String[] args) {
		JFrame f = new JFrame("FunnyGame");
		f.add(new JButton("Press Me"));
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(350, 400);
        f.setVisible(true);
	}

}
