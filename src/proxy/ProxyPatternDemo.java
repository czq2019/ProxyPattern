package proxy;

public class ProxyPatternDemo {

	public static void main(String[] args) {
		Image image=new ProxyImage("test_10mb.jpg");
		//将图片从磁盘中加载
		image.diaplay();
		System.out.println("");
		//图片不需要从磁盘中加载
		image.diaplay();
	}
}
