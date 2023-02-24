/**
 * Librería de Operaciones Básicas
 * @author marcosfa
 * @version 1.0
 */
public class OperacionesBasicas {
    /**
     * private static FLOAT Resultado
     */
    private static Float resultado = null;
    /**
     * Elección de operación suma
     *  static final int SUMA = 1;
     */
    static final int SUMA = 1;
    /**
     *Elección de operación resta
     *      *  static final int RESTA = 1;
     */
    static final int RESTA = 2;
    /**
     * Elección de operación multiplicar
     *      *  static final int MULTIPLICACIÓN = 1;
     */
    static final int MULTIPLICACION = 3;
    /**
     * Elección de operación DIVIDIR
     *      *  static final int DIVIDIR = 1;
     */
    static final int DIVISION = 4;


    public static Float realizar(int device, float num1, float num2){

        switch (device){
            case SUMA:
                try{
                    resultado = num1 + num2;
                }catch (Exception e){
                    System.out.println("Error en la Suma");
                }
                break;
            case RESTA:
                try{
                    resultado = num1 - num2;
                }catch (Exception e){
                    System.out.println("Error en la resta");
                }
                break;
            case MULTIPLICACION:
                try{
                    resultado = num1*num2;
                }catch (Exception e){
                    System.out.println("Error en la multiplicación");
                }
                break;
            case DIVISION:
                try{
                    resultado = num1/num2;
                }catch (Exception e){
                    System.out.println("Error en la división");
                }
                break;
        }
        return resultado;
    }
}
