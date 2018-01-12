import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// 이벤트 핸들러 메소드에서 컴퍼넌트 제어 가능
public class GUIEvent2 extends Frame implements ActionListener{

	private static final long serialVersionUID = 1L;

	@Override
	public void actionPerformed(ActionEvent e){
		System.exit(0);
	}
	
	public GUIEvent2(String title) {
		super(title);
		setLayout(new FlowLayout());

		Button btn1 = new Button("프로그램 종료");

		add(btn1);

		btn1.addActionListener(this);
		setBounds(400, 100, 300, 300);
		setVisible(true);

	}

	public static void main(String[] args) {
		new GUIEvent2("GuIevent2");
	}

}
