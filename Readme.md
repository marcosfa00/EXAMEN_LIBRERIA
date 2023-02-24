# 2do EXAMEN LIBRERÍAS

---

Primero que todo añadimos todo a un repositorio y hacemos el primer commit

una vez configuradas las operaciones básicas

### Nueva Rama

---
Creamos una nueva Rama llamada **Raices** desde la cual haremso todos los commits y las modificaciones en la librería

        git branch raices
        git checkout raices


A continuación hago un comit donde se muesytra la situación antes de comenzar el ejercicio

Tras esto declaro una constante que se llame RAIZ, para que sea más legible el codigo, y esta constante será la que nos sirva de opción
a elegir cuando queramos seleccionar raiz

    /**
     * Eleción de operacion RAIZ
     * static final int RAIZ = 5;
     */
    static final int RAIZ = 5;

Tras esto en el código añado la opción, y para que se nos permita hacer cualquier tipo de raiz
solicito el **RADICANDO** y el **INDICE**;

    case RAIZ:
                try{
                   float radicando = EntradaSalida.EntradaFloat("De que numero quieres hacer la RAIZ?");
                   int indice = EntradaSalida.EmtradaInt("Cual es el índice de la raiz?");

                }catch(Exception e){
                    System.out.println("Error al hacer la RAIZ");
                }
                break;

