package chapter1.item01.yk;

public interface HelloService {
    String hello();

    /*
    * Java 9부터 private 정적 메서드 가능
    *
    * */
    static HelloService of(String lang) {
        if (lang.equals("ko")) {
            return new KoreaHelloService();
        } else {
            return new EnglishHelloService();
        }
    }
}
