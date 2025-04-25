package controllers;

import models.Persona;

public class PersonaController {

    public Persona sortByDireccionCodigo(Persona[] personas){
        for (int i=0; i<personas.length;i++){
            int iM= i;
            for(int j=i+1;j<personas.length;j++){
                if(personas[j].compareCodigoDireccion(personas[i])){
                    iM=j;

                }
            }
            if(i!= iM){
                Persona aux= personas[iM];
                personas[iM]=personas[i];
                personas[i]=aux;
            }
        }
        return null;

    }

    public Persona findByCodigo(Persona[] personas, int codigo){
        int bajo=0;
        int alto= personas.length-1;

        while(bajo<=alto){
            int central=(bajo+alto)/2;
            int comparacion=Integer.compare(personas[central].getCodigoDireccion(),codigo);

            if(personas[central].equalsByCodigoDireccion(codigo)){

                return personas[central];
            }
                if(personas[central].compareCodigoDireccion(codigo)){
                    bajo=central+1;
                   
                } else {
                    alto=central-1; 
                }

            
            
        }
        return null;

    }
    
}
