package Entrega_01;

/* @author Hallef */

public class Person
{
    private  String nome;

    public String getNome()
    {
        return  nome;
    }

    public void setNome (String nome)
    {
        this.nome = nome;
    }

    private Feelings feelings;

    public Feelings getFeelings()
    {
        return feelings;
    }

    public void setFeelings (Feelings feelings)
    {
        this.feelings = feelings;
    }

    public Person (String nome, Feelings feelings)
    {
        this.setNome(nome);
        this.setFeelings(feelings);
    }

    public void SayHiTo (Person person)
    {
        System.out.println(this.getNome() + "Bom dia!");
    }

    public void AskFeels(Person person)
    {
        System.out.println(this.getNome() + "Tudo bem?");
    }

    public void SayFeels()
    {
        System.out.println(this.getNome()+ ": " + this.getFeelings().getDescricao());
    }
}
