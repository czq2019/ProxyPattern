package proxy;

public class ProxyPatternDemo {

	public static void main(String[] args) {
		Image image=new ProxyImage("test_10mb.jpg");
		//��ͼƬ�Ӵ����м���
		image.diaplay();
		System.out.println("");
		//ͼƬ����Ҫ�Ӵ����м���
		image.diaplay();
	}
}
