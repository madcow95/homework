package Feb25;

public class Feb25_02 {

	public String PCode; // ��ǰ�ڵ�
	public String PName; // ��ǰ��
	public String itemN; // ǰ���
	public String depart; // �ŷ�ó
	public int iPrice; // ���Դܰ�
	public int oPrice; // ����ܰ�

	public void print(int i) {
		System.out.println("==========================");
		System.out.println((i + 1) + "��° ���α׷� ���� Ȯ��");
		System.out.println("==========================");
		System.out.printf("��ǰ�ڵ� : %s\n",this.PCode);
		System.out.printf("��ǰ�� : %s\n",this.PName);
		System.out.printf("�ŷ�ó : %s\n",this.depart);
		System.out.printf("ǰ�� : %s\n",this.itemN);
		System.out.printf("���Դܰ� : %s\n",this.iPrice);
		System.out.printf("����ܰ� : %s\n",this.oPrice);

	}
}
