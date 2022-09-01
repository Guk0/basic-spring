package hello.core.singleton;

public class SingletonService {
    private static final SingletonService instance = new SingletonService();

    public static SingletonService getInstance() {
        return instance;
    }

    private SingletonService() {
        // 생성자를 외부에서 호출할 수 없게 한다.
    }

    public void logic() {
        System.out.println("싱글턴 객체 로직 호출");
    }
}
