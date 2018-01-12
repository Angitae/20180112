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

		// Frame ���ʿ� ������ ���۳�Ʈ
		Button btn1 = new Button("������");
		Button btn2 = new Button("���λ�");
		Button btn3 = new Button("�����");

		Panel panel = new Panel();
		// panel.setLayout(new FlowLayout());
		// default�� �����Ǿ��־ ������ �ʿ� X

		panel.add(btn1);
		panel.add(btn2);
		panel.add(btn3);

		// Frame �߾ӿ� ������ ���۳�Ʈ
		TextArea ta = new TextArea();

		// Frame ���ʿ� ������ ���۳�Ʈ
		TextField tf = new TextField();

		// ���۳�Ʈ ������ ����
		btn1.setBackground(new Color(255, 0, 0));
		btn2.setBackground(Color.GREEN);
		btn3.setBackground(Color.YELLOW);

		panel.setBackground(Color.GRAY);

		tf.setBackground(Color.BLACK);

		// ���۳�Ʈ ���ڻ��� ����
		tf.setForeground(Color.WHITE);

		// �۲� ����
		ta.setFont(new Font("����", Font.BOLD, 20));
		tf.setFont(new Font("���", Font.ITALIC + Font.BOLD, 15));

		panel.setFont(new Font("����", Font.BOLD, 16));

		// ���۳�Ʈ ��Ȱ��ȭ
//		ta.setEnabled(false);
		// Text Component������ ��밡��
//		ta.setEditable(false);
		
		ta.setFocusable(false); // ��Ŀ���� ��ġ���� �ʵ��� ����
		
		
		// ���۳�Ʈ�� Frame�� ����
		add(panel, BorderLayout.NORTH);
		add(ta, BorderLayout.CENTER);
		add(tf, BorderLayout.SOUTH);

		
		setResizable(false); // â ũ�� ���� �Ұ�(Frame ũ�� ���� �Ұ�)
		
		setBounds(400, 100, 400, 400);
		setVisible(true);
	}

	public static void main(String[] args) {
		new PanelMain("Panel");
	}
}
