package taller3.televisores;
public class Control {
    TV tv;
    public void enlazar(TV t){
        tv=t;
        t.control=this;
    }
    public void turnOn(){
        tv.estado=true;
    }
    public void turnOff(){
        tv.estado=false;
    }
    public boolean getEstado(){
        return tv.estado;
    }

    public void canalUp(){
        tv.canalUp();
    }
    public void canalDown(){
        tv.canalDown();
    }

    public void volumenUp(){
        tv.volumenUp();
    }
    public void volumenDown(){
        tv.volumenDown();
    }

    public void setCanal(int c){
        tv.setCanal(c);
    }
    public void setVolumen(int v){
        tv.setVolumen(v);;
    }

    public TV getTv(){
        return tv;
    }

    public void setTv(TV t){
        tv=t;
    }
}
