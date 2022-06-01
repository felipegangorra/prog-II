public class IdadePreferencial {
    public static void main(String[] args) {    //definindo uma função
        int idade = 20;
        
        if (idade >= 60) {
            System.out.println("Você tem " + idade + " anos. Você pode usar o atendimento especial.");
        } else {
            System.out.println("Você tem " + idade + " anos. Você ainda não pode usar o atendimento especial.");
        }
    }
}
