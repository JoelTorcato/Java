 public static class Pessoa {
        String nome;
        char genero;
        int idade;

        public Pessoa(String n, char g){
            this.nome = n;
            this.genero = g;
        }

        public Pessoa(String n, char g, int i){
            this(n, g);
            this.idade = i;
        }
        void falar(){
            System.out.println("Olá o meu nome é " + nome);
        }
    }

    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa("Russel", 'M', 10);
        System.out.println("nome: " + pessoa1.nome);
        System.out.println("genero: " + pessoa1.genero);
        System.out.println("idade: " + pessoa1.idade);
        pessoa1.falar();

        java.util.Scanner sc = new java.util.Scanner(System.in);

        System.out.print("Introduza o nome da pessoa2: ");
        String nome2 = sc.nextLine();

        System.out.print("Introduza o género da pessoa2 (M/F): ");
        char genero2 = sc.nextLine().charAt(0);

        System.out.print("Introduza a idade da pessoa2: ");
        int idade2 = sc.nextInt();

        Pessoa pessoa2 = new Pessoa(nome2, genero2, idade2);

        System.out.println("nome: " + pessoa2.nome);
        System.out.println("genero: " + pessoa2.genero);
        System.out.println("idade: " + pessoa2.idade);

        pessoa2.falar();
        sc.close();
    }