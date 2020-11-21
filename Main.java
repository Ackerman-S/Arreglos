package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int a[],b[],c[];
        int i,j;
        a=new int[12];
        b=new int[12];
        c=new int[24];
        System.out.println("\t\tDATOS INGRESADOS");
        System.out.println("\nINGRESE PRIMER ARREGLO(A)");
        for(i=0; i<12; i++){
            System.out.print((i+1)+"-NUMERO INGRESADO:");
            a[i]=entrada.nextInt();

        }
        System.out.println("\nINGRESE SEGUNDO ARREGLO(B)");
        for(i=0; i<12; i++){
            System.out.print((i+1)+"-NUMERO INGRESADO:");
            b[i]=entrada.nextInt();

        }

        j=0;
        i=0;

        while(i<12)
        {
            for (int s=0; s<3; s++)
            {
                c[j]=a[i+s];
                j++;
            }
            for(int s=0; s<3; s++)
            {
                c[j]=b[i+s];
                j++;
            }
            i+=3;

        }

        System.out.println("\nRESULDADO DE LOS ELEMENTOS INGRESADOS (C)");
        for(j=0; j<24; j++)
            System.out.print(c[j]+" ");
        System.out.println("");

    }

}
