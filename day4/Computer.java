class  Computer{
	int memory=256;

	public void turnOn(){
		 System.out.println("��ǻ�͸� �մϴ�.");
	}
	public static void main(String[] args){
		int k=5;
		Computer c=new Computer();
		System.out.println(c.memory);
		System.out.println("k�� ����" +k);
		//c�� k�ʹ� Ʋ���� �����͸� ���� ���� �ʰ�,
		//��ü �������� �޸𸮻��� ��ġ �� �ּҰ�����
		//�����ϰ� �ִٰ� �Ͽ�, reference (����) ������� �Ѵ�!!
		System.out.println("c�� ����"+c);

	}
}