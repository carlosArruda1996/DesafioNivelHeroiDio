public class Heroi {

    private final String nome;
    private int exp;


    public Heroi(String nome, int exp){
        this.nome = nome;
        this.exp = exp;
    }

    public void farm(int xp){
        exp += xp;
    }

    public void nivelHeroi(){
        String nivel;
        if(exp < 1000){
            nivel = "Ferro";
            System.out.println("O Herói de nome:  " + nome + " tem: " + exp + " e esta no nivel " + nivel);
        }else if(exp >= 1001 && exp <= 2000){
            nivel = "Bronze";
            System.out.println("O Herói de nome:  " + nome + " tem: " + exp + " e esta no nivel " + nivel);
        }else if(exp >= 2001 && exp <= 5000){
            nivel = "Prata";
            System.out.println("O Herói de nome:  " + nome + " tem: " + exp + " e esta no nivel " + nivel);
        }else if(exp >= 5001 && exp <= 7000){
            nivel = "Ouro";
            System.out.println("O Herói de nome:  " + nome + " tem: " + exp + " e esta no nivel " + nivel);
        }else if(exp >= 7001 && exp <= 8000){
            nivel = "Platina";
            System.out.println("O Herói de nome:  " + nome + " tem: " + exp + " e esta no nivel " + nivel);
        }else if(exp >= 8001 && exp <= 9000){
            nivel = "Ascendente";
            System.out.println("O Herói de nome:  " + nome + " tem: " + exp + " e esta no nivel " + nivel);
        }else if(exp >= 9001 && exp <= 10000){
            nivel = "Imortal";
            System.out.println("O Herói de nome:  " + nome + " tem: " + exp + " e esta no nivel " + nivel);
        }else if(exp < 10001){
            nivel = "Radiante";
            System.out.println("O Herói de nome:  " + nome + " tem: " + exp + " e esta no nivel " + nivel);
        }
    }

}
