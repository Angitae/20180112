import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;

public class GridLayoutMain extends Frame{

	private static final long serialVersionUID = 1L;

	public GridLayoutMain(String title) {
		super(title);
		Button btn1 = new Button("버튼-1");
		Button btn2 = new Button("버튼-2");
		Button btn3 = new Button("버튼-3");
		Button btn4 = new Button("버튼-4");
		Button btn5 = new Button("버튼-5");
		Button btn6 = new Button("버튼-6");
	
		// GridLayout : 행렬 방식으로 컴퍼넌트 부착이 된다. 
	setLayout(new GridLayout(3,2));
	
	add(btn1);
	add(btn2);
	add(btn3);
	add(btn4);
	add(btn5);
	add(btn6);
	
	setBounds(400,100,400,400);
	setVisible(true);
		
	}
	public static void main(String[] args) {
		new GridLayoutMain("gridLayout");
	}
}
