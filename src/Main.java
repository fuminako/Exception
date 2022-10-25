public class Main {
    public static void main(String[] args) {
       boolean a = AuthorizationData.validate("asdasd", "waw", "wawwww");
       if (a){
           System.out.println("Данные верны");
       } else {
           System.out.println("Данные не верны");
       }
    }
}