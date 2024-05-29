public class Post {

    public String titulo;

    private INotificador notificador; // Cria-se esse atributo privado para se alcançar a INJEÇÃO DE DEPENDÊNCIA

    // E posteriormente, passa-se ele como parámetro do CONSTRUTOR
    public Post(String titulo, INotificador notificador){
        this.titulo = titulo;
        this.notificador = notificador;
        
        System.out.println("Novo Post: " + titulo);
    }

    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void publicar() {
        System.out.println("Publicando Post!");
        // Aqui, conseguimos ter acesso aos métodos da classe "Notificador" sem ter que instanciar ela directamente.
        this.notificador.enviar();
    }

}

// <DEPENDENCIA>: INSTANCIAMOS DIRECTAMENTE a "classe NOTIFICADOR" DENTRO da "class POST".  Toda vez que esse metodo for invocado, uma nova instancia de Notificador sera criada. E isso pode causa serios problemas de FORTE ACOPLAMENTO e BAIXA COESAO
    // Notificador notificador = new Notificador();
    // notificador.enviar();
// </DEPENDENCIA>