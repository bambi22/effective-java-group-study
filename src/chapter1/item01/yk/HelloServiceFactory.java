package chapter1.item01.yk;

import java.util.Optional;
import java.util.ServiceLoader;

public class HelloServiceFactory {

    public static void main(String[] args) {
        /*
        * 정적 팩토리 매서드 장점
        * 3. 하위 타입 객체를 반환할 수 있다.
        * 4. 매개변수에 따라 다른 클래스의 객체를 반환할 수 있다.
        * */

        HelloService helloServiceKo = HelloService.of("ko");
        System.out.println(helloServiceKo.hello());
        HelloService helloServiceEng = HelloService.of("eng");
        System.out.println(helloServiceEng.hello());
        
        /*
         * 정적 팩토리 매서드 장점
         * 5. 구현체가 없어도 된다.
         * -> 서비스 제공자 이용
         * -> 구현체에 의존적이지 않음
         * -> 유연성이 높다.
         * */

        ServiceLoader<HelloService> loader = ServiceLoader.load(HelloService.class);
        // ServiceLoader는 Iterable로 HelloService의 구현체를 가져온다.

        Optional<HelloService> helloServiceOptional = loader.findFirst();
        helloServiceOptional.ifPresent(h -> System.out.println(h.hello())
        );
    }

}
