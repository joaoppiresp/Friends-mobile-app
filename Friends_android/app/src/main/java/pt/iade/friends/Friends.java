package pt.iade.friends;

import java.util.ArrayList;

public class Friends
{
    // Atributos
    private String nome;
    private ArrayList<User> users;

    // Construtor
    public Friends(String nomeFriend)
    {
        this.nome = nomeFriend;
        users = new ArrayList<User>();
    }

    // inserir friend
    public void inserirFriend(User u){users.add(u);}

    // remover friend
    public void removerFriend(User u){users.remove(u);}

    // numero de friend
    public int numeroFriend(){return  this.users.size();}
}
