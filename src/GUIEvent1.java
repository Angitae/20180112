import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//��ư ���۳�Ʈ�� ���� ��� ���α׷� ����
public class GUIEvent1 extends Frame {
	private static final long serialVersionUID = 1L;

	public GUIEvent1(String title) {
		super(title);

		// ��ư�� �̺�Ʈ �ҽ��� �ȴ�.
		Button btn1 = new Button("Exit");
		// Button btn2 = new Button("��ư1");
		// Button btn3 = new Button("��ư1");
		setLayout(new FlowLayout());
		add(btn1);

// �̺�Ʈ �ҽ����� �̺�Ʈ�� �߻��� ��� 
// �̺�Ʈ �ڵ鷯�� �޼ҵ尡 ȣ��ǵ��� �ۼ��Ѵ�.
// => addActionListener(�̺�Ʈ �ڵ鷯 �ν��Ͻ�)	�޼ҵ� ȣ��
		
		btn1.addActionListener(new ButtonEventHandler());
		
		setVisible(true);
		setBounds(400, 200, 300, 300);
	}

	public static void main(String[] args) {
		new GUIEvent1("GUI");
	}
}
// �̺�Ʈ �ڵ鷯 : �̺�Ʈ�� ó���ϱ� ���� �޼ҵ尡 ����� Ŭ����
// ��ư�� ������ �̺�Ʈ�� ó�� => ActionEvent �߻� => ActionListener(�������̽�)�� ��ӹ޾� ó��
class ButtonEventHandler implements ActionListener {
	// Listener �������̽��� �޼ҵ带 �������̵��Ͽ� �̺�Ʈ ó��
	// => �̺�Ʈ�� ������ ��� �̺�Ʈ ó�� �޼ҵ� �ڵ� ȣ��
	@Override
	public void actionPerformed(ActionEvent e) {
		System.exit(0);
	}
}