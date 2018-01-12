import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;

public class BorderLayoutMain extends Frame {
	private static final long serialVersionUID = 1L;

	public BorderLayoutMain(String title) {
		super(title);// ���� ����

		// btn1~5�̶�� ���۳�Ʈ ����
		Button btn1 = new Button("��ư-1");
		Button btn2 = new Button("��ư-2");
		Button btn3 = new Button("��ư-3");
		Button btn4 = new Button("��ư-4");
		Button btn5 = new Button("��ư-5");

		// �����̳�.setLayout(LayoutManager) : LayoutManager�� �����ϴ� �޼ҵ�
		// => Frame �����̳��� default LayoutManager�� BorderLayout�̹Ƿ� ���� ����.
		// BorderLayout : �� �� �� �� �߾ӿ� ���۳�Ʈ�� ��ġ�ϴ� Layout Ŭ����
		// ���⼭ this�� Frame
		// this.setLayout(new BorderLayout());

		//�����̳�.add(���۳�Ʈ, ������ġ) : �����̳ʿ� ���۳�Ʈ�� �����Ѵ�.
		// = > ������ġ�� BorderLayout�� ��쿡�� ���( �⺻ : �߾� )
		add(btn1,BorderLayout.CENTER);
		add(btn2,BorderLayout.EAST);
		add(btn3,BorderLayout.WEST);
		add(btn4,BorderLayout.SOUTH);
		add(btn5,BorderLayout.NORTH);
		
		setBounds(400, 100, 400, 400);
		setVisible(true);
	}

	public static void main(String[] args) {
		new BorderLayoutMain("Haha");
	}
}
