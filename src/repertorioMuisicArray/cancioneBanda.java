package repertorioMuisicArray;

import java.util.ArrayList;

public class cancioneBanda extends ArrayList {

    private String nombreCancion;
    private int duraccionCancion;
    private  int calificaccion;

    public cancioneBanda(String nombreCancion, int duraccionCancion, int calificaccion) {
        this.nombreCancion = nombreCancion;
        this.duraccionCancion = duraccionCancion;
        this.calificaccion = calificaccion;
    }

    public String getNombreCancion() {
        return nombreCancion;
    }

    public void setNombreCancion(String nombreCancion) {
        this.nombreCancion = nombreCancion;
    }

    public int getDuraccionCancion() {
        return duraccionCancion;
    }

    public void setDuraccionCancion(int duraccionCancion) {
        this.duraccionCancion = duraccionCancion;
    }

    public int getCalificaccion() {
        return calificaccion;
    }

    public void setCalificaccion(int calificaccion) {
        this.calificaccion = calificaccion;
    }

    @Override
    public String toString() {
        return "cancioneBanda{" +
                "nombreCancion='" + nombreCancion + '\'' +
                ", duraccionCancion=" + duraccionCancion +
                ", calificaccion=" + calificaccion +
                '}';
    }
}
