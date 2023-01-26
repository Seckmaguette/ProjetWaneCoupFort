package models;

public abstract class Personne {
    protected int id;
    protected String numero;
    protected String nomComplet;
    protected TypePersonne typePersonne;
    private static int nbr;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getNomComplet() {
        return nomComplet;
    }

    public Personne() {
        this.id = ++nbr;
    }

    public Personne(String numero, String nomComplet) {
        this.numero = numero;
        this.nomComplet = nomComplet;
        this.id = ++nbr;
       // this.typePersonne = typePersonne;
    }

    public TypePersonne getTypePersonne() {
        return typePersonne;
    }

    public void setTypePersonne(TypePersonne typePersonne) {
        this.typePersonne = typePersonne;
    }

    public void setNomComplet(String nomComplet) {
        this.nomComplet = nomComplet;
    }

    @Override
    public String toString() {
        return "Personne{" +
                "id=" + id +
                ", numero='" + numero + '\'' +
                ", nomComplet='" + nomComplet + '\'' +
                ", typePersonne=" + typePersonne +
                '}';
    }
}
