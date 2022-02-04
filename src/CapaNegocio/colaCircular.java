/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CapaNegocio;

import javax.swing.JOptionPane;

//Autor:Alexa

public class colaCircular {
    // ColaCircular.java

// Este programa utiliza arreglos para la representacion de Colas Circulares
// y se ejecuta en modo texto

// Compilar: javac ColaCircular.java
// Ejecutar: java ColaCircular
// ========================================================
 // Declaracion de la clase de la Cola Circular

    
private int _max; // Tamano maximo de la Cola Circular
private String _colacirc[]; // Declaracion del arreglo para almacenar la Cola Circular
private int _frente, _fin; // Inidicadores del inicio y final de la Cola Circular

        public colaCircular(int _max, String[] _cc, int _frnt, int _fin) {
            this._max = _max;
            this._colacirc = _cc;
            this._frente = _frnt;
            this._fin = _fin;
        }

        public colaCircular(int _max) {
            this._max = _max;
            this._colacirc=new String[_max];
            this._frente=-1;
            this._fin=-1;
        }

        public int Max() {
            return _max;
        }

        public void Max(int _max) {
            this._max = _max;
        }

        public String[] getColacirc() {
            return _colacirc;
        }

        public void Colacirc(String[] _colacirc) {
            this._colacirc = _colacirc;
        }

        public int Frente() {
            return _frente;
        }

        public void Frente(int _frente) {
            this._frente = _frente;
        }
        
        public String Colacirc(int i) {
            return _colacirc[i];
        }
        
        

        
        @Override
        public String toString() {
          String mostrar="";
int i=0;
if(_frente==-1) {
mostrar+="\nCola Circular vacia !!!";
}
else {
i=_frente;
do {
mostrar+=(i+1)+".-"+_colacirc[i]+"\n";
i++;
if(i==_max && _frente>_fin) i=0; // Reiniciar en cero (dar la vuelta)
}while(i!=_fin+1);
}

return mostrar;
        }

        
   



public boolean agregar(String dato) {
    
    
if((_fin==_max-1 && _frente==0) || (_fin+1==_frente)) {
JOptionPane.showMessageDialog(null,"La lista esta llena");
return true;
}
if(_fin==_max-1 && _frente!=0)
    _fin=0; 
else{
_colacirc[++_fin]=dato;
if(_frente==-1) 
    _frente=0;
    
}
return false;
}


public String  eliminar() {
String resp;
    if(_frente==-1) {
  resp="La cola esta vacia";
    return resp;
}
resp="Dato Eliminado= "+_colacirc[_frente];
    if(_frente==_fin) {
_frente=-1; _fin=-1;
}
if(_frente==_max) _frente=0; 
else _frente++;
return  resp;
}
}





    

