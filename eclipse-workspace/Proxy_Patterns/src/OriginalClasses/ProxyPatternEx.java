package OriginalClasses;
// 프록시는 어떠한 것(이를테면 네트워크 연결, 메모리 안의 커다란 객체, 파일, 또 복제할 수 없거나 수요가 많은 리소스)과도 인터페이스의 역할을 수행할 수 있다.
public class ProxyPatternEx {
	public static void main(String[] args) {
		System.out.println("***Proxy Pattern Demo***\n");
		Proxy px=  new Proxy();
		px.doSomeWork();
	}
}
