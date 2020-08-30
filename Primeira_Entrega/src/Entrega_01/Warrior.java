package Entrega_01;

/* @author Hallef */
public class Warrior extends Person
{
    public Warrior(String nome, Feelings feelings)
    {
        super(nome, feelings);
    }

    @Override
    public void SayHiTo(Person person)
    {
        System.out.println(this.getNome()+": Eae espada enferrujada");
    }

    @Override
    public void AskFeels(Person person)
    {
        System.out.println(this.getNome()+": Juntas quebradas?");
    }
}
