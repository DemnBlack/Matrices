package com.company;

public class IMatrixWorkerIp implements IMatrixWorker {

    public void print(double[][] m) {
         for (int i = 0; i < m.length; i++){
             for(int j = 0; j < m[i].length; j++){
                 System.out.print(m[i][j] + " ");
             }
             System.out.print("\n" + "///////" + "\n");
         }

    }


    public boolean haveSameDimension(double[][] m1, double[][] m2) {
        if(m1.length == m2.length && m1[0].length == m2[0].length)
            return true;
        return false;
    }


    public double[][] add(double[][] m1, double[][] m2) {
        if(!haveSameDimension(m1 , m2)){
            return null;
        }

        double[][] mx = new double[m1.length][m1[0].length];
        for (int i = 0; i < m1.length; i++){
            for(int j = 0; j < m1[i].length; j++){
                mx[i][j] = m1[i][j] + m2[i][j];
            }
        }
        return mx;
    }


    public double[][] subtract(double[][] m1, double[][] m2) {
        if(!haveSameDimension(m1 , m2)){
            return null;
        }

        double[][] mx = new double[m1.length][m1[0].length];
        for (int i = 0; i < m1.length; i++){
            for(int j = 0; j < m1[i].length; j++){
                mx[i][j] = m1[i][j] - m2[i][j];
            }
        }
        return mx;
    }

    public double[][] multiply(double[][] m1, double[][] m2) {
        if(!(m1[0].length == m2.length)){
            return null;
        }

        double[][] mx = new double[m2.length][m1[0].length];
        for (int i = 0; i < mx.length; i++){
            for(int j = 0; j < mx[i].length; j++){
                for (int g = 0; g < m2[0].length; g++){
                        mx[i][j] += m1[g][i] * m2[j][g];

                }
            }
        }
        return mx;
    }

    public static void main(String[] args) {
       
    }
}
