//Sustentación Practica 1 Ude@
package agendabasica;

import java.util.Scanner;

public class AgendaBasica {
    
    public static void main(String[] args) {
        //PersonalData Datos = new PersonalData(); //Almacena Una persona
        PersonalData Datos[] = new PersonalData[100]; //Almacena 100 personas
        Scanner lector = new Scanner (System.in);
        int opc=0, contUs=0,band=0;  //contUs me permite saber cuantos usuarios hay en el sistema
        String name; //variable para actualizar, eliminar y buscar
        
        do{
            System.out.println("\nMENU PRINCIPAL"); 
            System.out.println("1. Ingresar Usuario");
            System.out.println("2. Actualizar Usuario");
            System.out.println("3. Eliminar Usuario");
            System.out.println("4. Buscar Usuario");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opcion: ");
            opc = lector.nextInt();
            
            switch (opc) {
                case 1:
                    if (contUs<99){
                        Datos[contUs] = new PersonalData();
                        System.out.println("\nINGRESO DE USUARIOS");
                        System.out.print("Digite el nombre del usuario: ");
                        Datos[contUs].setNombre(lector.next());
                        System.out.print("Digite el apellido: ");
                        Datos[contUs].setApellido(lector.next());
                        System.out.print("Digite la fecha de nacimiento: ");
                        Datos[contUs].setFecha(lector.next());
                        System.out.print("Digite cedula: ");
                        Datos[contUs].setCedula(lector.next());
                        System.out.print("Digite direccion: ");
                        Datos[contUs].setDireccion(lector.next());
                        System.out.print("Digite telefono: ");
                        Datos[contUs].setTelefono(lector.next());
                        System.out.print("Digite el nombre del areas: química, física, tecnología, cálculo o programación: ");
                        Datos[contUs].setAreas(lector.next());  
                        contUs++;
                    }
                    else
                        System.out.println("NO HAY MAS MEMORIA");
                    break;
                case 2:
                        System.out.println("\nACTUALIZAR DATOS ");
                        System.out.print("Digite el nombre a actualizar: ");
                        name = lector.next();
                        for (int i=0; i<contUs;i++){
                            if (name.equals(Datos[i].getNombre())){
                                band=1;
                                System.out.print("Digite direccion: ");
                                Datos[i].setDireccion(lector.next());
                                System.out.print("Digite telefono: ");
                                Datos[i].setTelefono(lector.next());
                                System.out.print("Digite el nombre del areas: química, física, tecnología, cálculo o programación: ");
                                Datos[i].setAreas(lector.next());  
                            }
                        }
                        if(band==0)
                            System.out.println("\nUSUARIO NO ENCONTRADO");
                        else
                            band=0;             
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    System.out.println("GRACIAS POR UTILIZAR EL PROGRAMA, BYE");
                    break;
                default:
                    System.out.println("\nOPCION INCORRECTA!\n");
                    break;                              
            }
        }while(opc!=5);
    }    
}
