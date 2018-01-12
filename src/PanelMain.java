import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;

public class PanelMain extends Frame {

	private static final long serialVersionUID = 1L;

	public PanelMain(String title) {
		super(title);

		// Frame 북쪽에 부착될 컴퍼넌트
		Button btn1 = new Button("빨간색");
		Button btn2 = new Button("연두색");
		Button btn3 = new Button("노란색");

		Panel panel = new Panel();
		// panel.setLayout(new FlowLayout());
		// default로 설정되어있어서 변경할 필요 X

		panel.add(btn1);
		panel.add(btn2);
		panel.add(btn3);

		// Frame 중앙에 부착될 컴퍼넌트
		TextArea ta = new TextArea();

		// Frame 남쪽에 부착될 컴퍼넌트
		TextField tf = new TextField();

		// 컴퍼넌트 배경색을 변경
		btn1.setBackground(new Color(255, 0, 0));
		btn2.setBackground(Color.GREEN);
		btn3.setBackground(Color.YELLOW);

		panel.setBackground(Color.GRAY);

		tf.setBackground(Color.BLACK);

		// 컴퍼넌트 글자색을 변경
		tf.setForeground(Color.WHITE);

		// 글꼴 변경
		ta.setFont(new Font("굴림", Font.BOLD, 20));
		tf.setFont(new Font("고딕", Font.ITALIC + Font.BOLD, 15));

		panel.setFont(new Font("굴림", Font.BOLD, 16));

		// 컴퍼넌트 비활성화
//		ta.setEnabled(false);
		// Text Component에서만 사용가능
//		ta.setEditable(false);
		
		ta.setFocusable(false); // 포커스가 위치하지 않도록 설정
		
		
		// 컴퍼넌트를 Frame에 부착
		add(panel, BorderLayout.NORTH);
		add(ta, BorderLayout.CENTER);
		add(tf, BorderLayout.SOUTH);

		
		setResizable(false); // 창 크기 변경 불가(Frame 크기 변경 불가)
		
		setBounds(400, 100, 400, 400);
		setVisible(true);
	}

	public static void main(String[] args) {
		new PanelMain("Panel");
	}
}
