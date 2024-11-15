package taller3.televisores;
 
public class TV {
    private Marca marca;
    int canal=1;
    private int precio=500;
    boolean estado;
    int volumen=1;
    Control control;
    private static int numTV=0;
    public TV(Marca m, boolean est){
        if (est==true) {
            estado=true;
        }
        else{
            estado=false;
        }
        marca=m;
        numTV++;
    }
    
    public void setMarca(Marca m){
        marca=m;
    }
    public void setCanal(int c){
        canal=c;
    }
    public void setPrecio(int p){
        precio=p;
    }
    public void setVolumen(int v){
        volumen=v;
    }
    public void setControl(Control con){
        control=con;
    }

    public Marca getMarca(){
        return marca;
    }
    public int getCanal(){
        return canal;
    }
    public int getPrecio(){
        return precio;
    }
    public int getVolumen(){
        return volumen;
    }
    public Control getControl(){
        return control;
    }

    public void canalUp(){
        if (canal>0 && canal<=120 && estado==true) {
            canal++;
        }
    }
    public void canalDown(){
        if (canal>=0 && canal<=120 && estado==true) {
            canal--;
        }
    }

    public void volumenUp(){
        if (volumen>=0 && volumen<=7 && estado==true) {
            volumen++;
        }
    }
    public void volumenDown(){
        if (volumen>=0 && volumen<=7 && estado==true) {
            volumen--;
        }
    }

    public void turnOn(){
        estado=true;
    }
    public void turnOff(){
        estado=false;
    }

    public boolean getEstado(){
        return estado;
    }
    public static int getNumTV(){
        return numTV;
    }
    public static void setNumTV(int n){
        numTV=n;
    }
}
