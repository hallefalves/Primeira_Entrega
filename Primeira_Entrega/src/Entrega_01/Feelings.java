package Entrega_01;
/* @author Hallef */

public enum Feelings {

    DESDEM("Oh nobre cavaleiro destemido, não carregando nada mais na cabeça que a batalha, suma deste lugar"),
    CONFUSO("Não entendo o que dizes, velho grisalho"),
    IRRITACAO("Pode vir velhote, vou te descer a porrada"),
    APAZIGUACAO("Tenha pena de um pobre ancião amigo!!!"),
    ATAQUE("Mas nunca vire as costas para um...");

    private String descricao;
    Feelings(String descricao)
    {
        this.descricao = descricao;
    }

    public String getDescricao()
    {
        return descricao;
    }
}
