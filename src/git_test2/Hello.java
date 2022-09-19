package git_test2;

public class Hello {

<<<<<<< HEAD
    String message;

    public Hello() {
        this("안녕하세요");
    }

    public Hello(String message) {
        this.message = message;
    }

    public void say() {
        System.out.println(message);
=======
    String message = "안녕하세요";

    public void say() {
        Sysyem.out.println(message);
>>>>>>> 6203d35793bfd729c72cc547aeb72bfca84e5571
    }

}
