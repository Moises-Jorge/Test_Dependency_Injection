public class Main {
    public static void main(String[] args) {
        // Por final, basta adicionar o argumento do novo parámetro passado no construtor da classe Post. Assim, a dependência passa ser controlada pelo método principal.
        Post novoPost = new Post("Aprendendo Injecao de Dep!", new Notificador2());
        novoPost.publicar();
    }
}
