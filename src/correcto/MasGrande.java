/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package correcto;

/**
 *
 * @author rafae
 */
public class MasGrande {

    public static int max(int[] a) {
        int i, m = 0;
        if(a == null)
            throw new NullPointerException("Array nulo");
        else
        {
            for (i = 0; i < a.length; i++) {
                if(i==0)
                    m=a[i];

                if (a[i] > m) {
                    m = a[i];
                }
            }
            return m;
        }
    }
    
}
