import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


// �پ��� �̺�Ʈ ó���� �����ϸ� ���۳�Ʈ ���� ����
public class GUIEvent3 extends Frame  {
	
	public GUIEvent3(String title) {
		super(title);
		
		Button btn1 = new Button("���α׷� ����");
		setLayout(new FlowLayout());
		add(btn1);

		btn1.addActionListener(new ButtonInnerEventHandler());
		
		setBounds(400, 100, 300, 300);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new GUIEvent3("event3");
	}
	
//	public void actionPerformed(ActionEvent e){
//		System.exit(0);
//	}
	
	
	// Inner Class : Ŭ���� �ȿ� ����� Ŭ����
	// => Outer Class(�ܺ� Ŭ����)�� �ʵ� �� �޼ҵ� ���� ����
	public class ButtonInnerEventHandler implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e){
			System.exit(0);
		}
	}
}
