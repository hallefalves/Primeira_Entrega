package Entrega_01;

/* @author Hallef */

public class Interaction {

    public static void main(String[] args)
    {
        Warrior Dave = new Warrior("Dave", Feelings.CONFUSO);
        Mage Wulfric = new Mage ("Wulfric", Feelings.DESDEM);

        Dave.SayHiTo(Wulfric);
        Dave.AskFeels(Wulfric);
        Wulfric.SayHiTo(Dave);
        Wulfric.AskFeels(Dave);
        Dave.SayFeels();
        Wulfric.SayFeels();
        Dave.setFeelings(Feelings.IRRITACAO);
        Wulfric.setFeelings(Feelings.APAZIGUACAO);
        Dave.SayFeels();
        Wulfric.SayFeels();
        System.out.println("* Dave dá as costas a Wulfric *");
        Wulfric.setFeelings(Feelings.ATAQUE);
        Wulfric.SayFeels();
    }
}
