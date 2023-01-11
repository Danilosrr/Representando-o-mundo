public class App {
    public static void main(String[] args) throws Exception {
        User usuario = new User();
        Book book = new Book("title","author",1,2023);

        usuario.setAge(24);
        usuario.setEmail("email@email.com");
        usuario.setName("Danilo");

        book.setChapters(new String[] { "javascript", "java" });
    }
}
