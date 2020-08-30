package Entrega_01;

/* @author Hallef */

public class Mage extends Person
{
    public Mage(String nome, Feelings feelings)
    {
        super(nome, feelings);
    }

    @Override
    public void SayHiTo(Person person)
    {
        System.out.println(this.getNome()+": Salve inepta");
    }

    @Override
    public void AskFeels (Person person)
    {
        System.out.println(this.getNome()+": Quam operor vos sentio?");
    }

}
