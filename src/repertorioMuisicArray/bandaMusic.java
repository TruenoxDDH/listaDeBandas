package repertorioMuisicArray;


import java.util.ArrayList;

public class bandaMusic {

    private String NomBanda;
    private int Numintegrantes;
    private int AñoDeIni;
    private  String PrimerAlbum;

    private ArrayList <cancioneBanda> canciones ;

    public bandaMusic(String nomBanda, int numintegrantes, int añoDeIni, String primerAlbum , ArrayList canciones) {
        NomBanda = nomBanda;
        Numintegrantes = numintegrantes;
        AñoDeIni = añoDeIni;
        PrimerAlbum = primerAlbum;
        canciones = new ArrayList<>();
    }

    public void setCanciones(cancioneBanda c) {
        this.canciones.add(c);
    }

    public String getNomBanda() {
        return NomBanda;
    }

    public void setNomBanda(String nomBanda) {
        NomBanda = nomBanda;
    }

    public int getNumintegrantes() {
        return Numintegrantes;
    }

    public void setNumintegrantes(int numintegrantes) {
        Numintegrantes = numintegrantes;
    }

    public int getAñoDeIni() {
        return AñoDeIni;
    }

    public void setAñoDeIni(int añoDeIni) {
        AñoDeIni = añoDeIni;
    }

    public String getPrimerAlbum() {
        return PrimerAlbum;
    }

    public void setPrimerAlbum(String primerAlbum) {
        PrimerAlbum = primerAlbum;
    }

    @Override
    public String toString() {
        return "bandaMusic{" +
                "Nombre de la Banda='" + NomBanda + '\'' +
                ", Numumero de integrantes=" + Numintegrantes +
                ", Año de Inicio=" + AñoDeIni +
                ", Primer Album='" + PrimerAlbum + '\'' +
                '}';

    }
    public  void  imprimirCanciones(){
        for (int i=0;i < canciones.size();i++){
            cancioneBanda c = canciones.get(i);
            System.out.println(c.toString());

        }


    }
}
