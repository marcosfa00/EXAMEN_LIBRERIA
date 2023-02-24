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



Terminamos el código y lo probamos en la **Main** comprobando que funciona correctamente:

          try{
                   float radicando = num2;
                   int indice = (int) num1;
                   if(indice == 2){
                      resultado=(float) Math.sqrt(radicando);// Math.sqrt y Math.cbrt devuelven un double
                   } else if (indice == 3) {
                       resultado=(float) Math.cbrt(radicando);
                   }else{
                       System.out.println("Este índice no se contempla");
                   }

                }catch(NumberFormatException e){
                    System.out.println("Error al realizar la operación RAIZ");
                }

Prueba en la **Main**

     Float resultado = OperacionesBasicas.realizar(OperacionesBasicas.RAIZ,3,9);
        System.out.println(resultado);


### A POR EL 10

---

Para calcular la raíz de Cualquier número y no solo de 2 o 3 existe la siguiente Fórmula:

    raiz(n, x) = x^(1/n)

Asíq borraremos el código anterior y trataremos de aplicar la fórmula.

     try{
                   float radicando = num2;
                   int indice = (int) num1;
                  // raiz(n, x) = x^(1/n)
                    resultado= (float)  Math.pow(radicando, 1.0 / indice);

                }catch(NumberFormatException e){
                    System.out.println("Error al realizar la operación RAIZ");
                }
                break;

Este sería el nuevo código
y lo aplicamos por ejemplo con la raiz cuarta de 16 que debería devolver 2



    Float resultado = OperacionesBasicas.realizar(OperacionesBasicas.RAIZ,4,16);
    System.out.println(resultado);
        
       --> Consola: 2.0

Efectivamente comprobamos que funciona correctamente

TRAS HACER TODOS LOS CAMBIOS OPORTUNOS PROCEDEMOS A REALIZAR EL GIT MERGE CON
        
        --squash

Cambiamos a la Rama Main y hacemsos el merge

A continuación procedí ha hacer el **JavaDoc**

Para verlo puedes pinchar [Aquí](https://marcosfa00.github.io/EXAMEN_LIBRERIA/)


