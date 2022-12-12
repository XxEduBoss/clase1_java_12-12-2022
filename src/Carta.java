public class Carta {

    //Atributos --> propiedades que va a tener nuestro objeto
    private String palo;
    private String tipo;
    private String valor;


    //Constructores --> son métodos que nos sirven para crear una variable del tipo de mi objeto
    public Carta(){

    }

    public Carta(String palo, String tipo, String valor){
        this.palo = palo;
        this.tipo = tipo;
        this.valor = valor;
    }

    //Geters y Seters --> Métodos para consultar y modificar el valor de los aributos
    public String getPalo(){
        return this.palo;
    }
    public void setPalo(String palo){
        this.palo = palo;
    }

    public String getTipo(){
        return this.tipo;
    }
    public void setTipo(String tipo){
        this.tipo = tipo;
    }

    public Integer getValor(){
        return this.valor;
    }
    public void setValor(Integer valor){
        this.valor = valor;
    }

    //To String --> método para pintar un objeto
    public String toString(){
        return "carta-->" + this.palo + "_" + this.tipo + "_" + this.valor;
    }


    //Equals
    public boolean equals(Carta carta){
        return this.valor.equals(carta.getValor()) &&
                this.tipo.equals(carta.getTipo()) &&
                this.palo.equals(carta.getPalo());
    }

    //HashCode -->


}
